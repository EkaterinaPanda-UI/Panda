public class Cat{
    public int age;
    public int weight;
    public int strength;
    public Cat(int age, int weight, int strength){
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }
    public Cat() {

    }
    public boolean fight (Cat anotherCat){
        boolean bAge = this.age >= anotherCat.age;
        boolean bWeight = this.weight >= anotherCat.weight;
        boolean bStrenght = this.strength >= anotherCat.strength;
        return  (bAge && bWeight) || (bWeight && bStrenght) || (bAge && bStrenght);
    }
    public static void main(String[] args){
        Cat cat1 = new Cat();
        cat1.age = 2;
        cat1.weight = 3;
        cat1.strength = 4;

        Cat cat2 = new Cat();
        cat2.age = 4;
        cat2.weight = 5;
        cat2.strength = 6;

        cat1.fight(cat2);
        cat2.fight(cat1);
        //System.out.println(cat1.fight(cat2));
    }
}
