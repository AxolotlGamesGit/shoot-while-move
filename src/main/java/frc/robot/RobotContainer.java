package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.Autos;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandPS4Controller;
import edu.wpi.first.wpilibj2.command.button.CommandPS5Controller;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public class RobotContainer {  
	private final Shooter shooter;
  
  public RobotContainer() {
    configureBindings();
  }
  
  private void configureBindings() {
    // Change these to use actual swerve values converted to Vector3
    private final Supplier<Vector3> robotVelocity = () -> new Vector3(2.0,0.0,0.0);
    private final DoubleSupplier angularVelocityRadians = () -> 2;
    private final Supplier<Vector3> robotPosition = () -> new Vector3(2*time,0,0);
    private final DoubleSupplier heading = () -> 2*time;
    private final Vector3 goalPosition = new Vector3(0,3,2);

    shooter = new Shooter(robotVelocity, angularVelocityRadians, robotPosition, heading, goalPosition);
  }

  public Command getAutonomousCommand() {
    return new InstantCommand();
  }
}
