 package frc.robot;

public class RobotMap {
	
    private static RobotMap robotMap;
        
    public static RobotMap getRobotMap() {
    	if( robotMap == null) {
    		robotMap = new RobotMap();
    	}
    	return robotMap;
    }
    
    public static final int XBOX_DRIVE = 0;
    

        
    public static final int XBOX_DRIVE_X = 2;
    public static final int XBOX_DRIVE_CIRCLE = 3;
    public static final int XBOX_DRIVE_SQUARE = 1;
    public static final int XBOX_DRIVE_TRIANGLE = 4;
    public static final int XBOX_DRIVE_LY = 1;			// left joystick
    public static final int XBOX_DRIVE_LT = 3;
    public static final int XBOX_DRIVE_LT_BUTTON = 7;
    public static final int XBOX_DRIVE_RT = 4;
    public static final int XBOX_DRIVE_RT_BUTTON = 8;
    public static final int XBOX_DRIVE_RY = 5;			// right joystick
    public static final int XBOX_DRIVE_SL = 11 ;
    public static final int XBOX_DRIVE_SR = 12 ;
    public static final int XBOX_DRIVE_RB = 6;
    public static final int XBOX_DRIVE_LB = 5;
    public static final int XBOX_DRIVE_SHARE = 9;
	public static final int XBOX_DRIVE_OPTIONS = 10;
    public static final int XBOX_DRIVE_POV_DOWN = 180;
    public static final int XBOX_DRIVE_POV_RIGHT = 90;
    public static final int XBOX_DRIVE_POV_LEFT = 270;
    public static final int XBOX_DRIVE_POV_UP = 0;

    public static final int XBOX_MANIPULATE = 1;
    public static final int XBOX_MANIPULATE_X = 2;
    public static final int XBOX_MANIPULATE_CIRCLE = 3;
    public static final int XBOX_MANIPULATE_SQUARE = 1;
    public static final int XBOX_MANIPULATE_TRIANGLE = 4;
    public static final int XBOX_MANIPULATE_LY = 1;			// left joystick
    public static final int XBOX_MANIPULATE_LT = 7;
    public static final int XBOX_MANIPULATE_RT = 8;
    public static final int XBOX_MANIPULATE_RY = 5;			// right joystick
    public static final int XBOX_MANIPULATE_SL = 11;
    public static final int XBOX_MANIPULATE_SR = 12;
    public static final int XBOX_MANIPULATE_RB = 6;
    public static final int XBOX_MANIPULATE_LB = 5;
    public static final int XBOX_MANIPULATE_SHARE = 9;
	public static final int XBOX_MANIPULATE_OPTIONS = 10;
    public static final int XBOX_MANIPULATE_POV_DOWN = 180;
    public static final int XBOX_MANIPULATE_POV_RIGHT = 90;
    public static final int XBOX_MANIPULATE_POV_LEFT = 270;
    public static final int XBOX_MANIPULATE_POV_UP = 0;



    // DRIVETRAIN
    public static final int DRIVETRAIN_LEFT_FRONT = 2;
    public static final int DRIVETRAIN_RIGHT_FRONT = 1;
    public static final int DRIVETRAIN_LEFT_REAR = 3;
    public static final int DRIVETRAIN_RIGHT_REAR = 4;

    public static final int DRIVETRAIN_SHIFT_LOW = 1;
    public static final int DRIVETRAIN_SHIFT_HIGH = 0;
    public static final double DRIVETRAIN_AUTON_SPEED = .9;
    //    public static final int DRIVETRAIN_GYRO_ID = 3;
    // Drivetrain Left PID Config
    public static final int DRIVETRAIN_LEFT_PID_SLOT = 0;
    public static final double DRIVETRAIN_LEFT_PID_F = 0.498;
    public static final double DRIVETRAIN_LEFT_PID_P = 1;
    public static final double DRIVETRAIN_LEFT_PID_I = 0.0;
    public static final double DRIVETRAIN_LEFT_PID_D = 10.0;
    // Drivetrain Right PID Config
    public static final int DRIVETRAIN_RIGHT_PID_SLOT = 0;
    public static final double DRIVETRAIN_RIGHT_PID_F = 0.507;
    public static final double DRIVETRAIN_RIGHT_PID_P = 1.0;
    public static final double DRIVETRAIN_RIGHT_PID_I = 0.0;
    public static final double DRIVETRAIN_RIGHT_PID_D = 10.0;


    
    // LIFT
	public static final int LIFT_MOTORS = 7;
	public static final double LIFT_SPEED_UP = 1;
	public static final double LIFT_SPEED_STOP = 0;
	public static final double LIFT_SPEED_DOWN = -0.75;
    public static final double LIFT_GROUND = 0.0;
    public static final double LIFT_MATCH_START = -3000.0;
    public static final double LIFT_ROCKET_CARGO_LOW = -10880.0;
    public static final double LIFT_ROCKET_CARGO_MID = -32200.0;
    public static final double LIFT_ROCKET_CARGO_HIGH = -51000.0;
    public static final double LIFT_ROCKET_HATCH_LOW = -8500.0;
    public static final double LIFT_ROCKET_HATCH_MID = -21620.0;
    public static final double LIFT_ROCKET_HATCH_HIGH = -42254.0;
    public static final double LIFT_BALL_INTAKE = -5440.0;

