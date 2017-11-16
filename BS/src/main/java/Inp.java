import java.util.ArrayList;
import java.util.Scanner;

// Каждый класс в отдельном файле с совпадающим именем
class Inp {
    //method should start from lowerCase
    public void input() {
        Ship ship = new Ship();
        ArrayList<Integer> localShipPos = ship.getCords();
        //checkin - weither it was hitted or not should be moved to 
        // ship class and add there method - checkHit
        // all local variables starts from lower case
        boolean ty = false;
        // you cannot create such variable incide of loop
        Scanner inp1 = new Scanner(System.in);
        while (true) {
            //Should check this
            int x = Integer.parseInt(inp1.next());
            // First method of checking
            // Commented as it more complex
            // than second one
            // for (int pos : localShipPos) {
            //     if (x == pos) {
            //         System.out.println("Hit");
            //         localShipPos.remove(x);
            //         break;
            //     }
            //     // not the best logic, but should work
            //     System.out.println("Missed");
            // }
            // if (localShipPos.size()==0){
            //     System.out.println("Drawned");
            //     break;
            // }

            // second method
            if (localShipPos.contains(x)) {
                System.out.println("Hit");
                localShipPos.remove(x);
            } else {
                System.out.println("Missed");
            }
            if (localShipPos.size() == 0) {
                System.out.println("Drawned");
                break;
            }
        }
        inp1.close();
    }
}