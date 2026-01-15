package test

import java.util.function.Supplier;
import java.util.function.DoubleSupplier;

public class Main {
  private double time;
  
	public void main(String[] args) {
	  time = 0;
	  
    Supplier<Vector3> robotVelocity = () -> new Vector3(2.0,0.0,0.0);
    DoubleSupplier angularVelocityRadians = () -> 2;
    Supplier<Vector3> robotPosition = () -> new Vector3(2*time,0,0);
    DoubleSupplier heading = () -> 2*time;
    Vector3 goalPosition = new Vector3(0,3,2);
    
		Shooter shooter = new Shooter(robotVelocity, angularVelocityRadians, robotPosition, heading, goalPosition);
		
		for (double i=0; i<=2; i+=0.05) {
		  shooter.log(0.05);
		  time += 0.05;
		}
		
		shooter.logSim();
	}
}
