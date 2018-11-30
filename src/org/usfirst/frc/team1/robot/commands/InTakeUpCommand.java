package org.usfirst.frc.team1.robot.commands;

import org.usfirst.frc.team1.robot.CommandBase;

public class InTakeUpCommand extends CommandBase {
	public InTakeUpCommand() {
		requires(InTakeUpDown);
	}
	protected void execute() {InTakeUpDown.intakeUp();}
	protected boolean isFinished() {return true;}
}
