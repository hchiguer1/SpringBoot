package dao.usb;

import org.springframework.stereotype.Repository;

@Repository("clavier")
public class Clavier implements IUsb{
    @Override
    public int read() {
      return 1;
    }
}
