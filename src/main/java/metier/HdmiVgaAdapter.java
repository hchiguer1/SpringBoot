package metier;

import dao.hdmi.IHdmi;
import dao.vga.IVga;

public class HdmiVgaAdapter implements IVga{
    private IHdmi hdmi;

    public HdmiVgaAdapter(IHdmi hdmi) {
        this.hdmi = hdmi;
    }

    @Override
    public void print(String s) {
        byte[] b=s.getBytes();
        hdmi.print(b);
    }
}
