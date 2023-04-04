package dao.vga;

import org.springframework.stereotype.Repository;

//@Repository("ecran")
public class Ecran implements IVga{
    @Override
    public void print(String s) {
        System.out.println("Ecran "+s);
    }
}
