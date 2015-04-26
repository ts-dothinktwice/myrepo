package trytry;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import testCategory.TryCategory;

@Category(TryCategory.class)
@RunWith(Theories.class)
public class Try1Test {

	@DataPoint
	public static int aa=(int)2;
//
//	@DataPoint
//	public static int dd = Try2.kakezan(1,2);

	@DataPoints
	public static int[] intArray = {1,2,3};

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	@Ignore
	@Test
	public void testRenketsu() {
		//初期設定
		String first = "one";
		String second = "two";
		String renketsu = "onetwo";

		//実行
		String result = Try1.renketsu(first, second);

		//検証
		assertThat(result, is( renketsu ));
		//fail("まだ実装されていません");
	}

	@Ignore
	@Test(expected = IllegalArgumentException.class)
	public void testAddition(){
		//初期化
		int a = 2;
		int b = -3;
		int expected = 5;

		//実行
		int result = Try1.addition(a, b);

		//検証
		assertThat(result, is(expected));

	}

	@Theory
	public void testAddition2(int arg1,int arg2){
		//初期化
		int a = arg1;
		int b = arg2;
		int expected = arg1 + arg2;

		//実行
		int result = Try1.addition(a, b);

		System.out.println("arg1 = " + arg1);
		System.out.println("arg2 = " + arg2);

		//検証
		String errormsg = "error occured arg1=" + arg1 + " arg2=" + arg2;
		assertThat(errormsg, result, is(expected));
	}



}







