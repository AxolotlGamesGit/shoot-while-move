package src.main.java.robot

public final class Constants {
  public static final class ShooterConstants {
    // Robot constants
    public static final Vector3 turretPlacement = new Vector3(0.2,0.2,0.4);
    public static final double pitch = Math.PI / 4;
    public static final double maxShotSpeed = 20;
    public static final double minShotSpeed = 1;
    // Number of iterations in the binary search
    // 54 is expirimentally determined to reach maximum accuracy
    // 64 should be a 100% garentee
    public static final int searchDepth = 10;
    public static final double gravity = 9.81;
  }
}
