package oop.sport;

public class SportMain {
    public static void main(String[] args) {

        Basketball basketboll = new Basketball("Alisher", 15, 195);
        Wrestling wrestling = new Wrestling("Aidar", 28, 80);
        System.out.println(basketboll.playingBall());
        System.out.println();
        System.out.println(basketboll.blockShot(false));
        System.out.println();
        System.out.println(basketboll.canJump());

        System.out.println(wrestling.Wreslingtrow());
        System.out.println(wrestling.fight());
        System.out.println(wrestling.streching());

    }
}
