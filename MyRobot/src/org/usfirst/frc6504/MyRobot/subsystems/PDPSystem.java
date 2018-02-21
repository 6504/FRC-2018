// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6504.MyRobot.subsystems;

import org.usfirst.frc6504.MyRobot.RobotMap;
import org.usfirst.frc6504.MyRobot.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.PowerDistributionPanel;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class PDPSystem extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final PowerDistributionPanel pDP = RobotMap.pDPSystemPDP;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
      // Put code here to be run every loop
      //Pushing amperage values to SmartDashboard
      SmartDashboard.putNumber("Total power", pDP.getTotalCurrent());
      SmartDashboard.putNumber("Back right wheel", pDP.getCurrent(0));
      SmartDashboard.putNumber("Front right wheel", pDP.getCurrent(1));
      SmartDashboard.putNumber("Front left wheel", pDP.getCurrent(14));
      SmartDashboard.putNumber("Back left wheel", pDP.getCurrent(15));
      SmartDashboard.putNumber("Lift motor", pDP.getCurrent(12));
      SmartDashboard.putNumber("Climber Motor 1", pDP.getCurrent(2));
      SmartDashboard.putNumber("Climber Motor 2", pDP.getCurrent(3));
      
    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

