package com.Sanctions.model;

import javax.persistence.*;

@Entity
@IdClass(keywordId.class)
@Table(name = "keywords")
public class Keywords {
	@Id
	@Column(name = "name")
	private String name;
	
	@Id
	@Column(name = "AccountNo")
	private String AccountNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNo() {
		return AccountNo;
	}

	public void setAccountNo(String accountNo) {
		AccountNo = accountNo;
	}
	
}
