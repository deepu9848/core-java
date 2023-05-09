package assignment.shoppingmall;

public class Doors {

    private static int counter;

    public static void personEntered(){
   // this.counter = this.counter +1;
        counter++;

    }public static void personExited(){
    //this.counter =this.counter -1;
    counter--;

    }public static  int getCounter(){
        return counter;
    }

}
