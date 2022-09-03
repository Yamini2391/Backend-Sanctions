package com.Sanctions.model;

import javax.persistence.*;

@Entity
@Table(name = "Transactions")
public class Transactions{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int TransactionRefNo;
	
	public int getTransactionRefNo() {
		return TransactionRefNo;
	}

	public void setTransactionRefNo(int transactionRefNo) {
		TransactionRefNo = transactionRefNo;
	}

	public String getPayerName() {
		return PayerName;
	}

	public void setPayerName(String payerName) {
		PayerName = payerName;
	}

	public String getPayerAccountNo() {
		return PayerAccountNo;
	}

	public void setPayerAccountNo(String payerAccountNo) {
		PayerAccountNo = payerAccountNo;
	}

	public String getPayeeName() {
		return PayeeName;
	}

	public void setPayeeName(String payeeName) {
		PayeeName = payeeName;
	}

	public String getPayeeAccountNo() {
		return PayeeAccountNo;
	}

	public void setPayeeAccountNo(String payeeAccountNo) {
		PayeeAccountNo = payeeAccountNo;
	}

	public boolean isValidateStatus() {
		return ValidateStatus;
	}

	public void setValidateStatus(boolean validateStatus) {
		ValidateStatus = validateStatus;
	}

	public boolean isSanctionStatus() {
		return SanctionStatus;
	}

	public void setSanctionStatus(boolean sanctionStatus) {
		SanctionStatus = sanctionStatus;
	}

	@Column(name = "ValueDate")
	private String Date;

	@Column(name = "PayerName")
	private String PayerName;
	
	@Column(name = "PayerAccountNo")
	private String PayerAccountNo;
	
	@Column(name = "PayeeName")
	private String PayeeName;
	
	@Column(name = "PayeeAccountNo")
	private String PayeeAccountNo;
	
	@Column(name = "Amount")
	private String Amount;
	
	@Column(name = "ValidateStatus" )
	private boolean ValidateStatus;
	
	@Column(name = "SanctionStatus" )
	private boolean SanctionStatus;


	
}