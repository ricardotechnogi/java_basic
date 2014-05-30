package javagroovysampleapp;

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

class Dog {
    private String name;

    public String bark(){
        return this.name + " is barking! woof!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
