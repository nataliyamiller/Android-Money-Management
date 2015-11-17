package com.epicodus.moneymanagement.ui;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.epicodus.moneymanagement.R;
import com.epicodus.moneymanagement.models.Category;
import com.epicodus.moneymanagement.models.Expense;

import java.util.ArrayList;

public class MainUserActivity extends ListActivity {
        private ArrayList<String> mCategories;
        private Button mNewCategoryButton;
        private EditText mNewCategoryText;
        private ArrayAdapter<String> mAdapter;


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_user);

            Expense newExpense = new Expense();
            newExpense.save();


            mNewCategoryButton = (Button) findViewById(R.id.newCategoryButton);
            mNewCategoryText = (EditText) findViewById(R.id.newCategoryText);

            mCategories = new ArrayList<String>();
            for (Category category : Category.all()) {
                mCategories.add(category.getName());
            }


            mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mCategories);
            setListAdapter(mAdapter);

            mNewCategoryButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    addCategory();
                }
            });
        }

        private void addCategory() {
            String name =  mNewCategoryText.getText().toString();
            Category category = new Category(name);
            category.save();
            mCategories.add(name);
            mAdapter.notifyDataSetChanged();
        }

        @Override
        protected void onListItemClick(ListView l, View v, int position, long id) {
            super.onListItemClick(l, v, position, id);
            String thisCategoryName = mCategories.get(position);
            Intent intent = new Intent(this, CategoryActivity.class);
            intent.putExtra("categoryName", thisCategoryName);
            startActivity(intent);
        }

    }


