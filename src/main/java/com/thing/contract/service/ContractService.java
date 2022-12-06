package com.thing.contract.service;

import com.thing.contract.dto.ContractDto;

import java.util.List;

public interface ContractService {

    public ContractDto getContract(long id);

    public void createContract(int clientIndex, int itemId);

    public List<ContractDto> getContractListByClientIndex(int clientIndex);
}
