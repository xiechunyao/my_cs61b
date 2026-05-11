package lecture2;

public class Dog {

    public int weightInPounds; 

    public Dog(int weight) {
        weightInPounds = weight;
    }

    public void makeNoise() {
        if (weightInPounds < 20) {
            System.out.println("yipyipyip!!");
        } else if (weightInPounds < 30) {
            System.out.println("bark!");
        } else {
            System.out.println("arooo!");
        }
    }


}
