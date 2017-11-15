import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

//class Field {
    //int[] FreeField = new int[5];
//}
class Ship {
    int cords;
    ArrayList<Integer> lib1;

    public void Cords() {
        ArrayList<Integer> lib1 = new ArrayList<Integer>();
        int x = 1 + (int) (Math.random() * 3);
        System.out.println("x = " + x);
        cords = 1 + (int) (Math.random() * 4);
        lib1.add(cords);
        for(int i = 1; i <= x; i++) {
            cords++;
            lib1.add(cords);
            //System.out.println(cords);
        }
        //for(int k = lib1.size()-1; k > 0; k--){
           // lib1.get(k);
           // System.out.print(lib1.get(k)+ " ");
        }

    public ArrayList<Integer> Mas1() {
        //return lib1;
        System.out.println(lib1.get(0));
        return null;
    }
}
class Inp {
    public void Input() {
        Ship ship = new Ship();
        ship.Mas1();
        ArrayList<Integer> lib2 = new ArrayList<Integer>();
        //System.arraycopy(ship.lib1, 0, lib2, 0, 1);
        boolean Ty = false;
        ship.Cords();
        while (Ty == false) {
            Scanner inp1 = new Scanner(System.in);
            int x = inp1.nextInt();
            for (int y = 0; x != y; y++) {
                if (lib2.equals(x)) {
                    System.out.println("Попал");
                    lib2.remove(x);
                } else if (x != ship.cords) {
                    System.out.println("Мимо");
                }
                //if(lib2.isEmpty()) {
                // System.out.println("Потопил");
                // Ty = true;
                //}
            }
        }
    }
}
class StartGame {
    public static void main(String[] args) {
        System.out.println("Сделайте ход:");
        Ship ship = new Ship();
        ship.Mas1();
        //Inp inp = new Inp();
       // inp.Input();
    }
}
