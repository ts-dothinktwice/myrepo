package trytry;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import testCategory.TryCategory;

@RunWith(Categories.class)
//@IncludeCategory(AlphaCategory.class)
//@IncludeCategory(TryCategory.class)
@ExcludeCategory(TryCategory.class)
@SuiteClasses({Try1Test.class,Try2Test.class, AAATest.class})
public class TestCategory {

}
