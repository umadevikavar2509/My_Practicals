package corejava;

public class Cat extends Animal {
    public Cat(int age) {
        super(age);
    }

    @Override
    public String toString() {
        return "Cat - Age: " + age;
    }
}
