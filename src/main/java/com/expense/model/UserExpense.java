package com.expense.model;

import java.util.List;

public class UserExpense {

	private User user;
	private List<Expense> expenses;

	public UserExpense() {
		super();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Expense> getExpenses() {
		return expenses;
	}

	public void setExpenses(List<Expense> expenses) {
		this.expenses = expenses;
	}

}
