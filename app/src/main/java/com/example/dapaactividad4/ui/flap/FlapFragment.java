package com.example.dapaactividad4.ui.flap;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.dapaactividad4.databinding.FragmentFlapBinding;
import com.example.dapaactividad4.databinding.FragmentFlapBinding;

public class FlapFragment extends Fragment {

    private FragmentFlapBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FlapViewModel flapViewModel =
                new ViewModelProvider(this).get(FlapViewModel.class);

        binding = FragmentFlapBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}