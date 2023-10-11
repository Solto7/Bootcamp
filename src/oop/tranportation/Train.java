package oop.tranportation;

public class Train extends Transport implements Drive {

    public double cargo;
    public Train(String name, int model,double cargo) {
        super(name, model);
        this.cargo = cargo;
    }

    @Override
    public boolean isWork() {
        if (cargo>800000){
            return false;
        }else {
            return true;
        }
    }
    @Override
    public String driving() {
        if (isWork()==true){
            return "The Train can drive";
        }else {
            return "The train is overload";
        }
    }
}
