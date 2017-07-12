package com.twi.conversion.model;

/**
 * Created by hayatnaga on 7/11/17.
 */
public class Measurement {
    double quantity;
    Unit unit;

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Measurement(double quanity, Unit unit) {
        this.quantity = quanity;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object rhs) {

        if(rhs instanceof Measurement) {
            return equals((Measurement) rhs);
        }

        return false;

    }
    public boolean equals(Measurement rhs) {
        boolean result = false;

        if(rhs != null) {
            boolean withinTolerance = Math.abs(this.getQuantity() - rhs.getQuantity()) <= 0.00001;
            result = this.getUnit() == rhs.getUnit() && withinTolerance;
        }

        return result;
    }
}
