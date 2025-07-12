public class Address {
    String city;
    String state;
    int pin;

    public Address(String city,String state,int pin) {
        this.city=city;
        this.state=state;
        this.pin=pin;
    }

    public String getCity() {
        return city;
    }

    public int getPin() {
        return pin;
    }

    public String getState() {
        return state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pin=" + pin +
                '}';
    }
}
