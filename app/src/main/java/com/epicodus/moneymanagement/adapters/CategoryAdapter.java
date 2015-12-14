package com.epicodus.moneymanagement.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.epicodus.moneymanagement.models.Category;

import java.util.List;

/**
 * Created by nataliyamiller on 12/13/15.
 */
public class CategoryAdapter extends BaseAdapter {

    protected Context mContext;
    protected List<Category> mCategories;

    public CategoryAdapter(Context context, List<Category> categories) {
        mContext = context;
        mCategories = categories;
    }

    @Override
    public int getCount() {
        return mCategories.size();
    }

    @Override
    public Object getItem(int position) {
        return mCategories.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
