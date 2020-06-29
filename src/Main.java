

public class Main {

    public static void main(String[] args) {
        System.out.println("Starging main");

        FighterOne tyson = new FighterOne("Tyson", 10);
        FighterTwo hollyField = new FighterTwo("HollyField");

        tyson.run();
        hollyField.run();

        Thread tysonThread = new Thread(tyson);
        Thread hollyThread = new Thread(hollyField);

        tyson.activateFighter(hollyThread);
        hollyField.activateFighter(tysonThread);

        tyson.run();
        hollyField.run();



    }
}

//
//class Thread {
//
//    public Thread (Fi)
//}