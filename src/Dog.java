public class Dog extends Animal {
    private boolean walked;
    private boolean wentToDogPool;


    public boolean getwentToDogPool() {
        return wentToDogPool;
    }

    public boolean getWalked() {
        return walked;
    }

    public Dog (String name, int age, boolean v, String c, boolean walked, boolean wentToDogPool ) {
        super(name, age,v,c);
        this.walked = walked;
        this.wentToDogPool = wentToDogPool;
    }
    public void walk() {
        System.out.println("All dogs have been walked!");
        walked = true;
    }
    public boolean hasBeenWalked () {
        if(walked) {
            return true;
        }
        return false;
    }

    public void goToPool () {
        System.out.println("I went to the doggy pool!");
        wentToDogPool = true;

    }



}
