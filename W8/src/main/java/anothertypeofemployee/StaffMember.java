package anothertypeofemployee;

abstract public class StaffMember {
    protected String name, address, phone;
    
    public StaffMember(String eName, String eAddress, String ePhone) {
        name = eName;
        address = eAddress;
        phone = ePhone;
    }
    
    public String toString() {
        String result = "name: " + name + "\n";
        result += "address: " + address + "\n";
        result += "phone: " + phone;
        return result;
    }
    
    public abstract double pay();
}
