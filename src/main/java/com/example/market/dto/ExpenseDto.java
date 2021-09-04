package com.example.market.dto;

import com.example.market.model.Expense;
import com.example.market.model.ExpenseType;

public class ExpenseDto extends DtoBase<Expense> {
    private ExpenseType expenseType;
    private Long value;
    private String description;

    public ExpenseType getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(ExpenseType expenseType) {
        this.expenseType = expenseType;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
