package com.expense.dao;

import java.sql.Types;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.expense.model.Expense;
import com.expense.rowMapper.ExpenseRowMapper;

@Repository
public class ExpenseDaoImpl implements ExpenseDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Expense> getExpensesByUserId(String userId) {

		/*String sql ="SELECT exp.expense_id as eid,exp.expense_date as edate,exp.expense_description as expense_description,"
				+ " exp.expense_type as expense_type,exp.expense_amount as expense_amount FROM expense exp left outer join"
				+ " user_expense uexp on exp.expense_id=uexp.expense_id where uexp.user_id=?";*/
		String sql ="SELECT exp.expense_id,exp.expense_date as edate,exp.expense_description as expense_description,"
				+ " exp.expense_type as expense_type,exp.expense_amount as expense_amount FROM expense exp left outer join"
				+ " user_expense uexp on exp.expense_id=uexp.expense_id where uexp.user_id=?";
		Object[] args = new Object[] { userId };
		int[] argTypes = new int[] { Types.VARCHAR };
		List<Expense> expenses = jdbcTemplate.query(sql, args, argTypes,
				new ExpenseRowMapper());
		return expenses;
	}

}
