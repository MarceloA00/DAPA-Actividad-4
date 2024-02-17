package com.example.dapaactividad4.ui.flap;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FlapViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public FlapViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Flapjack fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}