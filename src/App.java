public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

class Person{
    private String name, lastName, eyeColor, hairColor, skinColor;
    private char gender;
    private float weight, height;

    public Person(String name, String lastName, String eyeColor, String hairColor, String skinColor, char gender,
            float weight, float height) {
        this.name = name;
        this.lastName = lastName;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.skinColor = skinColor;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }     
    
}