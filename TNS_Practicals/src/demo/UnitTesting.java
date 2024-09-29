package demo;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnitTesting {
	
	@Test
	public void testForPrime() {
		
		Assertions.assertTrue(CheckPrime.checkPrime(41));
		
	}

}
