package com.example.newcs.ui.refrigerator;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RefrigeratorViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RefrigeratorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}