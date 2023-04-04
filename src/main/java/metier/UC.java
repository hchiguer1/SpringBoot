package metier;

import dao.usb.IUsb;
import dao.vga.IVga;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class UC {
    private IUsb usb;
    private IVga vga;
    public UC(IUsb usb) {
        this.usb = usb;
    }
    public UC(IVga vga) {
        this.vga = vga;
    }
    public UC() {
    }

    public UC(IUsb usb, IVga vga) {
        this.usb = usb;
        this.vga = vga;
    }

    public int readData(){
        return usb.read();
    }
    public void printData(String s){
        vga.print(s);
    }
}
