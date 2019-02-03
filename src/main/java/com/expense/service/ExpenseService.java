package com.expense.service;

import java.util.List;

import com.expense.model.Expense;

public interface ExpenseService {
	
	public List<Expense> getExpenses(String userId);

}
