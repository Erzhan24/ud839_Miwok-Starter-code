package com.example.android.miwok;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by katherinekuan on 4/14/16.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    public CategoryAdapter( FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1) {
            return new FamilyFragment();
        } else if (position == 2) {
            return new ColorsFragment();
        } else {
            return new PhrasesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Parks";
        } else if (position == 1) {
            return "Restaurants";
        } else if (position == 2) {
            return "Sight";
        } else {
            return "Hotels";
        }
    }
}