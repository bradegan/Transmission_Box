public class TransmissionBox {
  private int currentSpeed;
  private int gear;
  private int speedThreshold1;
  private int speedThreshold2;
  private int speedThreshold3;
  private int speedThreshold4;


  /**
   * Construct a Transmission box object that has the provided current speed, and
   * four speed thresholds
   *
   * @param currentSpeed  the speed assigned to transmission box
   * @param speedThreshold1
   * @param speedThreshold2
   * @param speedThreshold3
   * @param speedThreshold4
   *
   */
  public TransmissionBox(int currentSpeed, int speedThreshold1, int speedThreshold2,
                         int speedThreshold3, int speedThreshold4) {

    if (currentSpeed < 0) {
      throw new IllegalArgumentException("Speed cannot be negative.");
    }

    this.currentSpeed = currentSpeed;
    this.speedThreshold1 = speedThreshold1;
    this.speedThreshold2 = speedThreshold2;
    this.speedThreshold3 = speedThreshold3;
    this.speedThreshold4 = speedThreshold4;
    if (this.currentSpeed < speedThreshold1) {
      this.gear = 1;
    } else if (this.currentSpeed < speedThreshold2) {
      this.gear = 2;
    } else if (this.currentSpeed < speedThreshold3) {
      this.gear = 3;
    } else if (this.currentSpeed < speedThreshold4) {
      this.gear = 4;
    } else this.gear = 5;


  }
  /**
   Returns a int of current speed
   @return an int
   */
  public int getCurrentSpeed() {
    return this.currentSpeed;


  }
  /**
   Returns an int with current gear
   @return an int
   */
  public int getGear() {
    return this.gear;


  }
  /**
   Returns a string representation of transmissionbox object
   @return a formatted string
   */
  public String toString() {//overriding the toString() method
    return this.gear + " current gear " + this.currentSpeed + " current speed";
  }
  /**
   Returns  transmissionbox object with increased speed
   @return an object
   */
  public TransmissionBox increaseSpeed() {
//    this.currentSpeed += 2;
//        TransmissionBox increased = new TransmissionBox(this.currentSpeed + 2, speedThreshold1, this) += 2;
    return new TransmissionBox(this.currentSpeed + 2, this.speedThreshold1,
            this.speedThreshold2, this.speedThreshold3, this.speedThreshold4);
  }
  /**
   Returns  transmissionbox object with increased speed
   @return an object
   */
  public TransmissionBox decreaseSpeed() {
//    this.currentSpeed -= 2;
    return new TransmissionBox(this.currentSpeed - 2, this.speedThreshold1,
            this.speedThreshold2, this.speedThreshold3, this.speedThreshold4);
  }

}