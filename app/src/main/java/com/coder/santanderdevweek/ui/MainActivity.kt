 package com.coder.santanderdevweek.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate
import androidx.lifecycle.ViewModelProvider
import com.coder.santanderdevweek.R
import com.coder.santanderdevweek.data.Account

 class MainActivity : AppCompatActivity() {

     private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        fetchCustomerAccount()
    }

     private fun fetchCustomerAccount() {
         mainViewModel.fetchCustomerAccount().observe(this, { result ->
             bindOnView(result)
         })
     }

     private fun bindOnView(account: Account) {
         findViewById<TextView>(R.id.tv_ag).text = account.agency
         findViewById<TextView>(R.id.tv_cc).text = account.number
         findViewById<TextView>(R.id.tv_saldo).text = account.balance
         findViewById<TextView>(R.id.tv_limite).text = account.limit
         findViewById<TextView>(R.id.tv_name).text = account.client.name
         findViewById<TextView>(R.id.tv_card_final_valor).text = account.card.numberCard.takeLast(4)
     }
}