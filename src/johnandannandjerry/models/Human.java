/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnandannandjerry.models;

import interfaces.IHuman;

/**
 *
 * @author mac
 */
public class Human extends Mammal implements IHuman {

    public Human() {
        this.setName("NONAME");
    }

    public Human(String name) {
        this.setName(name);
    }

    @Override
    public String toString() {
        return "Human{" + "name=" + getName() + '}';
    }

    @Override
    void talk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void opensDoor(Door door) {
        System.out.println("Human " + this.getName() + " opens the door " + door.getName());
    }

}
