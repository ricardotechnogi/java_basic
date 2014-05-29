/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaCode.abstraction;

/**
 *
 * @author rmoguel
 */
public class Truck extends Vehicle {

    @Override
    public String drive() {
        return this.getName() + " will drive as a truck.";
    }
    
}
