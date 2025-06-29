✅ Exercise 1: Setting Up JUnit
Scenario:
You need to set up JUnit in your Java project to start writing unit tests.

Steps:

Create a new Java project in your IDE (e.g., IntelliJ IDEA, Eclipse).

Add JUnit dependency to your project. If you are using Maven, add the following to your pom.xml:

xml

<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>
Create a new test class in your project.

✅ Exercise 2: Writing Basic JUnit Tests
Scenario:
You need to write basic JUnit tests for a simple Java class.

Steps:

Create a new Java class with some methods to test.

Write JUnit tests for these methods.

✅ Exercise 3: Assertions in JUnit
Scenario:
You need to use different assertions in JUnit to validate your test results.

Steps:

Write tests using various JUnit assertions.

Example Code:

java

public class AssertionsTest {
    @Test
    public void testAssertions() {
        // Assert equals
        assertEquals(5, 2 + 3);

        // Assert true
        assertTrue(5 > 3);

        // Assert false
        assertFalse(5 < 3);

        // Assert null
        assertNull(null);

        // Assert not null
        assertNotNull(new Object());
    }
}
✅ Exercise 4: Arrange-Act-Assert (AAA) Pattern, Test Fixtures, Setup and Teardown Methods in JUnit
Scenario:
You need to organize your tests using the Arrange-Act-Assert (AAA) pattern and use setup and teardown methods.

Steps:

Write tests using the AAA pattern.

Use @Before and @After annotations for setup and teardown methods.

