package com.ws.jinbesmartalarmclock.View;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ws.jinbesmartalarmclock.R;

/**
 * A simple {@link Fragment} subclass.
 */
public final class RecyclerFragment extends Fragment {

    private static volatile RecyclerFragment instance;

    public RecyclerFragment() {
        // Required empty public constructor
    }

    public static synchronized RecyclerFragment getInstance() {
        if(instance==null){
            synchronized (RecyclerFragment.class){
                if (instance==null){
                    instance=new RecyclerFragment();
                }
            }
        }
        return instance;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recycler, container, false);
    }

}
