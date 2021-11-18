package tests;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

import functions.Compare;

public class TestDiff {
	
	public static final String oldSpec = "src/main/resources/spec/openapi1.yaml";
	public static final String newSpec = "src/main/resources/spec/openapi2.yaml";
	
	@Test
	public void TestRetrocompatibilidade() {
		
		Compare compare = new Compare();
		String broken = (compare.verifierArchives(oldSpec, newSpec));
		assertEquals("COMPATIBLE", broken);
	}

}
