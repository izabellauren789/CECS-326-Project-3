import java.util.concurrent.Semaphore;

public class West_village {

   private void walk(){
      try{
      Thread.sleep((long)(Math.random() *1000));

   } catch(InterruptedException e){
      e.printStackTrace();
   }
   }

   private void eatDonut(){
      try{
      Thread.sleep((long)(Math.random() *1000));

   } catch(InterruptedException e){
      e.printStackTrace();
   }
   }

}
