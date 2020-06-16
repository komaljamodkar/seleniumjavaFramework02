package junitproject;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.text.IsEmptyString.isEmptyString;
import static org.hamcrest.text.IsEmptyString.isEmptyOrNullString;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Every.everyItem;

import org.hamcrest.Matcher;
import org.junit.Test;

public class TestExampl {
	@Test
    public void listShouldInitiallyBeEmpty() {
        List<Integer> list = Arrays.asList(5, 2, 4);

        assertThat(list, hasSize(3));

        // ensure the order is correct
        assertThat(list, contains(5, 2, 4));

        assertThat(list, containsInAnyOrder(2, 4, 5));

        assertThat(list, everyItem(greaterThan(1)));

	   }
	@Test
	public void hasSizeOf3() {
	    List<Integer> list = Arrays.asList(5, 2, 4);

	    assertThat(list, hasSize(3));
	}
	
	@Test
	public void containsNumbersInAnyOrder() {
	    List<Integer> list = Arrays.asList(5, 2, 4);

	    assertThat(list, containsInAnyOrder(2, 4, 5));
	}
	
	@Test
	public void everyItemGreaterThan1() {
	    List<Integer> list = Arrays.asList(5, 2, 4);

	    assertThat(list, everyItem(greaterThan(1)));
	}
	
	@Test
	public void arrayHasSizeOf4() {
	    Integer[] ints = new Integer[] { 7, 5, 12, 16 };

	    assertThat(ints, arrayWithSize(4));
	}
	
	private Matcher arrayWithSize(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	@Test
	public void arrayContainsNumbersInGivenOrder() {
	    Integer[] ints = new Integer[] { 7, 5, 12, 16 };

	    assertThat(ints, arrayContaining(7, 5, 12, 16));
	}
	
	private Matcher arrayContaining(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		return null;
	}

	private final long id;
    private String summary;
    private String description;
    private int year;

    public TestExampl(long id, String summary, String description) {
        this.id = id;
        this.summary = summary;
        this.description = description;
    }
    @Test
    public void objectHasSummaryProperty () {

    	TestExampl todo = new TestExampl(1, "Learn Hamcrest", "Important");

        assertThat(todo, hasProperty("summary"));
    }
    
    private Matcher hasProperty(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	@Test
    public void objectHasCorrectSummaryValue () {

    	TestExampl todo = new TestExampl(1, "Learn Hamcrest", "Important");

        assertThat(todo, hasProperty("summary"));
    }
    
    @Test
    public void objectHasSameProperties () {

    	TestExampl todo1 = new TestExampl(1, "Learn Hamcrest", "Important");
    	TestExampl todo2 = new TestExampl(1, "Learn Hamcrest", "Important");

        assertThat(todo1, samePropertyValuesAs(todo2));
    }
    
    private Matcher samePropertyValuesAs(TestExampl todo2) {
		// TODO Auto-generated method stub
		return null;
	}
	@Test
    public void isStringEmpty() {
        String stringToTest = "";
        assertThat(stringToTest, isEmptyString());
    }

    @Test
    public void isStringEmptyOfNull() {
        String stringToTest = "";
        assertThat(stringToTest, isEmptyOrNullString());
    }


}
