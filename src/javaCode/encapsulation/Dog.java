package javaCode.encapsulation;

import javaCode.*;

/**
 *
 * @author rmoguel
 */
public class Dog {
    private String name;

    
    public String bark(){
        return this.getName() + " is barking! woof!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
       
}
