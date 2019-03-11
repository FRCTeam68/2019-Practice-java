package frc.robot.subsystems;


import edu.wpi.first.wpilibj.command.Subsystem;


import frc.robot.RobotMap;
//import frc.robot.commands.IntakeManual;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;


public class Wrist extends Subsystem {

	// Declare Class variables here
    private WPI_TalonSRX wristMotor;

    public static Wrist wrist;
    

    public static Wrist getWrist() {
    	if (wrist == null) {
    		wrist = new Wrist();
    	}
    	return wrist;
    }
      

    private Wrist(){
      	wristMotor = new WPI_TalonSRX(RobotMap.INTAKE_WRIST_MOTOR); 
		wristMotor.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative,0,0);
		wristMotor.setSensorPhase(true); 
		wristMotor.configNominalOutputForward(0, 0);
		wristMotor.configNominalOutputReverse(0, 0);
		wristMotor.configPeakOutputForward(0.4,0); 
		wristMotor.configPeakOutputReverse(-.4,0); 

		wristMotor.selectProfileSlot(RobotMap.LIFT_PID_SLOT, 0);
		wristMotor.config_kF(RobotMap.WRIST_PID_SLOT, RobotMap.WRIST_PID_F, 0);
		wristMotor.config_kP(RobotMap.WRIST_PID_SLOT, RobotMap.WRIST_PID_P, 0);
		wristMotor.config_kI(RobotMap.WRIST_PID_SLOT, RobotMap.WRIST_PID_I, 0);
		wristMotor.config_kD(RobotMap.WRIST_PID_SLOT, RobotMap.WRIST_PID_D, 0);
//		wristMotor.setNeutralMode(NeutralMode.Brake);
    }
 
	@Override
	protected void initDefaultCommand() {
		//setDefaultCommand(new IntakeManual());
	}
	
	public void zeroEncoder() {
		wristMotor.setSelectedSensorPosition(0, 0, 10);
	}
    
    public void setWristSpeed(double speedC)
    {
        wristMotor.set(speedC);
    }

    public double getWristSpeed(){
        return wristMotor.getMotorOutputPercent();
    }


	public void setPosition(double position) {
		wristMotor.set(ControlMode.Position, position);
	}
	
	public double getPosition() {
		double position = 0;
		position = wristMotor.getSelectedSensorPosition(0);
		return position;
	}
}
