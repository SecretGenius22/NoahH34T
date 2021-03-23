// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

/** An example command. You can replace me with your own command. */
public class TeleopDrive extends Command {
  public TeleopDrive() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.driveTrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {}

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    double leftStickY = Robot.m_oi.GetDriverRawAxis(RobotMap.Left_Stick_Y);
    double rightStickY = Robot.m_oi.GetDriverRawAxis(RobotMap.Right_Stick_Y);


    Robot.driveTrain.setLeftMotors(leftStickY*RobotMap.Drive_Speed);
    Robot.driveTrain.setRightMotors(rightStickY*RobotMap.Drive_Speed);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.driveTrain.setLeftMotors(0);
    Robot.driveTrain.setRightMotors(0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    this.end();
  }
}
