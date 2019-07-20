import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Construct 6 Transmission box object.
 *
 * no params
 *
 */
public class TransmissionBoxTest {
  private TransmissionBox box1;
  private TransmissionBox box2;
  private TransmissionBox box3;
  private TransmissionBox box4;
  private TransmissionBox box5;
  private TransmissionBox box6;

  /**
   Runs a test on speed thresholds.
   @return none
   */
  @Before
  public void setUp() {
//    box1 = new TransmissionBox(-10,10,20,30,40);
    box2 = new TransmissionBox(0, 10, 20,
            30, 40);
    box3 = new TransmissionBox(10, 10, 20,
            30, 40);
    box4 = new TransmissionBox(20, 10, 20,
            30, 40);
    box5 = new TransmissionBox(30, 10, 20,
            30, 40);
    box6 = new TransmissionBox(40, 10, 20,
            30, 40);

  }

  @Test(expected = IllegalArgumentException.class)
  public void testForNegativeSpeed() {
    box1 = new TransmissionBox(-10, 10, 20, 30, 40);
  }
  /**
   Runs a test on current speed.
   @return none
   */
  @Test
  public void testCurrentSpeed() {
//    assertEquals(-10, box1.getCurrentSpeed());


    for (int i = 0; i <= 5; i++) {
      TransmissionBox car = new TransmissionBox(i * 10, 10,
              20, 30, 40);
      assertEquals(i * 10, car.getCurrentSpeed());

    }

  }
  /**
   Runs a test on speed decrease.
   @return none
   */
  @Test
  public void testDecreased() {
    TransmissionBox decreased = box2.decreaseSpeed();
    assertEquals(-2, box2.getCurrentSpeed());
    assertEquals(box2.decreaseSpeed().getGear(), box2.getGear());

  }
  /**
   Runs a test on current gear.
   @return none
   */
  public void testgetgear() {
//    assertEquals(-10, box1.getCurrentSpeed());


    for (int i = 0; i <= 5; i++) {
      TransmissionBox car = new TransmissionBox(i * 11, 10, 20, 30, 40);

      assertEquals(i, car.getGear());

    }
  }
  /**
   Runs a test on increased speed.
   @return none
   */
  @Test
  public void testincreasedSpeed() {
    TransmissionBox newBox = box3.increaseSpeed();
    assertEquals(12, newBox.getCurrentSpeed());
  }
  /**
   Runs a test on decreased speed.
   @return none
   */
  @Test
  public void testdecreasedSpeed() {
    TransmissionBox newBox = box3.decreaseSpeed();
    assertEquals(8, newBox.getCurrentSpeed());
  }
  /**
   Runs a test on string to string.
   @return none
   */
  @Test
  public void teststringtostring() {
    assertEquals("2 current gear 10 current speed", box3.toString());

  }


}