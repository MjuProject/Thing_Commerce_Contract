package com.example.orderservice.controller;

import com.example.orderservice.dto.ApiResponseDto;
import com.example.orderservice.dto.ContractDto;
import com.example.orderservice.service.ContractService;
import com.example.orderservice.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contracts")
public class ContractController {

    KafkaProducer kafkaProducer;
    ContractService contractService;

    @Autowired
    public ContractController(KafkaProducer kafkaProducer, ContractService contractService){
        this.kafkaProducer = kafkaProducer;
        this.contractService = contractService;
    }

    @GetMapping("/{contractId}")
    public ApiResponseDto getContract(@PathVariable("contractId") long contractId){
        ContractDto contractDto = contractService.getContract(contractId);
        return ApiResponseDto.success(contractDto);
    }

    @PostMapping("/clients/{client-index}/items/{item-id}")
    public ApiResponseDto createContract(@PathVariable("client-index")int clientIndex, @PathVariable("item-id")int itemId){
        contractService.createContract(clientIndex, itemId);
        kafkaProducer.send("itemSold_topic", itemId);
        return  ApiResponseDto.success();
    }

    @GetMapping("/clients/{client-index}")
    public ApiResponseDto getContractListByClientIndex(@PathVariable("client-index")int clientIndex){
        List<ContractDto> contractDtoList = contractService.getContractListByClientIndex(clientIndex);
        return ApiResponseDto.success();
    }

}
