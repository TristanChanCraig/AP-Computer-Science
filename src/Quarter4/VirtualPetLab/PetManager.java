package Quarter4.VirtualPetLab;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class PetManager {
    private ArrayList<Pet> pets = new ArrayList<>();

    // Implement methods as needed to interact with the pets list
    public void addPet(Pet pet) { pets.add(pet); }
    public void removePet(Pet pet) { pets.remove(pet); }
    public void listPets() { for (Pet pet : pets) System.out.print(pet.getName() + " "); }
    public ArrayList<Pet> getListPets() { return pets; }
    public int getNumPets() { return pets.size(); }
    public Pet getSelectedPet(int lcv) { return pets.get(lcv); }

}
