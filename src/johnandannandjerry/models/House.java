/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnandannandjerry.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mac
 */
public class House extends Building {
    
    private List<Mammal> mammals = new ArrayList<Mammal>();
    Door gardenDoor = new Door();
    private Central central = new Central();
    private Garden garden = new Garden();
    
    public House() {
        gardenDoor.setName("This door is the House's door of: " + this.getName());
        central.setDoor(gardenDoor);
        garden.setDoor(gardenDoor);
    }
    
    public House(String name, List<Mammal> mammals) {
        this.setName(name);
        central.setDoor(gardenDoor);
        garden.setDoor(gardenDoor);
        if (mammals.size() >= 3) {
            List<Mammal> tempMammals = new ArrayList<>();
            tempMammals.add(mammals.get(0)); // John
            tempMammals.add(mammals.get(1)); // Anna
            central.setMammals(tempMammals); // ArrayAsList
        }
    }
    
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("House{name=").append(getName());
        sb.append('}');
        return sb.toString();
    }

    public List<Mammal> getMammals() {
        return mammals;
    }

    public void setMammals(List<Mammal> mammals) {
        this.mammals = mammals;
    }

    public Central getCentral() {
        return central;
    }

    public void setCentral(Central central) {
        this.central = central;
    }

    public Garden getGarden() {
        return garden;
    }

    public void setGarden(Garden garden) {
        this.garden = garden;
    }
    
}
