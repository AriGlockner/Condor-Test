package org.usfirst.frc.team1.robot.commands;

import org.usfirst.frc.team1.robot.CommandBase;

public class InTakeDownCommand extends CommandBase {
	public InTakeDownCommand() {
		requires(InTakeUpDown);
	}
	protected void execute() {InTakeUpDown.intakeDown();}
	protected boolean isFinished() {return true;}
}
