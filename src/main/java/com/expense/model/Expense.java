package com.expense.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
@Entity
@Table(name = "expense_table")
public class Expense {
	public Expense() {
	}

	public Expense(Date expenseDate, String item, BigDecimal amount, String itemType) {
		this.expenseDate = expenseDate;
		this.item = item;
		this.amount = amount;
		this.itemType = itemType;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Expense_Id")
	private int expenseId;
	@Column(name = "Expense_Date")
	private Date expenseDate;
	@Column(name = "Item")
	private String item;
	@Column(name = "Amount")
	private BigDecimal amount;
	@Column(name = "Item_Type")
	private String itemType;
	public int getExpenseId() {
		return expenseId;
	}
	public void setExpenseId(int expenseId) {
		this.expenseId = expenseId;
	}
	public Date getExpenseDate() {
		return expenseDate;
	}
	public void setExpenseDate(Date expenseDate) {
		this.expenseDate = expenseDate;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

}
