package com.example.fragment.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.fragment.R;

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        navController= Navigation.findNavController(getActivity(),R.id.nav_host_fragment);
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    private Button next,previous;
    private NavController navController;
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        next=view.findViewById(R.id.btnNext);

        next.setOnClickListener(v->{
                navController.navigate(R.id.secondFragment);
        });
    }
}