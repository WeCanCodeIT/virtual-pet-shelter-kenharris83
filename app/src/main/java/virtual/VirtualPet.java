package virtual;

public class VirtualPet {
private String name;
private String dogBreed;
private int energy;
private int hunger;
private int thirst;


public VirtualPet(String name, String dogBreed, int energy, int hunger, int thirst) {
    this.name = name;
    this.dogBreed = dogBreed;
    this.energy = energy;
    this.hunger = hunger;
    this.thirst = thirst;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getEnergy() {
    return energy;
}

public void setEnergy(int energy) {
    this.energy = energy;
}

public int getHunger() {
    return hunger;
}

public void setHunger(int hunger) {
    this.hunger = hunger;
}

public int getThirst() {
    return thirst;
}

public void setThirst(int thirst) {
    this.thirst = thirst;
}

public String getDogBreed() {
    return dogBreed;
}


public void tick(){
    this.hunger -= 1;
    this.thirst -= 1;
    this.energy -= 1;
    }

public void petStats(){
    System.out.println("Name: " +this.name);
    System.out.println("Hunger level: " +this.hunger);
    System.out.println("Thirst level: " +this.thirst);
    System.out.println("Energy level: " +this.energy);
    
}

public void feedPet(){
    this.hunger +=4;
    this.energy +=2;
    this.thirst -=2;
}

public void waterPet(){
    this.hunger -=2;
    this.energy -=1;
    this.thirst +=3;
}

public void playWithPet(){
    this.hunger -=2;
    this.energy -=3;
    this.thirst +=2;
}


}
