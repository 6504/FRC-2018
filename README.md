# FRC-2018
**Robot Code** | [Vision Code](https://github.com/6504/FRC-2018-Vision) | [Dashboard](https://github.com/6504/JagwiresDash)

This is the code that was used to control FRC Team 6504's robot during the 2018 FRC game, FIRST Power UP.

## Robot Code Features 
* Mecanum Drive
    * Drive options for a Logitech Joystick/Xbox Controller
* Autonomous
    * Consistent crossing of the Auto Line
    * Untested scale and switch auto 
    * Ability to use field data to choose the right autonomous command

## Note 
**The code simulates the z-axis(rotation) for the Xbox controller by mapping it to a joystick, while the y-axis(forwards/backwards) and the x-axis(left/right) are mapped to a single joystick on the controller. The sensitivity has also been throttled to make driving more comfortable for the drivers.**

**RobotBuilder was used to generate boilerplate code as well.**

## Deploying on to the robot

The code is written in Java, so deploying onto the robot can be done using the WPILib tools in Eclipse. See this [WPILib Article](http://wpilib.screenstepslive.com/s/currentCS/m/java/l/242586-building-and-downloading-a-robot-project-to-the-roborio) for more information. 

## Authors
* [Chandi Kanhai](https://github.com/Chandi-95)
* Rojo Ramiandrisoa
* [Cole Wendrowski](https://github.com/blobspire)
* [Joshua Booth](https://github.com/boothinator), mentor
