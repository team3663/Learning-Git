/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.C_DriveMotors;

/**
 * Add your docs here.
 */
public class SS_Motors extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private CANSparkMax neoOne;
  private CANSparkMax neoTwo;

  public SS_Motors() {
    neoOne = new CANSparkMax(RobotMap.NEO_ONE, MotorType.kBrushless);
    neoTwo = new CANSparkMax(RobotMap.NEO_TWO, MotorType.kBrushless);
    neoOne.burnFlash();
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new C_DriveMotors());
  }

  public void setSpeed(double oneSpeed, double twoSpeed) {
    neoOne.set(oneSpeed);
    neoTwo.set(twoSpeed);
  }
}
