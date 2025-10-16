package pet;

public abstract class Pet {

    private String name;
    private int age;
    protected String species;

    public Pet(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "Name: "+name +" ,Species: "+species+", Age: "+ age;
    }

    public abstract String makeSound();

    public abstract String eat();

}
