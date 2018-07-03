package com.ws.jinbesmartalarmclock.View;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ws.jinbesmartalarmclock.R;

/**
 * A simple {@link Fragment} subclass.
 */
public final class TimerFragment extends Fragment {

    private static volatile TimerFragment instance;

    public TimerFragment() {
        // Required empty public constructor
    }

    public static synchronized TimerFragment getInstance() {
        if(instance==null){
            synchronized (TimerFragment.class){
                if (instance==null){
                    instance=new TimerFragment();
                }
            }
        }
        return instance;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_timer, container, false);
    }

}
