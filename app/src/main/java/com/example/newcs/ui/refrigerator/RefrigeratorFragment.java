package com.example.newcs.ui.refrigerator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.newcs.R;

public class RefrigeratorFragment extends Fragment {

    private RefrigeratorViewModel refrigeratorViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        refrigeratorViewModel =
                ViewModelProviders.of(this).get(RefrigeratorViewModel.class);
        View root = inflater.inflate(R.layout.fragment_refrigerator, container, false);
        final TextView textView = root.findViewById(R.id.text_notifications);
        refrigeratorViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}