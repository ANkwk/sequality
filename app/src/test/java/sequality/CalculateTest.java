package sequality;
import org.junit.Test;
import static org.junit.Assert.*;
public class CalculateTest {
	@Test
	public void testSum() {
		Calculate calculate = new Calculate();
		int expected = 5;
		assertEquals(expected, calculate.sum(2, 3));
	}
	@Test
	public void testTotal() {
		Calculate calculate = new Calculate();
		int expected = 55;
		assertEquals(expected, calculate.total(1, 10));
	}
	@Test
	public void testTotalOdds() {
		Calculate calculate = new Calculate();
		int expected = 25;
		assertEquals(expected, calculate.total_odds(1, 10));
	}
	@Test
	public void testTotalEven() {
		Calculate calculate = new Calculate();
		int expected = 30;
		assertEquals(expected, calculate.total_even(1, 10));
	}
}