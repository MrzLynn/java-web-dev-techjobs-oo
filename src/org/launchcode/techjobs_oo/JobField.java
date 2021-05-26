package org.launchcode.techjobs_oo;

import org.launchcode.techjobs_oo.Tests.JobTest;


import java.util.Objects;

public abstract class JobField extends Job {
    private int id;
    private static int nextId = 1;
    private String value;

    public JobField(String name, Employer employer, Location location, PositionType positionType,CoreCompetency coreCompetency){
        super(name, employer, location, positionType, coreCompetency);
    }

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "" + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id && Objects.equals(value, jobField.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value);
    }

}
