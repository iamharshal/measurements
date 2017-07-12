package com.twi.conversion.tests;

import static org.junit.Assert.assertEquals;

import com.twi.conversion.com.twi.conversion.converters.LengthCalculator;
import com.twi.conversion.com.twi.conversion.converters.LengthConverter;
import com.twi.conversion.model.Temperature;
import org.junit.Before;
import org.junit.Test;
import com.twi.conversion.model.*;

/**
 * Created by hayatnaga on 7/11/17.
 */

public class LengthConverterTest {


    private LengthConverter lengthConverter;

    @Before
    public void setup() {
        lengthConverter = new LengthConverter();
    }


    @Test
    public void testFeetToInches() {
        LengthMeasurement oneFoot = new LengthMeasurement(1, LengthUnit.FOOT);
        LengthMeasurement twelveInches = new LengthMeasurement(12, LengthUnit.INCH);

        Measurement convertedMeasurement = lengthConverter.convertFeetToInches(oneFoot);
        assertEquals(convertedMeasurement, twelveInches);
    }

    @Test
    public void Should_2inches_equal_5_08cm() {
        LengthMeasurement inches2 = new LengthMeasurement(2, LengthUnit.INCH);
        LengthMeasurement cm5_08 = new LengthMeasurement(5.08, LengthUnit.CM);

        LengthConverter converter = new LengthConverter();
        Measurement convertedMeasurement = converter.convertInchesToCm(inches2);

        assertEquals(convertedMeasurement, cm5_08);
    }

    @Test
    public void Should_Add_Inches() {
        LengthMeasurement twoInches = new LengthMeasurement(2, LengthUnit.INCH);

        LengthMeasurement inches4 = new LengthMeasurement(4, LengthUnit.INCH);

        LengthCalculator calculator = new LengthCalculator();
        LengthMeasurement sum_result = calculator.add(twoInches, twoInches);

        assertEquals(sum_result, inches4);
    }

    @Test
    public void Should_Compare_Celsius_with_Fahrenheit() {
        Temperature celsius = new Temperature(100, TemperatureUnit.CELSIUS);
        Temperature fahrenheit = new Temperature(212, TemperatureUnit.FAHRENHEIT);

        assertEquals(celsius, fahrenheit);
    }


    @Test
    public void Should_Fail_To_Add_Different_Units() {
        LengthMeasurement arg1_inches2 = new LengthMeasurement(2, LengthUnit.INCH);
        LengthMeasurement arg2_inches2 = new LengthMeasurement(2, LengthUnit.FOOT);

        LengthMeasurement inches4 = new LengthMeasurement(4, LengthUnit.INCH);

        LengthCalculator calculator = new LengthCalculator();
        LengthMeasurement sum_result = calculator.add(arg1_inches2, arg2_inches2);

        assertEquals(sum_result, inches4);

        /*
           sum = toYard(a.i + b.cm + c.ft + d.yard)

         */
    }

}
