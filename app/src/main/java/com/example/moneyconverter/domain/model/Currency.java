package com.example.moneyconverter.domain.model;

import androidx.annotation.NonNull;


import java.math.BigDecimal;

public class Currency {


    private final String mCharCode;
    private final int mNominal;
    private final String mCurrencyName;
    private final BigDecimal mCurrencyValue;


    public Currency(@NonNull String mCharCode,
                    int mNominal,
                    @NonNull String mCurrencyName,
                    @NonNull BigDecimal mCurrencyValue) {
        this.mCharCode = mCharCode;
        this.mNominal = mNominal;
        this.mCurrencyName = mCurrencyName;
        this.mCurrencyValue = mCurrencyValue;
    }

}
