package com.example.moneyconverter.data;

import org.simpleframework.xml.convert.Converter;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

import java.math.BigDecimal;

public class BigDecimalConverter implements Converter<BigDecimal> {
    @Override
    public BigDecimal read(InputNode node) throws Exception {
        String correctString = node.getValue().replace(",", ".");
        return new BigDecimal(correctString);
    }

    @Override
    public void write(OutputNode node, BigDecimal value) {
        new UnsupportedOperationException();
    }
}
