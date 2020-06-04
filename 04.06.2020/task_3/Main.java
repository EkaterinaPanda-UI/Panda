public class Main{
    public static void main(String[] args) {
        Horse horse = new Horse("Спирит", 12, 67);
        Pegasus pegasus = new Pegasus("Буцефал", 33, 154);
        horse.run();
        pegasus.fly();
    }
}
interface AnimalInterface{
    void run();
    void fly();
}
abstract class Animal implements AnimalInterface{
    private String nickname;
    private int age;
    private int velocity;

    public Animal(String nickname, int age, int velocity) {
        this.nickname = nickname;
        this.age = age;
        this.velocity = velocity;
    }
}
class Horse extends Animal{
    public Horse(String nickname, int age, int velocity) {
        super(nickname, age, velocity);
    }
    @Override
    public void run() {
        System.out.println("Игого, я поскакал");
    }
    @Override
    public void fly() {

    }
}
class Pegasus extends Horse{
    public Pegasus(String nickname, int age, int velocity) {
        super(nickname, age, velocity);
    }
    @Override
    public void fly(){
        System.out.println("Игого, я полетел");
    }
}
