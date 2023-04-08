package dao;

import dao.IHdmi;
import dao.IVga;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class HdmiVgaAdapter implements IVga{
     IHdmi hdmi;

    public HdmiVgaAdapter(IHdmi hdmi) {
        this.hdmi = hdmi;
    }

    @Override
    public void print(String s) {
        byte[] b=s.getBytes();
        hdmi.print(b);
    }
}
