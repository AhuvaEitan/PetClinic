import pet.Cat;
import pet.Dog;
import pet.Pet;
import veterinarian.GeneralVeterinarian;
import veterinarian.SpecialistVeterinarian;
import veterinarian.Veterinarian;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>();
        pets.add(new Dog("Buddy", 3, "Golden Retriever"));
        pets.add(new Dog("Max", 5, "Bulldog"));
        pets.add(new Cat("Mitsy", 2, "White"));
        pets.add(new Cat("Luna", 1, "Black"));

        Veterinarian generalVet = new GeneralVeterinarian("Avi");
        Veterinarian specialistVet = new SpecialistVeterinarian("Yossi", "Cardiology");

        for (Pet pet : pets) {
           System.out.println(pet);
            System.out.println("General Vet: " + generalVet.examinePet(pet));
            System.out.println("Specialist Vet: " + specialistVet.examinePet(pet));
            System.out.println();
        }
    }



}