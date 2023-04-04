package dao.hdmi;

import org.springframework.stereotype.Repository;

import java.util.Arrays;


public class Tv implements IHdmi{
    @Override
    public void print(byte[] b) {
        String s= new String(b);
        System.out.println(s);
    }


}
