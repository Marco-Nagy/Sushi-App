package com.senior.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.senior.myapplication.databinding.FragmentLoginBinding;

public class LoginFragment extends Fragment {
    FragmentLoginBinding binding;
    NavController navController;


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(LayoutInflater.from(getContext()),
                R.layout.fragment_login,
                container,
                false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
         navController = Navigation.findNavController(view);
         binding.loginSignInBtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 navController.navigate(R.id.action_loginFragment_to_signInFragment);
             }
         });
         binding.loginRegisterBtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 navController.navigate(R.id.action_loginFragment_to_registerFragment);
             }
         });
    }
}