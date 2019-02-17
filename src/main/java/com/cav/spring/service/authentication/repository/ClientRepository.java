package com.cav.spring.service.authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cav.spring.service.authentication.entity.BankClient;


public interface ClientRepository extends JpaRepository<BankClient, Long> {

}
