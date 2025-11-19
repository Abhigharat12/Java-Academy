public class Check{

    public static String checkme(int num) {
        if (num == 1234) {
            return "Success";
        } else {
            return "Failure"; // default return
        }
    }

    public static void main(String[] args) {
        System.out.println(checkme(1234));  // prints "Success"
        System.out.println(checkme(5678));  // prints "Failure"
    }
}
