package people;

public class Teacher extends Person {

    private int salary;

    public Teacher(String name, String address, String country, int age , int salary) {
        super(name, address,country, age);
        this.salary = salary;

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getName() + "\n " + getAddress() + "\n " + getCountry() + "\n age: "+ getAge() + " \n salary " + this.salary + " euros/month";
    }
}
