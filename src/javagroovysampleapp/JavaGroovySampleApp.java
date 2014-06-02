package javagroovysampleapp;

import groovyCode.Dog;
/**
 *
 * @author rmoguel
 */
public class JavaGroovySampleApp {

    public static void main(String[] args) {
        System.out.println("This is java program");
        Dog yui = new Dog();
        yui.setName("Yui");
        System.out.println(yui.bark());
        
    } 
 
}


    
    
    
    
    
    
//    
//    public static void main(String[] args){
//        List<Bicycle> bikes = new ArrayList<Bicycle>();
//
//        bikes.add(new Bicycle(20, 10, 1));
//        bikes.add(new MountainBike(20, 10, 5, "Dual"));
//        bikes.add(new RoadBike(40, 20, 8, 23));
//        for(Bicycle bike : bikes){
//            bike.printDescription();
//        }
//      }
//}
