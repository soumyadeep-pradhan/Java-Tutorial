public class concurrencyInThread extends Thread {
    public static int amount = 0;
    public static void main(String[] args) {
        concurrencyInThread thread = new concurrencyInThread();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
    public void run(){
        amount++;
    }
}
