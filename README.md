# CECS 326 Project 3
Izabel Smid 027494569 
Samuel Lee 017948812 

Driver class for Main used to run threads and semaphores
East_Village is thread representing one side
West_Village is thread representing one side
RoadController uses semaphore so only one side can be on the road at a time.
Once both village get on road, one village will do various random actions while waiting for other village to finish and get off the road.

Use terminal to run % java Main
check output for deadlock
