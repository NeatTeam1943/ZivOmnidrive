// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class drivetrain extends SubsystemBase {
  private VictorSP m_bottomRightMotor; 
  private VictorSP m_topRightMotor;
  private VictorSP m_bottomLeftMotor;
  private VictorSP m_topLeftMotor;

  private MotorControllerGroup m_forwardMotors;
  private MotorControllerGroup m_sidewaysMotors;
  /** Creates a new drivetrain. */
  public drivetrain() {
    m_bottomRightMotor = new VictorSP(0);
    m_topRightMotor = new VictorSP(1);
    m_bottomLeftMotor = new VictorSP(2);
    m_topLeftMotor = new VictorSP(3);

    m_forwardMotors = new MotorControllerGroup(m_bottomLeftMotor, m_topRightMotor);
    m_sidewaysMotors = new MotorControllerGroup(m_topLeftMotor, m_bottomRightMotor);
  }

  public void move(double xspeed, double yspeed) {
    m_forwardMotors.set(yspeed);
    m_sidewaysMotors.set(xspeed);
  }

}