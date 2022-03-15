public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;
    private String color;

    public String getColor () {
        return color;
    }

    public String getName () {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getVaccinated() {
        return vaccinated;
    }

    public Animal (String n, int a, boolean v, String c) {
        name = n;
        age = a;
        vaccinated = v;
        color = c;
    }

    public void adopt() {
        System.out.println("I got adopted!");
    }
    public void feed() {
        System.out.println("I have been fed");
    }

    public void clean () {
        System.out.println("My cage has been cleaned!");
    }


}
