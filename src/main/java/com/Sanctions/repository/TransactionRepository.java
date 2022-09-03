package com.Sanctions.repository;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.Sanctions.model.Transactions;

public interface TransactionRepository extends JpaRepository<Transactions, Integer> {
	@Modifying
	@Query("update transactions inner join keywords k1 on (transactions.payee_name = k1.name and transactions.payee_account_no = k1.account_no) or (transactions.payer_name = k1.name and transactions.payer_account_no = k1.account_no) set sanction_status = if( (transactions.payee_name = k1.name and transactions.payee_account_no = k1.account_no) or (transactions.payer_name = k1.name and transactions.payer_account_no = k1.account_no) ,1,0) where validate_status = 1;")
	void sanctiontransactions();
}
