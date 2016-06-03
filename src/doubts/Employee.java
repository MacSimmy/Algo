package doubts;

/**
 * Created by mahendra.chhimwal on 5/30/2016.
 */
public class Employee implements Comparable<Employee>{
    private String address;
    private int id;
    private double salary;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public int compareTo(Employee o) {
        return this.id>o.id? 1 :(this.id == o.id)?0:-1;
    }
}
