// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.util.Units;

public final class Constants {

  public static class DriveConstants {
    public static final double kMaxDriveSpeed = 0.15;
    public static final double kMaxTurnSpeed = 1;
    public static final double kDriveMotorGearRatio = 4.71;
    public static final double kTurnMotorGearRatio = 3;
    public static final double kWheelBase = Units.inchesToMeters(21.5);/* the distance between the centers of wheels on the same side */
    public static final double kTrackWidth = Units.inchesToMeters(19.5); /* the   between the centers of wheels on opposite sides */
    public static final double kWheelDiameter = 5;
  }

  public static class ShooterConstants {

  }

  public static class IntakeConstants {

  }

  public static class ElevatorConstants {

  }

  public static class HoodConstants {
    
  }
}
