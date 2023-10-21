public class Main {
    public static void main(String[] args) {
        RoadController road = new RoadController();

        for (int i = 0; i < 5; i++) {
            Thread eastVillager = new Thread(new East_village(road, "EastVillager" + i));
            Thread westVillager = new Thread(new West_village(road, "WestVillager" + i));

            eastVillager.start();
            westVillager.start();
        }

    }
}