package org.usfirst.frc.team1.robot;

public class CommandBase {
protected boolean isFinished() {return false;}
public static DriveBaseSubSystem driveBase = new DriveBaseSubSystem();
public static IntakeInOutSubsystem InTakeInOut = new IntakeInOutSubsystem();
public static IntakeUpDownSubsystem InTakeUpDown = new IntakeUpDownSubsystem();
public static CatapultSubsystem Catapult = new CatapultSubsystem();
}