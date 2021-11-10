package Day22.PetManagementSystem;

public class MainPet {

    public static void main(String[] args) {

        Bird eagle = new Bird();

        eagle.color = "Grey";
        eagle.age = 7;
        eagle.type = "Bald Eagle";
        eagle.listOfNeeds[0] = "Food";
        eagle.listOfNeeds[1] = "Water";
        eagle.listOfNeeds[2] = "Cage";

        eagle.ownerInfo = new Owner();

        eagle.ownerInfo.name = "Matthew";
        eagle.ownerInfo.ownerAge = 25;
        eagle.ownerInfo.gender = "Male";

        eagle.printProperties();


    }

}
