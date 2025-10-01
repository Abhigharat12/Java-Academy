public class TeaParty {

   public static void teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {  
            System.out.println("0.Bad");
        } 
        else if (tea >= 2 * candy || candy >= 2 * tea) { 
            System.out.println("2.Great");
        } 
        else {  
            System.out.println("1.Good");
        }
    }

    public static void main(String[] args) {

        teaParty(6, 8);
        teaParty(3, 8);
        teaParty(20, 6);
        
    }
}
