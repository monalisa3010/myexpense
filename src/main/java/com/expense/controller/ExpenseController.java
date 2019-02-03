package com.expense.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expense.model.Expense;
import com.expense.service.ExpenseService;

@RestController
@RequestMapping("/expense")
public class ExpenseController {
	String[] expenseTypesArray = new String[] { "Grocery", "Cosmetics",
			"Medicine", "Stationary", "Crockery" };
	List<String> expenseTypes = Arrays.asList(expenseTypesArray);

	@Autowired
	private ExpenseService expenseService;
	
	@GetMapping("/getExpenseTypes")
	public List<String> getExpenseTypes() {
		return expenseTypes;
	}

	@GetMapping("/getExpenses/{userId}")
	public List<Expense> getExpenses(@PathVariable("userId") String userId) {
		return expenseService.getExpenses(userId);
	}
}
