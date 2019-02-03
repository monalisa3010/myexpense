package com.expense.dao;

import com.expense.model.User;
import org.springframework.data.repository.CrudRepository;

public interface ExpenseJpaRepository extends CrudRepository<User,String> {


}
