package com.example.moneyconverter.domain;


import com.example.moneyconverter.data.model.CurrencyData;

public interface ICurrenciesRepository {


    public void loadCurrecies(CallBack<CurrencyData> callBack);
}
