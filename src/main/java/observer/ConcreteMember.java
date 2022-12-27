package observer;

public class ConcreteMember implements Member{

    private UndoableStringBuilder usbConcreteMember;
    private String nameUsbCM;

    public ConcreteMember(String name){
        this.usbConcreteMember = new UndoableStringBuilder();
        this.nameUsbCM = name;
    }

    @Override
    public void update(UndoableStringBuilder usb) {
        usbConcreteMember = usb;
    }

    public String getNameUsbCM() {
        return nameUsbCM;
    }

    @Override
    public String toString() {
        return "ConcreteMember{" +
                "usbConcreteMember=" + usbConcreteMember +
                ", nameUsbCM='" + nameUsbCM + '\'' +
                '}';
    }
}
