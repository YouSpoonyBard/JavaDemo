package sf.codingcomp;

import java.util.List;

import sf.codingcomp.model.Employee;
import sf.codingcomp.model.Resource;
import sf.codingcomp.model.Schedule;
import sf.codingcomp.model.Week;
import sf.codingcomp.reader.Reader;

public class ProjectManagementSimulationImplementation implements ProjectManagementSimulation {

    private Reader reader = new Reader();

    @Override
    public List<Schedule> getInitialSchedule() {
        return null;
    }

    @Override
    public List<Employee> getInitialEmployees() {
        return null;
    }

    @Override
    public List<Schedule> selectCurrentSchedule( List<Schedule> fullSchedule, Integer priority ) {
        return null;
    }

    @Override
    public List<Resource> searchAvailableResources( List<Resource> resources ) {
        return null;
    }

    @Override
    public Week simulateWeek( Week week ) {
        return null;
    }

    private void validateNumberOfResources( int max, final String skill, List<Resource> availableResources ) {
    }

    // Implementing this but not intending to be part of skeleton or JUnits
    private List<Resource> searchUnavailableResources( List<Resource> resources ) {
        return null;
    }

}
