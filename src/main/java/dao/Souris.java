package dao;

import org.springframework.stereotype.Component;

@Component("Souris")
public class Souris implements IUsb{
    public int read(){
        int a=2;
        System.out.print("Je suis une Souris : ");
        return a;
    }
}
