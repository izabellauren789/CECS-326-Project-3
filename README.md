# CECS 326 Project 3
 
Use terminal to run
% RoadController.java

check output for deadlock


Consider that has this kind of scenario: two villages (Eastvillage and Westvillage) only have a
single-lane road for the connection. People from these two villages only can use this road for
exchange or share their produce. The road can be deadlocked if a people from either East or West
on the road simultaneously. To solve this problem to avoid deadlock, please design an algorithm
that uses semaphores and/or mutex locks. There have no concerns for the starvation cases.
Implement your solution using synchronization tools. In particular, represent the people at
Eastvillage and Westvillage as separate threads (east_village.java and west_village.java). Once a
people is on the road, the associated thread will sleep for a random period of time, representing
traveling across the road. You should design a new action for each people when they get into the
road, such as eat a donut, to wait for some time. Design your program so that you can create several
threads representing the two villages’ people without deadlock in the road