import com.sun.xml.internal.bind.v2.runtime.output.DOMOutput;

import javax.swing.*;

/**
 * Created by mjl84 on 2/8/2017.
 */
public class RoomAreas {
    public static void main(String[] args) {
        double number;
        double totalArea;
        String input;

        Rectangle kitchen = new Rectangle();
        Rectangle bedroom = new Rectangle();
        Rectangle den = new Rectangle();

        input = JOptionPane.showInputDialog("What is the kitchen's length?");
        number = Double.parseDouble(input);
        kitchen.setLength(number);
        input = JOptionPane.showInputDialog("What is the kitchen's width?");
        number = Double.parseDouble(input);
        kitchen.setWidth(number);

        input = JOptionPane.showInputDialog("What is the bedroom's length?");
        number = Double.parseDouble(input);
        bedroom.setLength(number);
        input = JOptionPane.showInputDialog("What is the bedroom's width?");
        number = Double.parseDouble(input);
        bedroom.setWidth(number);

        input = JOptionPane.showInputDialog("What is the den's Length?");
        number = Double.parseDouble(input);
        den.setLength(number);
        input = JOptionPane.showInputDialog("What is the den's Width?");
        number = Double.parseDouble(input);
        den.setWidth(number);

        totalArea = kitchen.getArea() + bedroom.getArea() + den.getArea();
        System.out.println("The total area is: " + totalArea + " squared ft");

    }


}
