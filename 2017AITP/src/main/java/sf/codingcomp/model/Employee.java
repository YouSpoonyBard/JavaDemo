package sf.codingcomp.model;

import com.google.gson.annotations.SerializedName;

public class Employee {

    @SerializedName( "Name" )
    private String name;
    @SerializedName( "Level" )
    private String level;
    @SerializedName( "Availability" )
    private String availability;

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel( String level ) {
        this.level = level;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability( String availability ) {
        this.availability = availability;
    }
}
