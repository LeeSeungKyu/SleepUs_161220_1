package com.example.seungkyu.dreamtodream;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by junyepoh on 2016. 12. 14..
 */

public class CompanyList_LayoutTwo extends Fragment{
    public static CompanyList_LayoutTwo newInstance() {
        CompanyList_LayoutTwo fragment = new CompanyList_LayoutTwo();
        return fragment;
    }

    public CompanyList_LayoutTwo() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_company_list_layout_two, null);
        return root;
    }

}

