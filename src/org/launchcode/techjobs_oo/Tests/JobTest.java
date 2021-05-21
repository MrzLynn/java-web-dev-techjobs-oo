package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;

public class JobTest {
    private Job job1,job2, job3;

    @Before
    public void settingUpTest (){
        job1 = new Job();
        job2 = new Job();
        job3 = new Job("Front End Web", new Employer("LaunchCode"), new Location("Saint Louis"), new PositionType("Entry Level"), new CoreCompetency("Persistence"));
    }
    @Test
    public void testSettingJobId (){
        assertEquals(1, job2.getId() - job1.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields (){
        assertEquals("Front End Web", job3.getName());
        assertEquals("LaunchCode", job3.getEmployer().getValue());
        assertEquals("Saint Louis", job3.getLocation().getValue());
        assertEquals("Entry Level", job3.getPositionType().getValue());
        assertEquals("Persistence", job3.getCoreCompetency().getValue());
    }
    @Test
    public void testJobsForEquality(){

    }
}
