package com.example.moneyconverter.data.model;

import com.google.gson.annotations.Expose;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

import java.math.BigDecimal;


@Root(name = "Valute")
public class CurrencyData {



    @Element(name = "CharCode")
    private String charCode;
    @Element(name="Nominal")
    private int nominal;
    @Element(name = "Name")
    private int currencyName;
    @Element(name = "Value")
//    @Convert()
    private BigDecimal currencyValue;


    public String getCharCode() {
        return charCode;
    }

    public int getNominal() {
        return nominal;
    }

    public int getCurrencyName() {
        return currencyName;
    }

    public BigDecimal getCurrencyValue() {
        return currencyValue;
    }
}
