package presentation;

import dao.Tv;
import dao.Clavier;
import dao.Ecran;
import dao.HdmiVgaAdapter;
import metier.UC;

import java.io.UnsupportedEncodingException;

public class Presentation {
    public static void main(String[] args) throws UnsupportedEncodingException {

        Ecran ecran = new Ecran();
        Clavier clavier = new Clavier();
        Tv tv = new Tv();
        UC uc = new UC(ecran);
        UC uc1 = new UC(clavier);
        HdmiVgaAdapter adapter=new HdmiVgaAdapter(tv);
        UC uc2 = new UC(adapter);
        System.out.print("Ecran Input : ");
        uc.printData("sdfsfsdgdsfgdfsg");
        System.out.println("Clavier Output : "+uc1.readData());
        System.out.print("Tv Input : ");
        uc2.printData("fsdfsdfsdsdfsdfdsfsdfs");

    }
}
