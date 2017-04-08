package sf.codingcomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

import sf.codingcomp.exception.TooManyEmployeesException;
import sf.codingcomp.exception.TooManyHoursException;
import sf.codingcomp.model.Employee;
import sf.codingcomp.model.Resource;
import sf.codingcomp.model.Schedule;
import sf.codingcomp.model.Week;

public class ProjectManagementSimulationTest {
    private ProjectManagementSimulation projectManagementSimulator;

    @Before
    public void setup() {
        projectManagementSimulator = new ProjectManagementSimulationImplementation();
    }

    /*********************************** SET ONE ***********************************/

    /**
     * This method should find the complete list of work that needs to be completed for the project
     * 
     * @return List of work that needs to be completed
     * 
     */
    @Test
    public void testSearchSchedule() throws Exception {
        List<Schedule> schedule = projectManagementSimulator.getInitialSchedule();
        assertNotNull( schedule );
        assertEquals( 8, schedule.size() );
    }

    /**
     * This method should find the complete list of resources available in the database
     * 
     * @return List of resources available to complete the work
     * 
     */
    @Test
    public void testSearchEmployees() throws Exception {
        List<Employee> employees = projectManagementSimulator.getInitialEmployees();
        assertNotNull( employees );
        assertEquals( 6, employees.size() );
    }

    /*********************************** SET TWO ***********************************/

    /**
     * This method should find the list of work that needs to be completed for the project for a given priority
     * 
     * @return List of work that needs to be completed
     * 
     */
    @Test
    public void testSelectCurrentSchedule() throws Exception {
        List<Schedule> schedule = projectManagementSimulator.selectCurrentSchedule( projectManagementSimulator.getInitialSchedule(), 1 );
        assertNotNull( schedule );
        assertEquals( 1, schedule.size() );

        schedule = projectManagementSimulator.selectCurrentSchedule( projectManagementSimulator.getInitialSchedule(), 3 );
        assertNotNull( schedule );
        assertEquals( 4, schedule.size() );

    }

    /**
     * This method should find the list of resources available to work.
     * An employee with 50% or lower availability will decide to take a sick day or a vacation day so is not "available".
     * 
     * @return List of resources available to complete the work
     * 
     */
    @Test
    public void testSearchAvailableResources() throws Exception {
        List<Employee> initialEmployees = projectManagementSimulator.getInitialEmployees();
        List<Resource> resources = projectManagementSimulator
                .searchAvailableResources( initialEmployees.stream().map( Resource::fromEmployee ).collect( Collectors.toList() ) );
        assertNotNull( resources );
        assertEquals( 5, resources.size() );
    }

    /**
     * This method should simulate a week of the project assuming no overtime worked.
     * 
     * @return Week object representing the next week of work with all resources, schedules, and cost updated.
     * 
     */
    @Test
    public void simulationTest_noOvertime() throws Exception {
        Week currentWeek = new Week();
        currentWeek.setResources(
                projectManagementSimulator.getInitialEmployees().stream().map( Resource::fromEmployee ).collect( Collectors.toList() ) );
        currentWeek.setSchedules( projectManagementSimulator.selectCurrentSchedule( projectManagementSimulator.getInitialSchedule(), 1 ) );
        Week nextWeek = projectManagementSimulator.simulateWeek( currentWeek );

        // assert resources availability updated
        assertEquals( "75", nextWeek.getResources().stream().filter( r -> r.getEmployee().getName().contains( "Ester" ) ).findFirst().get()
                .getEmployee().getAvailability() );
        assertEquals( "100", nextWeek.getResources().stream().filter( r -> r.getEmployee().getName().contains( "Carey" ) ).findFirst().get()
                .getEmployee().getAvailability() );  // --> Ability to increase employees on break/vacation
        assertEquals( "D, 20, 2", nextWeek.getSchedules().get( 0 ).getTask() );
        assertEquals( 3200, nextWeek.getCost(), 0 );
    }

    /**
     * This method should simulate multiple weeks (2) of the project assuming no overtime worked.
     * 
     * @return Week object representing the next week of work with all resources, schedules, and cost updated.
     * 
     */
    @Test
    public void simulationTest_multipleWeeks_noOvertime() throws Exception {
        Week currentWeek = new Week();
        currentWeek.setResources(
                projectManagementSimulator.getInitialEmployees().stream().map( Resource::fromEmployee ).collect( Collectors.toList() ) );
        currentWeek.setSchedules( projectManagementSimulator.selectCurrentSchedule( projectManagementSimulator.getInitialSchedule(), 1 ) );
        Week nextWeek = projectManagementSimulator.simulateWeek( currentWeek );
        Week twoWeeks = projectManagementSimulator.simulateWeek( nextWeek );

        // assert resources availability updated
        assertEquals( "50", twoWeeks.getResources().stream().filter( r -> r.getEmployee().getName().contains( "Ester" ) ).findFirst().get()
                .getEmployee().getAvailability() );
        assertEquals( "75", twoWeeks.getResources().stream().filter( r -> r.getEmployee().getName().contains( "Carey" ) ).findFirst().get()
                .getEmployee().getAvailability() );  // --> Ability to increase employees on break/vacation
        assertEquals( "D, 0, 2", twoWeeks.getSchedules().get( 0 ).getTask() );
        assertEquals( 8800, twoWeeks.getCost(), 0 );
    }

