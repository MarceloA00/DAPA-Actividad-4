package com.example.dapaactividad4.ui.finn;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.dapaactividad4.databinding.FragmentFinnBinding;

public class FinnFragment extends Fragment {

    private FragmentFinnBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FinnViewModel finnViewModel =
                new ViewModelProvider(this).get(FinnViewModel.class);

        binding = FragmentFinnBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}