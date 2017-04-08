package sf.codingcomp.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import sf.codingcomp.model.Employee;
import sf.codingcomp.model.Schedule;

public class Reader {

    public List<Employee> readEmployees() {
        URL url = this.getClass().getResource( "/employees.json" );
        try {
            return new Gson().fromJson( new FileReader( url.getFile() ), new TypeToken<List<Employee>>() {
            }.getType() );
        } catch ( JsonIOException | JsonSyntaxException | FileNotFoundException e ) {
            throw new RuntimeException( e );
        }
    }

    public List<Schedule> readSchedule() {
        URL url = this.getClass().getResource( "/schedule.json" );
        try {
            return new Gson().fromJson( new FileReader( url.getFile() ), new TypeToken<List<Schedule>>() {
            }.getType() );
        } catch ( JsonIOException | JsonSyntaxException | FileNotFoundException e ) {
            throw new RuntimeException( e );
        }
    }

}
