package com.twi.conversion.model;

/**
 * Created by hayatnaga on 7/12/17.
 */
public class
TemperatureUnit extends Unit {
public TemperatureUnit(String name, String pluralName) {
        super(name, pluralName);
        }


    public static final TemperatureUnit FAHRENHEIT = new TemperatureUnit("F", "F");
    public static final TemperatureUnit CELSIUS = new TemperatureUnit("C", "C");
}
