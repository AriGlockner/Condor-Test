package org.usfirst.frc.team1.robot.commands;

import org.usfirst.frc.team1.robot.CommandBase;

public class IntakeInCommand extends CommandBase {
public IntakeInCommand() {
	requires(InTakeInOut);
}
protected void execute() {InTakeInOut.intakeIn();}
protected void end() {InTakeInOut.intakeStop();}
}
