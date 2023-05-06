package com.example.clicklistenerapp;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel {
    private final MutableLiveData<Integer> counter = new MutableLiveData<>(0);


    public LiveData<Integer> getCounter() {
        return counter;
    }

    public void add() {
        Integer i = counter.getValue();
        i++;
        counter.setValue(i);
    }

}
