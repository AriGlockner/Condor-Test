package org.usfirst.frc.team1.robot.commands;

import org.usfirst.frc.team1.robot.CommandBase;

public class LaunchHighCommand extends CommandBase {
		public LaunchHighCommand() {
			requires(Catapult);}
		protected void execute() {Catapult.launchHigh();}
		protected boolean isFinished() {return true;}
				protected void end() {Catapult.retractHigh();}
}
