
package frc.robot.commands;

//import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
//import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.Robot;
import frc.robot.RobotMap;

/**
 * An example command.  You can replace me with your own command.
 */
public class AutoLiftLB extends Command {
	
	private boolean isFinished = false;
	private double setPoint = 0;
	private double currentPos = 0;
	
	public AutoLiftLB() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.lift);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		setPoint = Robot.lift.getLastSetPoint();
		//System.out.println("Initial position RB  is "+ setPoint);
	}

	// Called repeatedly when this Command is scheduled to run+
	@Override
	protected void execute() {
		if(!Robot.lift.isManualMode){
		//System.out.println("Holding Right Button");
		if(Robot.oi.getXboxManipulateLB() || Robot.oi.getXboxManipulateLTButton()) {
		//	System.out.println("Yep, RB is pressed");
			if(Robot.oi.getXboxManipulateX()){
		//		System.out.println("And A or B is pressed");
				Scheduler.getInstance().add(new AutoWrist(RobotMap.INTAKE_WRIST_HATCH_POSITION));
				setPoint = RobotMap.LIFT_GROUND;
			} else if (Robot.oi.getXboxManipulateCircle()) {
				//System.out.println("And X is pressed");
				Scheduler.getInstance().add(new AutoWrist(RobotMap.INTAKE_WRIST_HATCH_POSITION));
				setPoint = RobotMap.LIFT_ROCKET_HATCH_LOW;	
			} else if (Robot.oi.getXboxManipulateSquare()) {
				//System.out.println("And X is pressed");
				Scheduler.getInstance().add(new AutoWrist(RobotMap.INTAKE_WRIST_HATCH_POSITION));
				setPoint = RobotMap.LIFT_ROCKET_HATCH_MID;
			} else if (Robot.oi.getXboxManipulateTriangle()) {
				//System.out.println("And Y is pressed");
				Scheduler.getInstance().add(new AutoWrist(RobotMap.INTAKE_WRIST_HATCH_POSITION));
				setPoint = RobotMap.LIFT_ROCKET_HATCH_HIGH;
			} 
		
		} 
		//System.out.println("Setting setPoint to RB " + setPoint);
		Robot.lift.setPosition(setPoint);
		
		currentPos = Robot.lift.getPosition();
		if ( currentPos == setPoint ) {
			isFinished = true;
		}
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
	//	System.out.println("RB WhileHeld Ended " + setPoint);
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}