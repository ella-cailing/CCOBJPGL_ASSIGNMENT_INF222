package Cat;

public class App {
    public static void main(String[] args) throws Exception {

        Pet myPet = new Pet();

        myPet.meow();
        System.out.println(myPet.weight);
        System.out.println(myPet.lifeExpectancy);
    }
}