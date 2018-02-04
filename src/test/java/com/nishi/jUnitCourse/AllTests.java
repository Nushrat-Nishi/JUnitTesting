package com.nishi.jUnitCourse;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({StringHelperTest.class, StringHelperParameterizedTest.class, StringHelperBeforeAfterTest.class})
public class AllTests {

}
