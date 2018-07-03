package com.ws.jinbesmartalarmclock.View;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ws.jinbesmartalarmclock.R;


/**
 * A simple {@link Fragment} subclass.
 */
public final class CalendarFragment extends Fragment {

    private static volatile CalendarFragment instance;

    public CalendarFragment() {
        // Required empty public constructor
    }

    public static synchronized CalendarFragment getInstance() {
        if(instance==null){
            synchronized (CalendarFragment.class){
                if (instance==null)instance=new CalendarFragment();
            }
        }
        return instance;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View lView= inflater.inflate(R.layout.fragment_calendar, container, false);
        FloatingActionButton fab = lView.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        return lView;
    }

}
