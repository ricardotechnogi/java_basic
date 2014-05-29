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
public abstract class Vehicle {
    private String name;
    
    public abstract String drive();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
