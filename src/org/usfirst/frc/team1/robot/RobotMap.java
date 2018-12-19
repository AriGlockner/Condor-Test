/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	public static int rollerID = 4;
	public static WPI_TalonSRX roller = new WPI_TalonSRX(rollerID);
	public static int [] drivebaseIDs = new int[] {0, 1, 2, 3};
	public static WPI_TalonSRX [] drivebaseTalons = new WPI_TalonSRX[] {
			new WPI_TalonSRX(drivebaseIDs [0]),
			new WPI_TalonSRX(drivebaseIDs [1]),
			new WPI_TalonSRX(drivebaseIDs [2]),
			new WPI_TalonSRX(drivebaseIDs [3])};
	public static int [] CatapultIDs = new int[] {0, 1, 2, 3};
	public static DoubleSolenoid [] CatapultSolenoid = new DoubleSolenoid[] {
			new DoubleSolenoid(CatapultIDs [0], CatapultIDs[1]),
			new DoubleSolenoid(CatapultIDs [2], CatapultIDs[3])};
	public static int [] latchIDs = new int[] {0, 1, 2, 3};
	public static DoubleSolenoid [] latchSolenoid = new DoubleSolenoid[] {
			new DoubleSolenoid(latchIDs [0], latchIDs[1]),
			new DoubleSolenoid(latchIDs [2], latchIDs[3])};
	public static int [] upDownIDs = new int[] {0, 1};
	public static DoubleSolenoid [] upDown = new DoubleSolenoid[] {
			new DoubleSolenoid(upDownIDs [0], upDownIDs [1]),
	};
	public static SpeedControllerGroup LeftSide = new SpeedControllerGroup(drivebaseTalons [0], drivebaseTalons[2]);
	
	public static SpeedControllerGroup RightSide = new SpeedControllerGroup(drivebaseTalons [1], drivebaseTalons[3]);
	public static DifferentialDrive robotDrive = new DifferentialDrive(LeftSide, RightSide);}

