public class Cat extends Animal {
    private boolean played;
    private boolean nailsTrimmed;

    public boolean getPlayed () {
        return played;
    }
    public boolean getNailsTrimmed (){
        return nailsTrimmed;
    }

    public Cat (String name, int age, boolean v, String color, boolean played, boolean nailsTrimmed ) {
        super(name, age,v, color);
        this.played = played;
        this.nailsTrimmed = nailsTrimmed;
    }
    public void play() {
        System.out.print("All cats have been played with!");
        played = true;
    }
    public boolean hasBeenPlayed () {
        if(played) {
            return true;
        }
        return false;
    }
    public void trimNails () {
        System.out.print("My nails have been trimmed1");
        nailsTrimmed = true;
    }



}
