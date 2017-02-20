/**
 * Created by mjl84 on 2/8/2017.
 */
public class TestRectangle {
    public static void main(String[] args) {

        String name = new String("John");
        String value = "Mick";


        Rectangle mLivingRoom = new Rectangle();
        mLivingRoom.setLength(5.0);
        mLivingRoom.setWidth(4.0);
        System.out.println("The area of my room is" + mLivingRoom.getArea());

        Rectangle myBedroom = new Rectangle(5.0, 4.0);

    }



}
