package org.launchcode.techjobs_oo;

import java.util.Objects;

public class CoreCompetency extends JobField {

    public CoreCompetency(String value) {
         super(value);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String name) {
        this.value = value;
    }

    // DONE: Use the "Generate" tool to add a getter and setter for the 'value' field but
    //  ONLY a getter for the 'id' field.
}
