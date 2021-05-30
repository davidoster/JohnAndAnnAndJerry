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
public class Central extends Building {

    private List<Mammal> mammals = new ArrayList<Mammal>();

    public Central() {
    }

    public Central(List<Mammal> mammals) {
        this.mammals = mammals;
    }

    public List<Mammal> getMammals() {
        return mammals;
    }

    public void setMammals(List<Mammal> mammals) {
        this.mammals = mammals;
    }

}
