package fashionstore.model;

/**
 *
 * @author Pythons, DCCO-ESPE
 */
public class Order {
    
    private int id;
    private String customerName;
    private long phoneNumber;
    private Measurement measurement;

    @Override
    public String toString() {
        return "Id =\t" + id + "\nCustomer Name =\t" + customerName + "\nPhone Number =\t" + phoneNumber + "\n" + measurement;
    }
    
    public Order (){
        id=0;
        customerName="";
        phoneNumber=0;
        measurement= new Measurement();
    }

    public Order(int id, String customerName, long phoneNumber, Measurement measurement) {
        this.id = id;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.measurement = measurement;
    }
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the phoneNumber
     */
    public long getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the measurement
     */
    public Measurement getMeasurement() {
        return measurement;
    }

    /**
     * @param measurement the measurement to set
     */
    public void setMeasurement(Measurement measurement) {
        this.measurement = measurement;
    }
    
}
