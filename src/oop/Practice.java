package oop;
// если он посетит спорт за ровно 31 день то он похудеет на 2 кг
public class Practice {
    String name;
    int age;
    float weight;

    public String jump(){
        return "jumping";
    }
    public float gym(int days,float weight){

        if (days > 30){
            return weight -2;
        }
            return weight;
        }
    }

