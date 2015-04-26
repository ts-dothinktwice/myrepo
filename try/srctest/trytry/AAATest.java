package trytry;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import testCategory.AlphaCategory;

@Category(AlphaCategory.class)
public class AAATest {

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
	public void test() {
		//初期化
		AAA aaa = new AAA();
		int a = 1;
		int b = 2;
		int c = 3;
		int expected = 6;

		//実行
		int result = aaa.addition(a, b, c);

		//検証
		assertThat("エラーです。", result, is( expected ));


	}

}
