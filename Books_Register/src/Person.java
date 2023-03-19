public class Person {

    protected String name = "default";
    protected int age = 0;
    protected String cityOfBirth = "default";


    public Person(String name, int age, String cityOfBirth) {
        this.name = name;
        this.age = age;
        this.cityOfBirth = cityOfBirth;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public String getCityOfBirth() {return cityOfBirth;}
    public void setCityOfBirth(String cityOfBirth) {this.cityOfBirth = cityOfBirth;}
}
