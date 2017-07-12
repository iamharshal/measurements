package com.twi.conversion.model;

import com.twi.conversion.com.twi.conversion.converters.LengthConverter;

/**
 * Created by hayatnaga on 7/12/17.
 */
public class LengthMeasurement extends Measurement {
    double mmQuanity;

    public LengthMeasurement(double quanity, LengthUnit unit) {
        super(quanity, unit);

        mmQuanity = toMM();
    }

    public double toMM() {
        return LengthConverter.toMM(this);
    }

//    public double toInches() {
//        return LengthConverter.toInches();
//    }

    public LengthUnit getUnit() {
        return (LengthUnit) super.getUnit();
    }
}
