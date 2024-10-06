package com.novaz.novazimpl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.novaz.novazimpl.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    // Additional custom queries (if needed) can be defined here
}
