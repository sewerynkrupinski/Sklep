package J25_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Sklep {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Koszyk> koszyki = new ArrayList<>();
        HashMap<String, Double> sklep = new HashMap<>();


        sklep.put("chleb", 3.0);
        sklep.put("mleko", 2.5);
        sklep.put("piwo", 2.2);
        sklep.put("woda", 1.59);

        while(true){

            System.out.println("Czy chcesz rozpocząć zakupy jako nowy klient (T/N)");
            String decyzja = input.nextLine().toUpperCase();

            if(decyzja.equals("T")){

                Koszyk obj = new Koszyk();


                while(true){

                    System.out.println("Podaj co chcesz dodać do koszyka "+ sklep.keySet());
                    String produkt = input.nextLine();
                    if (!produkt.equals("") ) {
                        System.out.println("Podaj ilość");
                        int ilosc = input.nextInt();
                        input.nextLine();
                        obj.addKoszyk(produkt, ilosc);
                    }
                    else {
                        koszyki.add(obj);
                        break;
                    }

              }


            }
            else break;


        }


        int licznik = 1;
        for (Koszyk val : koszyki){



            System.out.println("Podsumowanie koszyka " + licznik + " :");
            double suma = 0.00;

            for (int i=0; i<val.produkt.size(); i++){

                System.out.println(val.produkt.get(i)+ " " + val.ilosc.get(i));
                suma  += (sklep.get(val.produkt.get(i)))* (val.ilosc.get(i));

            }
            System.out.println("Suma zakupów " + suma + " zł");
            licznik++;
            System.out.println();
         }







    }
}
