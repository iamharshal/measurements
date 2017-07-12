/**
 * Created by hayatnaga on 7/11/17.
 */

package com.twi.conversion.model;

import sun.security.util.Length;

public class Unit {
    public String getName() {
        return name;
    }

    private String name;

    public String getPluralName() {
        return pluralName;
    }

    private String pluralName;

    public Unit(String name, String pluralName) {
        this.name = name;
        this.pluralName = pluralName;
    }
}

