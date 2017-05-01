package io.github.aaronclong.inheritance;

/**
 * Created by aaronlong on 5/1/17.
 */
class Human {

    private String name;
    private int age;
    private String gender;
    private String occupation;
    private String address;

    public Human() {}

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }

    public int getAge() {
        return this.age;
    }

    public String getOccupation() {
        return this.occupation;
    }

    public String getAddress() {
        return this.address;
    }



}

public class SuperHuman extends Human {

    private String side;
    private String ability;

    public SuperHuman() {
    }

    public SuperHuman(String theirName, String goodOrBad, String theirAbility) {
        super();
        setName(theirName);
        side = goodOrBad;
        ability = theirAbility;
    }

    public void setSide(String theirSide) {
        side = theirSide;
    }

    public void setAbility(String theirAbility) {
        ability = theirAbility;
    }

    public String getAbilities() {
        return ability;
    }

    public static void main(String args[]){
        SuperHuman superman = new SuperHuman("Superman", "good", "Everything");
        superman.setAge(45);
        superman.setAddress("New York, NYC");
        superman.setOccupation("Jornalist/Bad-ass");
        superman.setGender("m");
        System.out.printf("Name: %s\n", superman.getName());
        System.out.printf("Age: %s\n", superman.getAge());
        System.out.printf("Gender: %s\n", superman.getGender());
        System.out.printf("Occupation: %s\n", superman.getAddress());
        System.out.printf("Abilities: %s\n", superman.getAbilities());
        System.out.printf("Occupation: %s\n", superman.getOccupation());
    }
}
