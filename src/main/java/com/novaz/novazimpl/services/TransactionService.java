package com.novaz.novazimpl.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.novaz.novazimpl.entities.*;
import com.novaz.novazimpl.repositories.TransactionRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public Optional<Transaction> getTransactionById(Long transactionId) {
        return transactionRepository.findById(transactionId);
    }

    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public Transaction updateTransaction(Long transactionId, Transaction transactionDetails) {
        return transactionRepository.findById(transactionId).map(transaction -> {
            transaction.setBuyer(transactionDetails.getBuyer()); // Update the Trader object directly
            transaction.setSeller(transactionDetails.getSeller()); // Update the Trader object directly
            transaction.setToken(transactionDetails.getToken());
            transaction.setTransactionAmount(transactionDetails.getTransactionAmount());
            transaction.setDate(transactionDetails.getDate());
            transaction.setTransactionFee(transactionDetails.getTransactionFee());
            return transactionRepository.save(transaction);
        }).orElseThrow(() -> new RuntimeException("Transaction not found"));
    }

    public void deleteTransaction(Long transactionId) {
        transactionRepository.deleteById(transactionId);
    }
}
