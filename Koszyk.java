package J25_1;

import java.util.ArrayList;

public class Koszyk {

    public ArrayList <String> produkt = new ArrayList<>();
    public ArrayList <Integer> ilosc = new ArrayList<>();

    public void addKoszyk (String produkt, int ilosc){

            this.produkt.add(produkt);
            this.ilosc.add(ilosc);

    }



}