    /**
     * This method should simulate a week of the project with multiple tasks (P and N) assuming no overtime worked.
     * 
     * @return Week object representing the next week of work with all resources, schedules, and cost updated.
     * 
     */
    @Test
    public void simulationTest_multipleTasks_noOvertime() throws Exception {
        Week currentWeek = new Week();
        currentWeek.setResources(
                projectManagementSimulator.getInitialEmployees().stream().map( Resource::fromEmployee ).collect( Collectors.toList() ) );
        currentWeek.setSchedules( projectManagementSimulator.selectCurrentSchedule( projectManagementSimulator.getInitialSchedule(), 2 ) );
        Week nextWeek = projectManagementSimulator.simulateWeek( currentWeek );

        // assert resources availability updated
        assertEquals( "50", nextWeek.getResources().stream().filter( r -> r.getEmployee().getName().contains( "Stacey" ) ).findFirst().get()
                .getEmployee().getAvailability() );
        assertEquals( "75", nextWeek.getResources().stream().filter( r -> r.getEmployee().getName().contains( "George" ) ).findFirst().get()
                .getEmployee().getAvailability() );  // --> Ability to increase employees on break/vacation
        // Note: Neither task is completed in this simulation of a single week.
        assertEquals( "P, 181, 2", nextWeek.getSchedules().get( 0 ).getTask() );
        assertEquals( "N, 70, 1", nextWeek.getSchedules().get( 1 ).getTask() );
        // This is the cost only of the week simulated. Do not worry about priority 1 costs.
        assertEquals( 2400, nextWeek.getCost(), 0 );
    }

    /**
     * This method should simulate a week of the project assuming overtime was worked.
     * 
     * @return Week object representing the next week of work with all resources, schedules, and cost updated.
     * 
     */
    @Test
    public void simulationTest_withOvertime() throws Exception {
        Week currentWeek = new Week();
        currentWeek.setResources( projectManagementSimulator.getInitialEmployees().stream().map( Resource::fromEmployee ).map( Resource::overtime )
                .collect( Collectors.toList() ) );
        currentWeek.setSchedules( projectManagementSimulator.selectCurrentSchedule( projectManagementSimulator.getInitialSchedule(), 1 ) );
        Week nextWeek = projectManagementSimulator.simulateWeek( currentWeek );

        // assert resources availability updated
        assertEquals( "50", nextWeek.getResources().stream().filter( r -> r.getEmployee().getName().contains( "Ester" ) ).findFirst().get()
                .getEmployee().getAvailability() );
        assertEquals( "100", nextWeek.getResources().stream().filter( r -> r.getEmployee().getName().contains( "Carey" ) ).findFirst().get()
                .getEmployee().getAvailability() );  // --> Ability to increase employees on break/vacation
        assertEquals( "D, 0, 2", nextWeek.getSchedules().get( 0 ).getTask() );
        assertEquals( 7200, nextWeek.getCost(), 0 );
    }

    /**
     * This method should simulate a week of the project where hours worked is above the 70 hour limit.
     * 
     * @throws TooManyHoursException
     * 
     */
    @Test( expected = TooManyHoursException.class )
    public void simulationTest_tooManyHoursOfOvertime() throws Exception {
        Week currentWeek = new Week();
        currentWeek.setResources( projectManagementSimulator.getInitialEmployees().stream().map( Resource::fromEmployee ).map( Resource::tooMany )
                .collect( Collectors.toList() ) );
        currentWeek.setSchedules( projectManagementSimulator.selectCurrentSchedule( projectManagementSimulator.getInitialSchedule(), 1 ) );
        projectManagementSimulator.simulateWeek( currentWeek );
    }

    /**
     * This method should simulate a week of the project where the number of available employees for a task exceeds the max limit set in the schedule.
     * 
     * @throws TooManyEmployeesException
     * 
     */
    @Test( expected = TooManyEmployeesException.class )
    public void simulationTest_tooManyEmployees() throws Exception {
        Week currentWeek = new Week();
        currentWeek.setResources(
                projectManagementSimulator.getInitialEmployees().stream().map( Resource::fromEmployee ).collect( Collectors.toList() ) );
        // ********* Add extra resource to push over the limit of 1 **************//
        Resource resource = new Resource();
        resource.setHours( 40 );
        Employee employee = new Employee();
        employee.setName( "Tom Jones" );
        employee.setAvailability( "100" );
        employee.setLevel( "N3" );
        resource.setEmployee( employee );
        // ***********************************************************************//
        currentWeek.getResources().add( resource );
        currentWeek.setSchedules( projectManagementSimulator.selectCurrentSchedule( projectManagementSimulator.getInitialSchedule(), 2 ) );
        projectManagementSimulator.simulateWeek( currentWeek );
    }

}
