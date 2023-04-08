package dao;

import org.springframework.stereotype.Component;

@Component("TV")
public class Tv implements IHdmi{
    @Override
    public void print(byte[] b) {
        String s= new String(b);
        System.out.println("TV "+s);
    }


}
