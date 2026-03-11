public class Main {

    public static void main(String[] args) {


     //3. Crea una clase Animal con el método makeSound ().Haz que Dog diga “Woof”y Cat diga “Meow”sobrescribiendo ese método.

        Dog dog = new Dog();
        Cat cat = new Cat();

        cat.makeSound();
        dog.makeSound();





    }

    public static class Animal{

        public void makeSound(){}


    }

    public static class Dog extends Animal{

        @Override
        public void makeSound() {
            super.makeSound();
            System.out.println("Woof, woof");
        }
    }

    public static class Cat extends Animal{
        @Override
        public void makeSound() {
            super.makeSound();
            System.out.println("MEOWWWWWWW");
        }
    }

}