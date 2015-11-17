package com.epicodus.moneymanagement.models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.util.List;

/**
 * Created by nataliyamiller on 11/15/15.
 */

@Table(name = "Expenses", id = "_id")
public class Expense extends Model {

    @Column(name = "Description")
    private String mDescription;

    @Column(name = "Category")
    private Category mCategory;

    public Expense() {
        super();
    }

    public Expense(String description, Category category) {
        super();
        mDescription = description;
        mCategory = category;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }


    public static List<Expense> all() {
        return new Select().from(Expense.class).execute();
    }
}
