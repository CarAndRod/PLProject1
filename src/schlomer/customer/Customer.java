package schlomer.customer;

public class Customer {
    private String name;
    private String address;
    private String city;
    private String state;
    private int postalCode;

    public void setName(String CustomerName) {
        this.name = CustomerName;
    }

    public String getName() {
        return this.name;
    }

    public void setAddress(String CustomerAddress) {
        this.address = CustomerAddress;
    }

    public String getAddress() {
        return this.address;
    }

    public void setCity(String CustomerCity) {
        this.city = CustomerCity;
    }

    public String getCity() {
        return this.city;
    }

    public void setState(String CustomerState) {
        this.state = CustomerState;
    }

    public String getState() {
        return this.state;
    }

    public void setPostalCode(int CustomerPostalCode) {
        this.postalCode = CustomerPostalCode;
    }

    public int getPostalCode() {
        return this.postalCode;
    }

    public String getNameAndAddress() {
        return this.name + "\n" + this.address + "\n" +
                this.city + ", " + this.state + " " + this.postalCode;
    }

}
