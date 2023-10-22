import java.util.Random;

public class East_village implements Runnable {

   private RoadController road;
   private String name;

   /* constructor */
   public East_village(RoadController road, String name) {
      this.road = road;
      this.name = name;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(new Random().nextInt(1000)); // thread sleeps for a random amount of time
         /*
          * each villager must use road and release road for next villager to be able to
          * access the road
          */
         road.useRoad(name);
         Thread.sleep(new Random().nextInt(1000));
         road.releaseRoad(name);
      } catch (InterruptedException e) {
         Thread.currentThread().interrupt();
      }
   }

}
