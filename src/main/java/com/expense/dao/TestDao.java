package com.expense.dao;

import com.expense.model.Expense;
import com.expense.model.User;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class TestDao {

    public User getUser1() {
        Expense expense3 = new Expense(new Date(), "bear", new BigDecimal("670.02"), "alcohol");
        Expense expense4 = new Expense(new Date(), "cigerette", new BigDecimal("3.57"), "smoke");
        List<Expense> expList2 = new ArrayList<>();
        expList2.add(expense3);
        expList2.add(expense4);
        User user1 = new User("245043", "abhi");
        user1.setExpenses(expList2);
        return user1;
    }
    public User getUser2() {
        Expense expense1 = new Expense(new Date(), "pencil", new BigDecimal("10"), "stationary");
        Expense expense2 = new Expense(new Date(), "lipstick", new BigDecimal("1200"), "cosmetics");
        List<Expense> expList1 = new ArrayList<>();
        expList1.add(expense1);
        expList1.add(expense2);
        User user2 = new User("543893", "mona");
        user2.setExpenses(expList1);
        return user2;
    }
}
