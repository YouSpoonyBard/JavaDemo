package sf.codingcomp.model;

public class Resource {

    private Employee employee;
    private int hours = 40;

    public static Resource fromEmployee( Employee e ) {
        Resource r = new Resource();
        r.setEmployee( e );
        return r;
    }

    public static Resource overtime( Resource r ) {
        r.setHours( 60 );
        return r;
    }
    
    public static Resource tooMany( Resource r ) {
        r.setHours( 71 );
        return r;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee( Employee employee ) {
        this.employee = employee;
    }

    public int getHours() {
        return hours;
    }

    public void setHours( int hours ) {
        this.hours = hours;
    }

}
