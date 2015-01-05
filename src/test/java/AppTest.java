import junit.framework.TestCase;
import org.apache.pig.pigunit.PigTest;

/**
 * Created by UNIVERSE on 1/5/15.
 */
public class AppTest extends TestCase {

    public void testStudentsPigScript() throws Exception {
        PigTest pigTest = new PigTest("src/main/resources/wordcount.pig");
        pigTest.assertOutput("D", new String[] { "(2,No)", "(3,Ha!)",
                "(1,Yes)", "(1,Open)", "(3,Papa)", "(1,your)", "(1,Johny)",
                "(1,lies?)", "(1,Eating)", "(1,Johny!)", "(1,mouth!)",
                "(1,sugar?)", "(1,Telling)", });
    }
}
