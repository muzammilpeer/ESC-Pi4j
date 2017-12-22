# ESC-Pi4j
ESC calibration, arm example using Pi4j in raspberry pi. 30A ESC, with 1000 kv motor


How to run programg:
sudo java -jar electronicSpeedControllerApp.jar 

GPIO_26 = BCM = 12 (Raspberry Pi 3 Model B). used for testing you can change any PWM supported Pin.

My next target is to use this code in my quadcopter project.


For getting the pin mapping type this in terminal.

gpio readall

<img width="583" alt="screen shot 2017-12-08 at 12 31 02 am" src="https://user-images.githubusercontent.com/859865/34304644-6d4a8144-e75c-11e7-8a47-e0cccf364f2b.png">


Video:
https://www.youtube.com/watch?v=AIJrR_V0Iz8
