package metier;

import dao.IUsb;
import dao.IVga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class UC {
    @Autowired@Qualifier("Souris")
     IUsb usb;
    @Autowired@Qualifier("VideoProj")
     IVga vga;
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
