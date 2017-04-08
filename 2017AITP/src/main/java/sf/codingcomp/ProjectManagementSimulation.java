package sf.codingcomp;

import java.util.List;

import sf.codingcomp.model.Employee;
import sf.codingcomp.model.Resource;
import sf.codingcomp.model.Schedule;
import sf.codingcomp.model.Week;

public interface ProjectManagementSimulation {

    /*********************************** SET ONE ***********************************/

    /**
     * This method should find the complete list of work that needs to be completed for the project
     * 
     * @return List of work that needs to be completed
     * 
     */
    List<Schedule> getInitialSchedule();

    /**
     * This method should find the complete list of resources available in the database
     * 
     * @return List of resources available to complete the work
     * 
     */
    List<Employee> getInitialEmployees();

    /*********************************** SET TWO ***********************************/

    /**
     * This method should find the list of work that needs to be completed for the project for a given week
     * 
     * @return List of work that needs to be completed
     * 
     */
    List<Schedule> selectCurrentSchedule( List<Schedule> fullSchedule, Integer priority );

    /**
     * This method should find the list of resources available to work in a given week
     * An employee with 50% productivity is not available.
     * 
     * @return List of resources available to complete the work
     * 
     */
    List<Resource> searchAvailableResources( List<Resource> employees );

    /**
     * This method should simulate a single week of the project.
     * 
     * @return Week object representing the next week of work with all resources, schedules, and cost updated.
     * 
     */
    Week simulateWeek( Week week );

}
