package com.coder.santanderdevweek.data.local

import com.coder.santanderdevweek.data.Card
import com.coder.santanderdevweek.data.Client
import com.coder.santanderdevweek.data.Account

class FakeData {

    fun getLocalData() : Account {
        val cliente = Client("William James")
        val cartao = Card("2211874523124434")

        return Account(
            "44565511-4",
            "6552-4",
            "R$ 2.450,80",
            "R$ 4.120,00",
            cliente,
            cartao
        )
    }

}