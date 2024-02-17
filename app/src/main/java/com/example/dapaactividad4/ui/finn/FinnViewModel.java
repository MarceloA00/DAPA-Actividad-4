package com.example.dapaactividad4.ui.finn;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FinnViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public FinnViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Finn fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}