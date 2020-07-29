package com.example.myapplicationtest;

import android.os.Bundle;
import android.view.*;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;


public class HomeFragment extends Fragment {
    Toolbar toolbar;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setHasOptionsMenu(true);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       return inflater.inflate(R.layout.fragment_home, container, false);
      //  AppCompatActivity activity = (AppCompatActivity) getActivity();
       // toolbar = view.findViewById(R.id.home_screen_toolbar);
       // activity.setSupportActionBar(toolbar);
       // return view;



    }


  //  @Override
   // public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
   //     inflater.inflate(R.menu.menu_tool_bar,menu);
      //  super.onCreateOptionsMenu(menu, inflater);

   // }
}
