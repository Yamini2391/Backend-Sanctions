package com.Sanctions.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sanctions.model.Transactions;
import com.Sanctions.repository.TransactionRepository;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private TransactionRepository transactionRepository;
	@Override
	public List<Transactions> getAllTransactions() {
		return transactionRepository.findAll();
	}

	@Override
	public void SanctionTransaction(Transactions transaction) {
		transactionRepository.sanctiontransactions();
	}
	
	@Override
	public boolean checkIfValid(Transactions transaction) {
		return transaction.isValidateStatus();
	}

}
