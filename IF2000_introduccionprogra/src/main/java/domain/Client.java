package domain;

public class Client {
    
    // Attributes:
    private String idCard;   // cédula
    private String name;     // nombre
    private String phone;    // teléfono
    private String address;  // dirección

    // Constructor
    public Client(String idCard, String name, String phone, String address) {
        this.idCard = idCard;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    // Getters and Setters
    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // toString
    @Override
    public String toString() {
        return "--------Client--------"
                + "\nID Card: " + getIdCard()
                + "\nName: " + getName()
                + "\nPhone: " + getPhone()
                + "\nAddress: " + getAddress();
    }
}
