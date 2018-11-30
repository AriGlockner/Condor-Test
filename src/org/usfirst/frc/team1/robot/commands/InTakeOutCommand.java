package org.usfirst.frc.team1.robot.commands;

import org.usfirst.frc.team1.robot.CommandBase;

public class InTakeOutCommand extends CommandBase {
public InTakeOutCommand() {
	requires(InTakeInOut);
}
protected void execute() {InTakeInOut.intakeOut();}
protected void end() {InTakeInOut.intakeStop();}
}