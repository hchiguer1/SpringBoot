package dao;

import org.springframework.stereotype.Repository;

//@Repository("clavier")
public class Clavier implements IUsb{
    @Override
    public int read() {
      int b=3;
        System.out.println("Je suis une clavier : ");
        return b;
    }
}
