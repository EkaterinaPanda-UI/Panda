public class Main {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 9, 5);
        Cat tomCat = new Cat("Tom", 57, 15);
        Cat butchCat = new Cat("Butch", 59, 17);
        Dog spikeDog = new Dog("Spike", 62, 13);
        Dog tykeDog = new Dog("Tyke", 18, 5);
        //System.out.println(tomCat.height);
    }
    public static class Mouse {
        public String name;
        public int height;
        public int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    public static class Dog {
        public String name;
        public int height;
        public int tail;

        public Dog(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    public static class Cat {
        public String name;
        public int height;
        public int tail;

        public Cat(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
}
