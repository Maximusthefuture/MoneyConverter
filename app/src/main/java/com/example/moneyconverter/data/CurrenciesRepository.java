package com.example.moneyconverter.data;

import com.example.moneyconverter.data.model.CurrencyData;
import com.example.moneyconverter.domain.CallBack;
import com.example.moneyconverter.domain.ICurrenciesRepository;

import org.simpleframework.xml.strategy.Strategy;

import retrofit2.Retrofit;

public class CurrenciesRepository implements ICurrenciesRepository {
    private static final String BASE_URL = "";
    private final IRatesService mIRatesService = null;



    public CurrenciesRepository() {


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .build();
    }

    @Override
    public void loadCurrecies(CallBack<CurrencyData> callBack) {
        mIRatesService.loadCurrencies().enqueue(callBack);
    }
}
