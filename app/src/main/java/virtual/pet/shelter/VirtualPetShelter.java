package virtual.pet.shelter;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    private Map<String, VirtualPet> petShelter = new HashMap<>();
    

    public void admitPet(String name){
        VirtualPet pet = new VirtualPet(name);
        petShelter.put(name, pet);
    }

    public void adoptPet(String name){
        petShelter.remove(name);
    }

    public void feedPets(){
        for(Map.Entry<String, VirtualPet> entry : petShelter.entrySet()){
            entry.getValue().feedPet();
        }
    }

    public void waterPets(){
        for(Map.Entry<String, VirtualPet> entry : petShelter.entrySet()){
            entry.getValue().waterPet();
        }
    }

    public void playWithPets(){
        for(Map.Entry<String, VirtualPet> entry : petShelter.entrySet()){
            entry.getValue().playWithPet();
        }
    }

    public void displayDogs(){
        if(!VirtualPet.isEmpty()){
            System.out.println("\t  Dogs available for Adoption");

            for(Map.Entry<String, VirtualPet> entry : VirtualPet.entrySet()){
                System.out.println("Name: "+ pet.getName() + " Energy:"  +pet.getEnergy()+ " Hunger:" +pet.getHunger()+ " Thirst: " +pet.getThirst());
            }
        }
    }
}
