package pet;

public class Cat extends Pet {

    private String color;

    public Cat(String name, int age, String color) {
        super(name, age, "cat");
        this.color=color;
    }


    @Override
    public String makeSound(){
        return "meow";
    }

    @Override
    public String eat(){
        return "Cat food";
    }

    @Override
    public String toString() {
        return super.toString() + " ,Color: " + color;

    }
}
