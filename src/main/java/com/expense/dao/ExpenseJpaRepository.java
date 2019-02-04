package com.expense.dao;

import com.expense.model.Expense;
import org.springframework.data.repository.CrudRepository;

public interface ExpenseJpaRepository extends CrudRepository<Expense,Integer> {
}
