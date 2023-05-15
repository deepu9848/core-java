package assignment.shoppingmall;

/**
 * this is door repesentatiom of shopping mall
 * @since 11
 * @author Deepak
 * @version 11.8.2
 *
 */
public class Doors {

    private static int counter;


      /**
               * whenever person enters th value will be added by one
              */
@Deprecated
    public static void personEntered(){
   // this.counter = this.counter +1;
        counter++;
        /**
         * whenever person exited the value will decrease by one
         * @deprecated this function is deprecated
          */

    }public static void personExited(){
    //this.counter =this.counter -1;
    counter--;
/**
 * call this functionnif you want the value of counter
 * @retunn it will count of the peron who are currently inside shopping mall
 */
    }public static  int getCounter(){
        return counter;
    }

}
