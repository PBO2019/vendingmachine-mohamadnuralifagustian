import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Welcome my Warkop Barokah ");

        ArrayList<String> kopi  = new ArrayList<>();
        ArrayList<String> topping = new ArrayList<>();

        Warkop robusta = new Warkop();
        Warkop gula = new Warkop();
        robusta.setJenisKopi("Robusta");
        gula.setTopping("gula");
        gula.setTopping(40);
        topping.add(gula.getTopping());
        robusta.setJumlahStokKopi(100);
        kopi.add(robusta.getJenisKopi());
        topping.add(gula.getTopping());

        Warkop arabica = new Warkop();
        Warkop cream = new Warkop();
        arabica.setJenisKopi("Arabica");
        arabica.setTopping("Cream");
        cream.setTopping(60);
        arabica.setJumlahStokKopi(50);
        kopi.add(arabica.getJenisKopi());
        topping.add(cream.getTopping());

        Warkop flores = new Warkop();
        Warkop susu = new Warkop();
        flores.setJenisKopi("Flores Punya");
        flores.setJumlahStokKopi(40);
        flores.setTopping("Susu");
        susu.setTopping(70);
        kopi.add(flores.getJenisKopi());
        topping.add(susu.getTopping());




        robusta.setTopping("Gula");
        System.out.println(" Menu Kopi Warkop Barokah");

        for(int i=0; i< kopi.size();i++){
            int j= i+1;
            System.out.println(j+". "+kopi.get(i));

        }
        System.out.println("___________________________");

        System.out.println(" Menu Topping Warkop Barokah");
        for(int i=0; i< topping.size();i++){
            int j= i+1;
            System.out.println(j+". "+topping.get(i));
    }
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukan Menu Kopi:");
        int pilihanKopi = keyboard.nextInt() -1;
        System.out.println("Masukan Menu Topping:");
        int pilihanTopping = keyboard.nextInt() -1;
        System.out.println("Pesanan Anda " + kopi.get(pilihanKopi) + " dengan Menu Topping "
                + topping.get(pilihanTopping));

    }

}
