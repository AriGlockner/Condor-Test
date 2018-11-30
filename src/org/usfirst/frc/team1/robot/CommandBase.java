package org.usfirst.frc.team1.robot;

import edu.wpi.first.wpilibj.command.Command;

public class CommandBase extends Command{
protected boolean isFinished() {return false;}
public static DriveBaseSubSystem driveBase = new DriveBaseSubSystem();
public static IntakeInOutSubsystem InTakeInOut = new IntakeInOutSubsystem();
public static IntakeUpDownSubsystem InTakeUpDown = new IntakeUpDownSubsystem();
public static CatapultSubsystem Catapult = new CatapultSubsystem();
}