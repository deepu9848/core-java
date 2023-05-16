package assignment.sum123;

public class OddCharacter {
// n = 3
    //aaa
    // n=4
    //aaab
    public String generateTheString(int n) {
        StringBuilder restore = new StringBuilder();
        if (n % 2 == 0)
            restore. append("a");
        while (n % 2> 1){
            restore.append("b");
        }
            return restore.toString();
        //convert stringBuilder to String

    }

}
