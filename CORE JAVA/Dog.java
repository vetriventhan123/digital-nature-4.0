public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
    
    public static void main(String[] args) {
        Animal generic = new Animal();
        Dog dog = new Dog();
        generic.makeSound();
        dog.makeSound();
    }
}