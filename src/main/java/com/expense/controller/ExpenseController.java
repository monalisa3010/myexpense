package com.expense.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.expense.dao.ExpenseJpaRepository;
import com.expense.dao.TestDao;
import com.expense.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.expense.model.Expense;
import com.expense.service.ExpenseService;

@RestController
@RequestMapping("/expense")
public class ExpenseController {
    String[] expenseTypesArray = new String[]{"Grocery", "Cosmetics",
            "Medicine", "Stationary", "Crockery"};
    List<String> expenseTypes = Arrays.asList(expenseTypesArray);
    @Autowired
    private ExpenseJpaRepository expenseJpaRepository;
    @Autowired
    private TestDao testDao;
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

    @GetMapping("/saveUser")
    public String saveUser() {
        expenseJpaRepository.save(testDao.getUser1());
        expenseJpaRepository.save(testDao.getUser2());
        return "success";
    }
    @GetMapping("/getUserExpenses/{id}")
    public List<Expense> getUserExpenses(@PathVariable("id") String id){
        Optional<User> user = expenseJpaRepository.findById(id);
        System.out.println("...........................................................................................................");
        List<Expense> expenses=null;
        if(user.isPresent()){
           User u= user.get();
            expenses=u.getExpenses();
        }
        return expenses;
    }
}
