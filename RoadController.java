
/**
 * RoadController.java
 */
import java.util.concurrent.Semaphore;
import java.util.Random;

public class RoadController {
   private Semaphore semaphore;

   public RoadController() {
      semaphore = new Semaphore(1); // only allows for one villager to enter the road at a time
   }

   /* Actions available for villagers to do while traveling the road */
   public enum VillagerAction {
      DRINK_WINE,
      EAT_DONUT,
      READ_JJK,
      PLAY_CARDS,
      CRY
   }

   public void useRoad(String villageName) {
      try {
         System.out.println(villageName + " has arrived at the road.");
         semaphore.acquire(); // allows access to semaphore
         /* performs random action while traveling road */
         VillagerAction randomAction = getRandomAction();
         switch (randomAction) {
            case DRINK_WINE:
               System.out.println(villageName + " is drinking wine while traveling the road.");
               break;
            case EAT_DONUT:
               System.out.println(villageName + " is eating a donut while traveling the road.");
               break;
            case READ_JJK:
               System.out.println(villageName + " is reading JJK while traveling the road.");
               break;
            case PLAY_CARDS:
               System.out.println(villageName + " is playing cards while traveling the road.");
               break;
            case CRY:
               System.out.println(villageName + " is crying while traveling the road.");
               break;
         }
      } catch (InterruptedException e) {
         Thread.currentThread().interrupt();
      }
   }

   public void releaseRoad(String villageName) {
      System.out.println(villageName + " has finished the exchange.");
      semaphore.release(); // releases from semaphore, allows for another thread to access
   }

   /* generated random action from list of actions */
   private VillagerAction getRandomAction() {
      Random random = new Random();
      return VillagerAction.values()[random.nextInt(VillagerAction.values().length)];
   }

}
