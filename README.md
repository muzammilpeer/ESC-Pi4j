# ESC-Pi4j
ESC calibration, arm example using Pi4j in raspberry pi. 30A ESC, with 1000 kv motor


How to run programg:
sudo java -jar electronicSpeedControllerApp.jar 

GPIO_26 = BCM = 12 (Raspberry Pi 3 Model B). used for testing you can change any PWM supported Pin.

My next target is to use this code in my quadcopter project.


For getting the pin mapping type this in terminal.
-> gpio readall
