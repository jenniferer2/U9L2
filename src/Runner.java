public class Runner {
    public static void main (String [] args) {
        Animal myAnimal = new Animal("Fluffy", 8, true, "black");
        System.out.println(myAnimal.getName());
        System.out.println(myAnimal.getAge());
        System.out.println(myAnimal.getVaccinated());
        System.out.println(myAnimal.getColor());
        myAnimal.adopt();
        myAnimal.feed();
        myAnimal.clean();

        Dog myDog = new Dog("John", 5, true, "golden", true, false);

        System.out.println(myDog.getName());
        System.out.println(myDog.getAge());
        System.out.println(myDog.getVaccinated());
        System.out.println(myDog.getColor());
        System.out.println(myDog.getWalked());
        System.out.println(myDog.getwentToDogPool());
        myDog.walk();
        System.out.println(myDog.hasBeenWalked());
        myDog.goToPool();

        Cat myCat = new Cat("Baby", 4, false, "white", false, true);

        System.out.println(myCat.getName());
        System.out.println(myCat.getAge());
        System.out.println(myCat.getVaccinated());
        System.out.println(myCat.getColor());
        System.out.println(myCat.getPlayed());
        System.out.println(myCat.getNailsTrimmed());
        myCat.play();
        System.out.println(myCat.hasBeenPlayed());
        myCat.trimNails();

    }


}
