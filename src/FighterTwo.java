


public class FighterTwo implements Runnable {
    String name;
    Thread t = Thread.currentThread();

    public FighterTwo(String name) {
        this.name = name;
    }

    void activateFighter(Thread t) {
        this.t = t;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println(getName() + "'s run started ");
        try {
            Thread.sleep(2500);
            System.out.println("Now " + getName() + " is fighting back ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}