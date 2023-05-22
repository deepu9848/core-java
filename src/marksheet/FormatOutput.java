package marksheet;

public class FormatOutput {

    public static void main(String[] args) {
       float percentage = 100/3f;

        String output = String. format("the percentage of  %.2f", percentage);
        System.out.println(output);

    }
}
