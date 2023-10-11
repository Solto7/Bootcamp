package oop.sport;

public class Basketball extends Sport implements PlayingBall, BlockShot {
    public double heaght;

    public Basketball(String name, int age, double heaght) {
        super(name, age);
        this.heaght = heaght;
    }

    @Override
    public String playingBall() {
        return "Play with Ball";

    }

    @Override
    public boolean canJump(boolean hasPain) {
        if (hasPain == true) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean canJump() {
        return false;
    }


    @Override
    public String blockShot(boolean hasPain) {
        if (heaght>=190 && canJump(hasPain)){
            return "Can BlockShot";
        }else {
            return " Next time";
        }

    }
}
