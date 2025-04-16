package Pages.Helper;

public class delay {
    public static void delaySeconds(int seconds){
        try{
            Thread.sleep(seconds * 1000L);
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
