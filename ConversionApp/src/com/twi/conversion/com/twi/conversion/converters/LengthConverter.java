package com.twi.conversion.com.twi.conversion.converters;

import com.twi.conversion.model.LengthMeasurement;
import com.twi.conversion.model.LengthUnit;
import com.twi.conversion.model.Measurement;
import com.twi.conversion.model.Unit;
import sun.security.util.Length;

/**
 * Created by hayatnaga on 7/12/17.
 */
public class LengthConverter extends Converter {
    public static final double INCHES_TO_MM = 25.4;
//    public static final double MM_TO_FEET = ;

    public static final double FEET_TO_INCHES = 12.0;
    public static final double YARDS_TO_FEET = 3.0;
    public static final double INCHES_TO_CMS = 2.54;

    public LengthMeasurement convertFeetToInches(LengthMeasurement source) {
        checkTypeUnit(source, LengthUnit.FOOT);
        return convert(source, FEET_TO_INCHES, LengthUnit.INCH);
    }

    public LengthMeasurement convertYardToFeet(LengthMeasurement source) {
        checkTypeUnit(source, LengthUnit.YARD);
        return convert(source, YARDS_TO_FEET, LengthUnit.FOOT);
    }


    public LengthMeasurement convert(LengthMeasurement source, double factor, LengthUnit targetUnit) {
        double quantity = source.getQuantity() * factor;
        return new LengthMeasurement(quantity, targetUnit);
    }

    public void checkTypeUnit(LengthMeasurement source, LengthUnit lengthUnit) {
        if (!(source.getUnit() == lengthUnit)) {
            throw new IllegalArgumentException("Unit does not match: " + lengthUnit.getName() + " expected, received " + source.getUnit());
        }
    }

    public LengthMeasurement convertInchesToCm(LengthMeasurement source) {
        checkTypeUnit(source, LengthUnit.INCH);
        return convert(source, INCHES_TO_CMS, LengthUnit.CM);
    }

    public LengthMeasurement convert(LengthMeasurement source, LengthUnit targetType) {
        if (source.getUnit() == LengthUnit.FOOT && targetType == LengthUnit.INCH) {
            //convertFeetToInches(source, )
        }
        return null;
    }


    public static double toBaseUnit(LengthMeasurement measurement) {
        //Should have knowledge to convert from current unit to MM
        return measurement.getQuantity() * measurement.getUnit().getConversionFactorForBaseUnit();
    }

    public static double toMM(LengthMeasurement measurement) {
        return toBaseUnit(measurement);
    }
}
