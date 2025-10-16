package veterinarian;

import pet.Pet;

public class SpecialistVeterinarian implements Veterinarian {

    private String name;
    private String specialty;

    public SpecialistVeterinarian(String name, String speciality){
        this.name=name;
        this.specialty=speciality;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String examinePet(Pet pet) {
        return "An examination was performed on " +pet.getName() + ", an specialist examination on: "+specialty;
    }

}
