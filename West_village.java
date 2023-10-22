import java.util.concurrent.Semaphore;
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
         // System.out.println(name + " is arriving at the road.");
         road.useRoad(name);
         // System.out.println(name + " has crossed the road.");
         Thread.sleep(new Random().nextInt(1000));
         road.releaseRoad(name);
         // System.out.println(name + " has finished the exchange.");
      } catch (InterruptedException e) {
         Thread.currentThread().interrupt();
      }
   }

   /*
    * private void walk(){
    * try{
    * Thread.sleep((long)(Math.random() *1000));
    * 
    * } catch(InterruptedException e){
    * e.printStackTrace();
    * }
    * }
    * 
    * private void eatDonut(){
    * try{
    * Thread.sleep((long)(Math.random() *1000));
    * 
    * } catch(InterruptedException e){
    * e.printStackTrace();
    * }
    * }
    */
}
