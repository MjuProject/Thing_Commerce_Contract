package com.example.orderservice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ContractRepository extends JpaRepository<ContractEntity, Long> {
    List<ContractEntity> findByClientIndex(int clientIndex);
}
