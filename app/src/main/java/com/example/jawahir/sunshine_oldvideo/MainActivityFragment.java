package com.example.jawahir.sunshine_oldvideo;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    ArrayAdapter<String> m_forcast_adapter;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        //dummy data
        String dummydata[] = {"Sun - Sunny -80/68","Mon - Sunny -80/68","Tues - Sunny -80/68",
                "Thrus - Sunny -80/68","Fri - Sunny -80/68","Sat - Sunny -80/68"};

        List<String> list = new ArrayList<String>(Arrays.asList(dummydata));

        //initialize adapter
        Context context = container.getContext();
        m_forcast_adapter = new ArrayAdapter<String>(context,R.layout.list_item_forcast_view,R.id.tv_iteam_list_forcast,list);
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.lv_forcast);
        listView.setAdapter(m_forcast_adapter);
        return rootView;
    }
}
