package com.coder.santanderdevweek.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.coder.santanderdevweek.data.Account
import com.coder.santanderdevweek.data.local.FakeData

class MainViewModel : ViewModel() {

    private val mutableLiveData: MutableLiveData<Account> = MutableLiveData()

    fun fetchCustomerAccount() : LiveData<Account> {
        mutableLiveData.value  = FakeData().getLocalData()

        return mutableLiveData
    }

}