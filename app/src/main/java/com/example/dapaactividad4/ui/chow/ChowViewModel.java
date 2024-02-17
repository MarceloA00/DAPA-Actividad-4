package com.example.dapaactividad4.ui.chow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ChowViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ChowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Chowder fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}