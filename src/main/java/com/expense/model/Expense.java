package com.expense.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "expense_table")
public class Expense {
    public Expense() {
    }

    public Expense(Date expenseDate, String item, BigDecimal amount, String itemType) {
        this.expenseDate = expenseDate;
        this.item = item;
        this.amount = amount;
        this.itemType = itemType;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinTable(name = "User_Expense_Mapping", joinColumns = @JoinColumn(name = "expense_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
    private User user;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Expense_Id")
    private int expenseId;
    @Column(name = "Expense_Date")
    private Date expenseDate;
    @Column(name = "Item", length = 20)
    private String item;
    @Column(name = "Amount")
    private BigDecimal amount;
    @Column(name = "Item_Type")
    @Size(min = 3, max = 20)
    private String itemType;

    public int getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(int expenseId) {
        this.expenseId = expenseId;
    }

    public Date getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(Date expenseDate) {
        this.expenseDate = expenseDate;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expense expense = (Expense) o;
        return expenseId == expense.expenseId &&
                Objects.equals(user, expense.user) &&
                Objects.equals(expenseDate, expense.expenseDate) &&
                Objects.equals(item, expense.item) &&
                Objects.equals(amount, expense.amount) &&
                Objects.equals(itemType, expense.itemType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, expenseId, expenseDate, item, amount, itemType);
    }
}
