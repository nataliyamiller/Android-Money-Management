package com.epicodus.moneymanagement.ui;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import com.epicodus.moneymanagement.R;
import com.epicodus.moneymanagement.models.Category;
import com.epicodus.moneymanagement.models.Expense;

import java.util.ArrayList;

public class CategoryActivity extends ListActivity {
    private Category mCategory;
    private ArrayList<String> mExpenses;
    private Button mNewExpenseButton;
    private EditText mNewExpenseText;
    private ArrayAdapter<String> mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        String name = getIntent().getStringExtra("categoryName");
        mCategory = Category.find(name);


        mNewExpenseButton = (Button) findViewById(R.id.newExpenseButton);
        mNewExpenseText = (EditText) findViewById(R.id.newExpenseText);

        mExpenses = new ArrayList<String>();
        for (Expense expense : mCategory.expenses() ) {
            mExpenses.add(expense.getDescription());
        }

        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mExpenses);
        setListAdapter(mAdapter);

        mNewExpenseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addExpense();
            }
        });

    }

    private void addExpense() {
        String description = mNewExpenseText.getText().toString();
        Expense newExpense = new Expense(description, mCategory);
        newExpense.save();
        mExpenses.add(description);
        mAdapter.notifyDataSetChanged();
    }


}
