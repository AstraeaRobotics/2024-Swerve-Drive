package frc.robot.util;

public class AngleMapping {

    public static double getAngle(double xAxis, double yAxis, double yaw) {

        if (Math.abs(xAxis) < 0.1 && Math.abs(yAxis) < 0.1) {
            return yaw;
        }

        double controllerAngle = Math.atan2(yAxis,  xAxis) * 180 / Math.PI;

        if (controllerAngle > -90) {
            controllerAngle = -controllerAngle + 90;
        }

        else controllerAngle = -controllerAngle - 270;

        return controllerAngle;

    }
}
