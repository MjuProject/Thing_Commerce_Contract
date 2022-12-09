package com.thing.contract.jpa;

import com.thing.contract.domain.ContractEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContractRepository extends JpaRepository<ContractEntity, Long> {
    List<ContractEntity> findByClientIndex(int clientIndex);
}
