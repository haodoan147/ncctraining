public class Address {
    private String state = "";

    public Address(String state) {
        this.state = state;
    }

    public final String ToString(){
        return "State: "+state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
