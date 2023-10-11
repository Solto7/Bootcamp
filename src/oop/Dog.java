package oop;

public class Dog {
    // AM   DT    identity
    public String name;
    protected int age;
    public String color;
    public String breed = "Labrador";

    // AM    ?static   DT    identity
    public            String eat(){
        return "eating";
    }
    public String bark(){
        return "Bark Bark";

    }

    public String sleep(){
        return "Sleeping";

    }
    public boolean isSleep(String answer){
        if(answer.equalsIgnoreCase("yes")){
            return true;
        }else {
            return false;

        }
    }

}

// Variables

// Local variables --> methods scope
// Instance variables (fields)--> class scope

