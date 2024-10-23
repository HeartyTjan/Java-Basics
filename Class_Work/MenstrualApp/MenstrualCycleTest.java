import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MenstrualCycleTest{


	@Test
	public void calculateMenstrualCycleTest(){

		String date = "2024-10-22";

		MenstrualCycle tester = new MenstrualCycle();

		LocalDate nextStartDate = tester.calculateMenstrualCycle(date,28);

		LocalDate expected = LocalDate.parse("2024-11-19");

		assertEquals(expected,nextStartDate);


	}

	@Test
	public void getOvulationDateTest(){

		String date = "2024-10-22";

		MenstrualCycle tester = new MenstrualCycle();

		LocalDate OvulationDay = tester.getOvulationDate(date,28);

		LocalDate expected = LocalDate.parse("2024-11-05");

		assertEquals(expected,OvulationDay );

	}

	@Test
	public void calculateSafePeriodDateTest(){

		String date = "2024-10-22";

		MenstrualCycle tester = new MenstrualCycle();

		LocalDate safePeriod = tester.calculateSafePeriodDate(date,28);

		LocalDate expected = LocalDate.parse("2024-11-08");

		assertEquals(expected,safePeriod);

	}

	@Test
	public void calculateFertileDateTest(){

		String date = "2024-10-22";

		MenstrualCycle tester = new MenstrualCycle();

		LocalDate fertileStartDate = tester.calculateFertileDate(date,28);

		LocalDate expected = LocalDate.parse("2024-10-31");

		assertEquals(expected,fertileStartDate);

	}

	
	@Test
	public void emptyDateThrowsillegalExceptionerrorForGetOvulationDate(){

		
		MenstrualCycle tester = new MenstrualCycle();

		assertThrows(IllegalArgumentException.class, 
					() -> tester.getOvulationDate("",26));


	}

	@Test
	public void emptyDateThrowsillegalExceptionerrorForCalculateMenstrualCycleTest(){

		
		MenstrualCycle tester = new MenstrualCycle();

		assertThrows(IllegalArgumentException.class, 
					() -> tester.calculateMenstrualCycle("",26));


	}

	@Test
	public void emptyDateThrowsillegalExceptionerrorForCalculateSafePeriodDateTest(){

		
		MenstrualCycle tester = new MenstrualCycle();

		assertThrows(IllegalArgumentException.class, 
					() -> tester.calculateSafePeriodDate("",26));


	}

	@Test
	public void emptyDateThrowsillegalExceptionerrorForCalculateFertileDateTest(){

		
		MenstrualCycle tester = new MenstrualCycle();

		assertThrows(IllegalArgumentException.class, 
					() -> tester.calculateFertileDate("",26));


	}



}