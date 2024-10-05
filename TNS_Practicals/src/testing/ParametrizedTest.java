package demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ParametrizedTest {

	@ParameterizedTest
	@CsvSource({"true, 2","false, 4"})
	public void testForPrime(int n) {
		CheckPrime.checkPrime(n);
	}

}
