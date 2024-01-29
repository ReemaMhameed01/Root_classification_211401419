package Root_classificatin.Root_classificatin;
import static org.junit.Assert.*;

import org.junit.Test;

public class RootsTest 
{
	Roots root;

	@Test
	public void Nominal() 
	{
		Roots.calculate_roots(4,4,4);
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void TestAMin() {
		Roots.calculate_roots(0,9,12);
		String  root_expected = Root_Types.Not_quadratic.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void TestAMin_Plus_1() {
		Roots.calculate_roots(1,5,7);
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void TestAMax() {
		Roots.calculate_roots(50,40,40);
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void TestAMax_minus_1() {
		Roots.calculate_roots(49,30,0);
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void TestBMin() {
		Roots.calculate_roots(50,0,20);
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void TestBMin_Plus_1() {
		Roots.calculate_roots(1,1,5);
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void TestBMax() {
		Roots.calculate_roots(3,50,7);
		String  root_expected = Root_Types.Two_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void TestBMax_minus_1() {
		Roots.calculate_roots(6,49,12);
		String  root_expected = Root_Types.Two_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void TestCMin() {
		Roots.calculate_roots(3,20,0);
		String  root_expected = Root_Types.Two_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void TestCMin_Plus_1() {
		Roots.calculate_roots(9,25,1);
		String  root_expected = Root_Types.Two_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void TestCMax() {
		Roots.calculate_roots(7,16,50);
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void TestCMax_minus_1() {
		Roots.calculate_roots(1,16,49);
		String  root_expected = Root_Types.Two_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	

	
	}
