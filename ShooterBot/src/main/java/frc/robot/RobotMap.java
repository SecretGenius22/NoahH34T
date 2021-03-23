// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into to a variable name.
 * This provides flexibility changing wiring, makes checking the wiring easier and significantly
 * reduces the number of magic numbers floating around.
 */
public class RobotMap {



public static final double Drive_Speed = 0.5;

public static final int Motor_Front_Left_Id = 1;
public static final int Motor_Front_Right_Id = 2;
public static final int Motor_Back_Left_Id = 3;
public static final int Mortor_Back_Right_Id = 4;

public static final int Joystick_Id = 0;

public static final int Left_Stick_Y = 0;
public static final int Right_Stick_Y = 0;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
