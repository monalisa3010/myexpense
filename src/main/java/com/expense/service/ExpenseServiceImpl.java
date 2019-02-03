package com.expense.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expense.dao.ExpenseDao;
import com.expense.model.Expense;
@Service
public class ExpenseServiceImpl implements ExpenseService{
	
	@Autowired
	private ExpenseDao expenseDao;

	public List<Expense> getExpenses(String userId) {
		List<Expense> expenses=expenseDao.getExpensesByUserId(userId);
		return expenses;
	}

}
