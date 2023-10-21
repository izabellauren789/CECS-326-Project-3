
/**
 * RoadController.java
 */
import java.util.concurrent.Semaphore;

public class RoadController {
   // Your code here
   private Semaphore semaphore;

   public RoadController() {
      semaphore = new Semaphore(1);
   }

   public void useRoad(String villageName) {
      try {
         System.out.println(villageName + " is traveling on the road.");
         semaphore.acquire();
         System.out.println(villageName + " is reading JJK.");
      } catch (InterruptedException e) {
         Thread.currentThread().interrupt();
      }
   }

   public void releaseRoad(String villageName) {
      System.out.println(villageName + " has finished the exchange.");
      semaphore.release();
   }

}
