public class Bottle {

    private int volume;

    public Bottle(int volume){
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int drink() {
        int result = this.volume -= 10;
        return result;
    }

    public int empty() {
        setVolume(0);
        int emptyBottle = this.volume;
        return emptyBottle;
    }

    public int fill() {
        if (this.volume < 100){
            setVolume(100);}
            int filledBottle = this.volume;
            return filledBottle;

    }
}
