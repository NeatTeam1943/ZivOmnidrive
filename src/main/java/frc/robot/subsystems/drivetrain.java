// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Victor;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class drivetrain extends SubsystemBase {
  private VictorSP m_rightMotor; 
  private VictorSP m_leftMotor;
  private VictorSP m_midMotor;

  private DifferentialDrive m_diffDrive;
  /** Creates a new drivetrain. */
  public drivetrain() {
    m_rightMotor = new VictorSP(0);
    m_leftMotor = new VictorSP(0);
    m_midMotor = new VictorSP(0);

    m_diffDrive = new DifferentialDrive(m_leftMotor, m_rightMotor);

  }

  public void arcadeDrive(double xspeed, double yspeed, double rotation) {
    m_diffDrive.arcadeDrive(yspeed, rotation, true);
    m_midMotor.set(xspeed);
  }
  




}
