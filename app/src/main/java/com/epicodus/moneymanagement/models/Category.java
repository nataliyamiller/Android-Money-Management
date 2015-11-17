package com.epicodus.moneymanagement.models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.util.List;

/**
 * Created by nataliyamiller on 11/16/15.
 */

@Table(name = "Categories", id = "_id")
public class Category extends Model {

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    @Column(name = "Name")
    public String mName;

    public Category() {
        super();
    }

    public Category (String name) {
        mName = name;
    }

    public static List<Category> all() {
        return new Select().from(Category.class).execute();
    }

    public List<Expense> expenses() {
        return getMany(Expense.class, "Category");
    }


    public static Category find(String name) {
        return new Select()
                .from(Category.class)
                .where("Name = ?", name)
                .executeSingle();
    }
}
