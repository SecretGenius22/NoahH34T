// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
//import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.TeleopDrive;

/** Add your docs here. */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private CANSparkMax leftFrontMotor = new CANSparkMax(RobotMap.Motor_Front_Left_Id, MotorType.kBrushless);
  private CANSparkMax rightFrontMotor = new CANSparkMax(RobotMap.Motor_Front_Right_Id, MotorType.kBrushless);
  private CANSparkMax leftBackMotor = new CANSparkMax(RobotMap.Motor_Back_Left_Id, MotorType.kBrushless);
  private CANSparkMax rightBackMotor = new CANSparkMax(RobotMap.Mortor_Back_Right_Id, MotorType.kBrushless);

  public void setLeftMotors(double speed) {
    leftFrontMotor.set(speed);
    leftBackMotor.set(-speed);

  }

  public void setRightMotors(double speed) {
    rightFrontMotor.set(speed);
    rightBackMotor.set(speed);
  }

  public void setAllMotors(double speed) {
    leftFrontMotor.set(speed);
    leftBackMotor.set(-speed);
    rightFrontMotor.set(speed);
    rightBackMotor.set(speed);
  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new TeleopDrive());
  }




  

}