	public static final int LIFT_LIMIT_SWITCH = 1;
	public static final int LIFT_LIMIT_SWITCH_DOWN = 3;
    public static final int LIFT_PID_SLOT = 0;
    
    
    public static final double LIFT_PID_F = 0.00; //0.025
    public static final double LIFT_PID_P = 0.3; //0.3 start
    public static final double LIFT_PID_I = 0.0;
    public static final double LIFT_PID_D = 0.0;

	// INTAKE
    public static final int INTAKE_MOTOR = 14;
    public static final double INTAKE_SPEED_FORWARD = 1;
    public static final double INTAKE_SPEED_REVERSE = -.45;
    public static final double INTAKE_SPEED_STOP = 0;
    public static final int INTAKE_BEAM_BREAK = 0;

    //set hatch
    public static final int HATCH_MOTOR = 15;

    // INTAKE WRIST
    public static final int INTAKE_WRIST_MOTOR= 5;

    public static final double INTAKE_WRIST_PACKAGED = 0;
    public static final double INTAKE_WRIST_HATCH_POSITION = -6550.0;
    public static final double INTAKE_WRIST_CARGO_OUTPUT = -13500.0;
    public static final double INTAKE_WRIST_CARGO_STATION_INTAKE = -9423.0;
    public static final double INTAKE_WRIST_GROUND_INTAKE = -18500.0; //-11216

    public static final int WRIST_PID_SLOT = 0;
    
    public static final double WRIST_PID_F = 0.00; //0.025
    public static final double WRIST_PID_P = 0.3; //0.3 start
    public static final double WRIST_PID_I = 0.0;
    public static final double WRIST_PID_D = 0.0;

	// Pneumatic Control Module CAN Bus ID
    public static final int PCM_MAIN = 9;

    // SWEEPER
    public static final int SWEEPER_MOTOR = 13;
    public static final int SWEEPER_WRIST_MOTOR = 6;
    
    public static final double SWEEPER_DEPLOYED = 76908.0;
    public static final double SWEEPER_PACKAGED = 0.0;
    
  //-51396
    //SWEEPER PID STUFF
    public static final int SWEEPER_PID_SLOT = 0;
    
    public static final double SWEEPER_PID_F = 0.00; //0.025
    public static final double SWEEPER_PID_P = 0.3; //0.3 start
    public static final double SWEEPER_PID_I = 0.0;
    public static final double SWEEPER_PID_D = 0.0;
    //CLAW PID STUFF
    public static final int CLAW_PID_SLOT = 0;
    
    public static final double CLAW_PID_F = 0.00; //0.025
    public static final double CLAW_PID_P = 0.3; //0.3 start
    public static final double CLAW_PID_I = 0.0;
    public static final double CLAW_PID_D = 0.0;
    //set endgame vars here
    public static final int ENDGAME_PID_SLOT = 0;

    public static final double ENDGAME_PID_F = 0.00; //0.025
    public static final double ENDGAME_PID_P = 0.3; //0.3 start
    public static final double ENDGAME_PID_I = 0.0;
    public static final double ENDGAME_PID_D = 0.0;

    public static final int ENDGAME_BACK_PID_SLOT = 0;

    public static final double ENDGAME_BACK_PID_F = 0.00; //0.025
    public static final double ENDGAME_BACK_PID_P = 0.3; //0.3 start
    public static final double ENDGAME_BACK_PID_I = 0.0;
    public static final double ENDGAME_BACK_PID_D = 0.0;
    

    public static final double ENDGAME_ZERO = 0;
    public static final double ENDGAME_BACK_LIFTED_POSIITON = -36000;
    public static final double ENDGAME_FRONT_LIFTED_POSIITON = -60000;

    
    public static final int ENDGAME_BACK_MOTOR_WHEEL= 0;

    // set the super sonic sensor
    public static final int ULTRASONIC_SENSOR = 2;

    // set the endgame drive motors
    public static final int ENDGAME_FRONT_LEFT  = 9;
    public static final int ENDGAME_FRONT_RIGHT  = 11; //encoder
    public static final int ENDGAME_BACK_LEFT  = 8; // encoders
    public static final int ENDGAME_BACK_RIGHT  = 10;

    public static final int ENDGAME_WHEELS  = 12;

    public static final double ENDGAME_HEIGHT_START = 0; // this will always vbe zero
    public static final double ENDGAME_FRONT_HEIGHT_UP = -190000;
    public static final double ENDGAME_BACK_HEIGHT_UP = -114000;
        // GENERAL
    public static final double MOTOR_STOP = 0;
}
