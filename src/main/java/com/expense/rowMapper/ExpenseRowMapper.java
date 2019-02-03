package com.expense.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.expense.model.Expense;

import org.springframework.jdbc.core.RowMapper;

public class ExpenseRowMapper implements RowMapper<Expense> {

	public Expense mapRow(ResultSet rs, int arg1) throws SQLException {
		Expense expense = new Expense();
		expense.setExpenseId(rs.getInt("expense_id"));
		expense.setExpenseDate(rs.getDate("edate"));
		expense.setItem(rs.getString("expense_description"));
		expense.setItemType(rs.getString("expense_type"));
		expense.setAmount(rs.getBigDecimal("expense_amount"));
		return expense;
	}

}
