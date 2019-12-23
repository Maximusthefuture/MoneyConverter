package com.example.moneyconverter.data;

import com.example.moneyconverter.data.model.Currencies;

import retrofit.http.GET;
import retrofit2.Call;

public interface IRatesService {


    @GET("scripts/XML_daily.asp")
    Call<Currencies> loadCurrencies();

}
