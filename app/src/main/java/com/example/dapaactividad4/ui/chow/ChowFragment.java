package com.example.dapaactividad4.ui.chow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.dapaactividad4.databinding.FragmentChowBinding;

public class ChowFragment extends Fragment {

    private FragmentChowBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ChowViewModel chowViewModel =
                new ViewModelProvider(this).get(ChowViewModel.class);

        binding = FragmentChowBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}