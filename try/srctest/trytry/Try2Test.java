package trytry;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import testCategory.TryCategory;

@Category(TryCategory.class)
public class Try2Test {
	private Try2 try2;

	@Before
	public void setUp(){
		//初期化
		try2 = new Try2();
	}


	@Test
	public void testCouple() {
		//初期化
		String a = "この野郎！";
		String b = "なんだと！";
		String expected = "この野郎！なんだと！";

		//実行
		String result = try2.couple(a,b);

		//検証
		assertThat(result, is(expected));

	}

}
