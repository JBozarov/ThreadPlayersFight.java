

public class FighterOne implements Runnable {
    String name;
    int strength;
    Thread t = Thread.currentThread();

    public FighterOne(String name, int strength) {
        this.name = name;
        this.strength = strength;
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
//            while (strength>0) {
                Thread.sleep(2000);
                System.out.println(getName()+ " is attacking now ");
                System.out.println( getName() + "'s attack ended");
//            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
