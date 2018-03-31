// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6504.MyRobot.commands;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

import org.usfirst.frc6504.MyRobot.Robot;
import org.usfirst.frc6504.MyRobot.RobotMap;

/**
 *
 */
public class AutoSwitchLeftAngle extends Command {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public AutoSwitchLeftAngle() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveTrain);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    
    //Define the drivetrain to be used later
    private final MecanumDrive robotDrive = RobotMap.driveTrainRobotDrive;
    
    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    	RobotMap.gyro.reset(); //Reset gyro angle to 0
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    	//Rotate right at 30% speed
    	robotDrive.driveCartesian(0, 0, 0.3);
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return RobotMap.gyro.getAngle() >= 85; //Attempt to turn 90 degrees while compensating for coasting
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    	//Stop all drivetrain motors
    	Robot.driveTrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    	end();
    }
}
