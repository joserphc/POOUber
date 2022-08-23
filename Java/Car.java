class Car {
    private Integer id;
    private String license;
    private Account driver;
    protected Integer passengers;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    void carDataPrint(){
        if(passengers != null){
            System.out.println("License: " + license + " Name driver: " + driver.name + " Passengers: " + passengers);
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    public Integer getPassenger(){
        return passengers;
    }

    public void setPassenger(Integer passengers){
        if(passengers == 4){
            this.passengers = passengers;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }
}
