package Final;

public final class Company extends Address {
    private int id = 1;
    private final Address address = new Address("VN");

    public Company(int id, String state) {
        super(state);
        this.id = id;
        address.setState(state);
    }

//    @Override
//    public final String ToString(){
//        return "State: "+ super.getState();
//    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNCCId(final int id) {
        String preID = "NCC";
//        id = 5;
        return preID + id;
    }
}

