package people;

public class Person {

    private String name;
    private String address;
    private String country;
    private int age;

    public Person(String name, String address, String country, int age) {
        this.name = name;
        this.address = address;
        this.country = country;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + "\n " + this.address + "\n " + this.country + "\n age: " + this.age;

    }
}

