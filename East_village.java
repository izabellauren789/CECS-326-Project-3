import java.util.concurrent.Semaphore;

public class East_village {

   private void eatDonut(){
      try{
      Thread.sleep((long)(Math.random() *1000));

   } catch(InterruptedException e){
      e.printStackTrace();
   }
   }

}
