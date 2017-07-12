package com.twi.conversion.model;

import sun.security.util.Length;

import java.util.HashMap;
import java.util.Map;

public class LengthFactory {
    private Map<LengthUnit, LengthUnit> map;

    private static LengthFactory theFactory;

    private LengthFactory() {
        map = new HashMap<LengthUnit, LengthUnit>();
    }

    public static LengthFactory getInstance() {
        /*theFactory = new LengthFactory();

        logic = new ConversionLogic(LengthMeasurement measurement) {
            double toBaseUnit() {
                return conversionFactor * measurement.getQuantity();
            }
        };

        theFactory.map.put(LengthUnit.MM, logic);*/
        return null;
    }
}
