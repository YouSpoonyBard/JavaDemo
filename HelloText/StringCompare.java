import com.sun.org.apache.xpath.internal.SourceTree;

import javax.xml.transform.Source;

/**
 * Created by mjl84 on 1/23/2017.
 */
public class StringCompare {
    public static void main(String[] args) {
        String name1 = "Mark", name2 = "Mark", name3 = "Mary";

        if(name1.equals(name3)){
            System.out.println("The names are identical");

        }else{
            System.out.println("The names are different");
        }
        if(name1.compareTo(name3)>0){
            System.out.println("Mark is bigger than Mary");
        }else{
            System.out.println("Mary is bigger than Mark");
        }
        System.exit(0);


    }
}
