package com.expense.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "User_Table")
public class User {

    @OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinTable(name = "User_Expense_Mapping", joinColumns = @JoinColumn(name = "User_Id"),
            inverseJoinColumns = @JoinColumn(name = "Expense_Id"))
    List<Expense> expenses = new ArrayList<>();

    @Id
    @Column(name = "User_Id")
    private String userId;

    public User() {
    }

    public User(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @JsonIgnore
    @Column(name = "Password")
    private String password;

}
