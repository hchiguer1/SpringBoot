package dao;

import org.springframework.stereotype.Component;

//@Repository("ecran")
@Component("Ecran")
public class Ecran implements IVga{
    @Override
    public void print(String s) {
        System.out.println("Ecran "+s);
    }
}
