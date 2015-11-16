package com.epicodus.moneymanagement.models;

import com.epicodus.moneymanagement.R;


import java.util.ArrayList;

/**
 * Created by nataliyamiller on 11/2/15.
 */
public class InfoLib {

    private ArrayList<MoreInfo> mMoreInfos;

    public InfoLib() {
        setMoreInfos();
    }

    public ArrayList<MoreInfo> getMoreInfos() {
        return mMoreInfos;
    }

    private void setMoreInfos() {
        mMoreInfos = new ArrayList<>();

        mMoreInfos.add(new MoreInfo(
                "Managing your expenses is easy with our new application",
                R.drawable.smiley_one
        ));


        mMoreInfos.add(new MoreInfo(
                "Not managing your personal expenses makes you wonder what happened to your money again!",
                R.drawable.confused_smiley
        ));

        mMoreInfos.add(new MoreInfo(
                "Not managing your business expenses may result in paying more taxes!",
                R.drawable.sad_smiley

        ));


        mMoreInfos.add(new MoreInfo(
                "User for free to use our money management application and be on top of your monthly expenses!",
                R.drawable.smiley_two
        ));

    }

    public MoreInfo nextInfo(MoreInfo currentInfo) {
        int index = mMoreInfos.indexOf(currentInfo);
        if (index == mMoreInfos.size() - 1) {
            return mMoreInfos.get(0);
        } else {
            return mMoreInfos.get(index + 1);
        }
    }
}
