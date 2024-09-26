import java.time.LocalDate;

public class CarrotSeller {

    private String name;
    private LocalDate birthDate;
    private int numOfDeals;
    private int tunsOfCarrotSold;
    private String cityName;
    private String plateNumber;
    private double fuelConsumption;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfDeals() {
        return numOfDeals;
    }

    public void setNumOfDeals(int numOfDeals) {
        this.numOfDeals = numOfDeals;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getTunsOfCarrotSold() {
        return tunsOfCarrotSold;
    }

    public void setTunsOfCarrotSold(int tunsOfCarrotSold) {
        this.tunsOfCarrotSold = tunsOfCarrotSold;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
