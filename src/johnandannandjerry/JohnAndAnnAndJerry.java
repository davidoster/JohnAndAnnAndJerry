/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnandannandjerry;

import java.util.ArrayList;
import java.util.List;
import johnandannandjerry.models.Cat;
import johnandannandjerry.models.House;
import johnandannandjerry.models.Human;
import johnandannandjerry.models.Mammal;
import johnandannandjerry.models.Mouse;

/**
 *
 * @author mac
 */
public class JohnAndAnnAndJerry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Mammal john = new Human(); // CORRECT
        /*

            Έστω οτι ο Γιάννης έχει ένα σπίτι.
            Το σπίτι χωρίζεται στο κεντρικό μέρος που μένει και την αυλή.
            Για να πάει κάποιος στην αυλή πρέπει να ανοίξει μια πόρτα από το εσωτερικό του σπιτιού.
            Στο σπίτι μαζί με τον Γιάννη μένει και η γάτα του που λέγεται Άννα.
            Κάποια στιγμή ο Γιάννης ανοίγει την μεσόπορτα και η Άννα τρέχει στον κήπο.
            Ξαφνικά ο Γιάννης συνειδητοποιεί οτι η Άννα σταμάτησε ξαφνικά και κοιτάζει επίμονα προ μια κατεύθυνση.
            Πλησιάζει στην μεσόπορτα ο Γιάννης και βλέπει την Άννα να κοιτάζει ένα ποντίκι τον Τζέρυ.
            Ο Τζέρυ κοιτάζει την Άννα και ξεκινάει και τρέχει.
         */
        Human john = new Human();
        john.setName("John");

        Mammal anna = new Cat();
        anna.setName("Anna");

        Mammal jerry = new Mouse();
        jerry.setName("Jerry");

        List<Mammal> mammals = new ArrayList<>();
        mammals.add(john);
        mammals.add(anna);
        mammals.add(jerry);

        House house = new House("John's House", mammals);
        john.opensDoor(house.getGarden().getDoor());

    }

}
