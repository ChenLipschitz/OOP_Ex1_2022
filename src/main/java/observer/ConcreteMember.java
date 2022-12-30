package observer;

/**
 * The following class implements the Member class
 * as part of Ex1 OOP 2022
 *
 * @author Chen Lipschitz- 207270612,
 * Yael Gabay-322653411
 */

public class ConcreteMember implements Member{

    private UndoableStringBuilder usbConcreteMember;
    private String nameUsbCM = "";

    public ConcreteMember(String name){
        this.usbConcreteMember = new UndoableStringBuilder();
        this.nameUsbCM = name;
    }

    //@Override
    public void update(UndoableStringBuilder usb) {
        usbConcreteMember = usb;
    }

    public String getNameUsbCM() {
        return nameUsbCM;
    }
    
    public UndoableStringBuilder getUsbConcreteMember() {
        return usbConcreteMember;
    }

    @Override
    public String toString() {
        return "ConcreteMember{" +
                "usbConcreteMember=" + usbConcreteMember +
                ", nameUsbCM='" + nameUsbCM + '\'' +
                '}';
    }
}
