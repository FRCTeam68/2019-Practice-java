
package frc.robot.commands;

import frc.robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class HatchyStop extends CommandGroup {
	
	boolean isFinished = false;

	double hatchFlag = 0.0;

	public HatchyStop() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.hatch);
		
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		if(!Robot.lift.manualMode()){
		Robot.hatch.setHatchSpeed(0);
		}
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return isFinished;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}