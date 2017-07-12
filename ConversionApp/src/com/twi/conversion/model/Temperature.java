package com.twi.conversion.model;

import com.twi.conversion.model.Measurement;
import com.twi.conversion.model.Unit;

/**
 * Created by hayatnaga on 7/12/17.
 */
public class Temperature extends Measurement {

    public Temperature(double quanity, Unit unit) {
        super(quanity, unit);
    }

    @Override
    public boolean equals(Object rhs) {
        boolean result = false;

        if(rhs != null) {
            //Conversion required
            double thistempInC = this.getQuantity();
            if(this.getUnit() == TemperatureUnit.FAHRENHEIT) {
                thistempInC = convertToC(this.getQuantity());
            }

            double rhsTempInC = this.getQuantity();
            if(((Temperature)rhs).getUnit() == TemperatureUnit.FAHRENHEIT) {
                rhsTempInC = convertToC((Temperature)rhs).getQuantity());
            }

            return Math.abs(thistempInC - rhsTempInC) <= 0.00001;
        }

        return result;
    }

    public double convertToC(double inp) {
        return (inp - 32) * (5.0/9.0);
    }
}
