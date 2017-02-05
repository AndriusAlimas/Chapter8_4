package example;
import example.PersonBean;

public class EmployeeBean extends PersonBean {
	// FIELDS:
	private int empID;
    private int startYear;
    private double payRate;
    //SETTERS:
    public void setEmpID(int n) {
        this.empID = n;
    }
    public void setStartYear(int n) {
        this.startYear = n;
    }
    public void setPayRate(double d) {
        this.payRate = d;
    }
    // GETTERS:
    public int getEmpID() {
        return this.empID;
    }
    public int getStartYear() {
        return this.startYear;
    }
    public double getPayRate() {
        return this.payRate;
    }
}
