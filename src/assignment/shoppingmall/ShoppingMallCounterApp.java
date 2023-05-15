package assignment.shoppingmall;

/**
 * * By the help of this application we can see how many people entered mall and ow many exited.
 * @since 11
 * @author Deepak
 * @version 11.8.1
 *
 */

public class ShoppingMallCounterApp {
    /**
     * call this constructor if anyone need to creat object of this class
     */
public ShoppingMallCounterApp(){
    /**
     * This is the entry point of shopping mall counter app
     * @param args pass some value here to string
     */
}
    public static void main(String[] args) {
   //     Doors d1 =new Doors();
   //     d1.personEntered();

   //     Doors d2 =new Doors();
   //     d2.personEntered();

   //     Doors d3 =new Doors();
   //     d3.personExited();

   //     Doors d4 =new Doors();
   //     d4.personExited();
   //
        Doors.personEntered();
        Doors.personEntered();
        Doors.personExited();
        Doors.personExited();
        System.out.println(Doors.getCounter());
   //     System.out.println(Doors.getCounter());
   //     System.out.println(Doors.getCounter());
    //    System.out.println(Doors.getCounter());


    }
}
