package corejava;

public class MainAnimalAbstraction {
    public static void main(String[] args) {
        Dog myDog = new Dog(6);
        Cat myCat = new Cat(2);

        System.out.println(myDog.toString());
        System.out.println(myCat.toString());
    }
}
