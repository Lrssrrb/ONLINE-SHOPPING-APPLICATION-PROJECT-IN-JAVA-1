package com.masai.reopsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.entity.Bank;


@Repository
public interface BankDao extends JpaRepository<Bank, Integer>{

}
