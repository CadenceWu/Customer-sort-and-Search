package customersortandsearch;

public class Customer implements Comparable<Customer> {

    private int id;
    private String name;
    private String email;
    private String mobile;

    public Customer(int id, String name, String email, String mobile) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }

    public void displayData() {
        System.out.println("The customer ID is: " + getId());
        System.out.println("             Name: " + getName());
        System.out.println("             Email: " + getEmail());
        System.out.println("             Mobile: " + getMobile());
    }

    public int compareTo(Customer compareCustomer) {
        int compareId = compareCustomer.getId();
        return this.getId() - compareId;//sorting by ascending order
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

}
