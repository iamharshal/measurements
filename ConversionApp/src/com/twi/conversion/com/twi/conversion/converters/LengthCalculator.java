package com.twi.conversion.com.twi.conversion.converters;

import com.twi.conversion.model.LengthMeasurement;
import com.twi.conversion.model.LengthUnit;

/**
 * Created by hayatnaga on 7/12/17.
 */
public class LengthCalculator {
    public LengthMeasurement add(LengthMeasurement arg1_inches2, LengthMeasurement arg2_inches2) {
        if(arg1_inches2.getUnit() != arg2_inches2.getUnit())
        {
            return null;
        }

        LengthMeasurement result = new LengthMeasurement(arg1_inches2.getQuantity() + arg2_inches2.getQuantity(), (LengthUnit) arg1_inches2.getUnit());

        return result;
    }
}
