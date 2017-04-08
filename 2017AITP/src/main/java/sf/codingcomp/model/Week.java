package sf.codingcomp.model;

import java.util.List;

public class Week {

    private List<Schedule> schedules;
    private List<Resource> resources;
    private double cost;

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules( List<Schedule> schedules ) {
        this.schedules = schedules;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources( List<Resource> resources ) {
        this.resources = resources;
    }

    public double getCost() {
        return cost;
    }

    public void setCost( double cost ) {
        this.cost = cost;
    }

}
