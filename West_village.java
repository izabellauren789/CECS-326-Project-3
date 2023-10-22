import java.util.Random;

public class West_village implements Runnable {

   private RoadController road;
   private String name;

   public West_village(RoadController road, String name) {
      this.road = road;
      this.name = name;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(new Random().nextInt(1000));
         road.useRoad(name);
         Thread.sleep(new Random().nextInt(1000));
         road.releaseRoad(name);
      } catch (InterruptedException e) {
         Thread.currentThread().interrupt();
      }
   }
}
