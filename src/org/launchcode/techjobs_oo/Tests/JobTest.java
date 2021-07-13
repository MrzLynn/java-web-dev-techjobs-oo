package org.launchcode.techjobs_oo.Tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    private Job job4,job5,job6,job7,job8,job9;

    @Before
    public void settingUpTest (){
        job4 = new Job();
        job5 = new Job();
        job6 = new Job("Front End Web", new Employer("LaunchCode"), new Location("Saint Louis"), new PositionType("Entry Level"), new CoreCompetency("Persistence"));
        job7 = new Job("Back End Web", new Employer("Visa"), new Location("Atlantis"), new PositionType("Intermediate"), new CoreCompetency("Novice"));
        job8 = new Job("Back End Web", new Employer("Visa"), new Location("Atlantis"), new PositionType("Intermediate"), new CoreCompetency("Novice"));
        job9 = new Job("Front End Web", new Employer("LaunchCode"), new Location(""), new PositionType("Entry Level"), new CoreCompetency("Persistence"));
    }


    @Test
    public void testSettingJobId (){
        assertEquals(1, job5.getId() - job4.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields (){
        assertEquals("Front End Web", job6.getName());
        assertEquals("LaunchCode", job6.getEmployer().getValue());
        assertEquals("Saint Louis", job6.getLocation().getValue());
        assertEquals("Entry Level", job6.getPositionType().getValue());
        assertEquals("Persistence", job6.getCoreCompetency().getValue());
    }
    @Test
    public void testJobsForEquality(){
        assertFalse(job4.equals(job5));
    }
    @Test
    public void toStringWorks() {
        assertTrue(job4.toString() instanceof String);
    }

    @Test
    public void stringBeginsWithSpace(){
        String testingToString = job7.toString();
        char firstCharacter = testingToString.charAt(0);
        assertEquals('\n', firstCharacter);
    }

    @Test
    public void stringEndsWithSpace(){
        String testingToString = job7.toString();
        char lastCharacter = testingToString.charAt(testingToString.length() - 1);
        assertEquals('\n', lastCharacter);
    }

    @Test
    public void testToStringMethod(){
    Assert.assertNotEquals("ID: 1\n" + "Name: Front End Web\n" + "Employer: LaunchCode\n" + "Location: Saint Louis\n" + "Position Type: Entry Level\n" + "Core Competency: Persistence\n", job6.toString());
    Assert.assertEquals("\nID: " + job6.getId() + "\n" +
                        "Name: " + job6.getName() + "\n"+
                        "Employer: " + job6.getEmployer() + "\n" +
                        "Location: " + job6.getLocation() + "\n" +
                        "Position Type: " + job6.getPositionType() + "\n" +
                        "Core Competency: " + job6.getCoreCompetency() + "\n", job6.toString());

    }

}
