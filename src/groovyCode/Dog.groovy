package groovyCode

/**
 *
 * @author rmoguel
 */
class Dog {
    String name
    
    public String bark(){
        "${this.name} from Groovy is barking! woof!"
    }

}

