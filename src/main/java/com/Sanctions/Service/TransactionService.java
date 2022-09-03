package com.Sanctions.Service;

import java.util.List;

import com.Sanctions.model.Transactions;

public interface TransactionService {
	List<Transactions> getAllTransactions();
	void SanctionTransaction(Transactions transaction);
	boolean checkIfValid(Transactions transaction);
}
