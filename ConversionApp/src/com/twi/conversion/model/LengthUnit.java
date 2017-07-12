package com.twi.conversion.model;

import sun.security.util.Length;

import java.util.HashMap;
import java.util.Map;

public class LengthUnit extends Unit {

    private final double conversionFactorForBaseUnit;

    public LengthUnit(String name, String pluralName, double conversionFactorForBaseUnit) {
        super(name, pluralName);

        this.conversionFactorForBaseUnit = conversionFactorForBaseUnit;
    }

    public double getConversionFactorForBaseUnit() {
        return this.conversionFactorForBaseUnit;
    }

    public static final LengthUnit MM = new LengthUnit("millimeter", "millimeters", 1.0);
    public static final LengthUnit FOOT = new LengthUnit("foot", "feet", 304.8);
    public static final LengthUnit INCH = new LengthUnit("inch", "inches", 25.4);
    public static final LengthUnit YARD = new LengthUnit("yard", "yards", 914.0);
    public static final LengthUnit CM = new LengthUnit("centimeter", "centimeters", 10.0);

}


