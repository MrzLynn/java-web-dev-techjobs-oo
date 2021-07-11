package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType,CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }
    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        String ifFieldEmpty = "Data not available";
        if(this.name == null || this.name == "") {
            this.name = ifFieldEmpty;
        }
        if(this.employer == null || this.employer.value == "") {
            Employer nullValue = new Employer(ifFieldEmpty);
            this.employer = nullValue;
        }
        if(this.location == null || this.location.value == "") {
            Location nullValue = new Location(ifFieldEmpty);
            this.location = nullValue;
        }
        if(positionType == null || this.positionType.value == "") {
            PositionType nullValue = new PositionType(ifFieldEmpty);
            this.positionType = nullValue;
        }
        if(coreCompetency == null || this.coreCompetency.value == ""){
            CoreCompetency nullValue = new CoreCompetency(ifFieldEmpty);
            this.coreCompetency = nullValue;
        }
      return ("\nID: " + id + "\n" +
              "Name: " + name + "\n" +
              "Employer: " + employer.getValue() + "\n" +
              "Location: " + location.getValue() + "\n" +
              "Position Type: " + positionType.getValue() + "\n" +
              "Core Competency: " + coreCompetency.getValue() + "\n");
    }
    public String getName(String product_tester){
        return name;
    }

}
