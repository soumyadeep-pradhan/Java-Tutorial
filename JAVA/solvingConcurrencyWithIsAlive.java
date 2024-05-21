public class solvingConcurrencyWithIsAlive extends Thread{
    public static int x = 5;
    public static void main(String[] args) {
        solvingConcurrencyWithIsAlive thread = new solvingConcurrencyWithIsAlive();
        thread.start();
        while (thread.isAlive()) {
            System.out.println("Waiting..........");
        }
        System.out.println("Main: " + x);
        x++;
        System.out.println("Main: "+ x);
    }
    public void run(){
        x++;
        int i =4;
        while (i>3) {
            i++;
        }
    }
}
