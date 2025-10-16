package pet;

public class Dog extends Pet {

    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age, "Dog");
        this.breed=breed;
    }

    @Override
    public String makeSound(){
        return "brak";
    }

    @Override
    public String eat(){
        return "dog food";
    }

    @Override
    public String toString(){
        return super.toString()+", breed: "+breed;
    }
}
