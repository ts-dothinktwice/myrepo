package trytry;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Try1Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRenketsu() {
		String first = "one";
		String second = "two";
		String renketsu = "onetwo";
		String result = Try1.renketsu(first, second);

		assertThat(result, is( renketsu ));
		//fail("まだ実装されていません");
	}

}
