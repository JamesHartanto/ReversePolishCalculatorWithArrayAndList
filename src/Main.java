/**
 * Created by JamesHartanto on 7/18/17.
 */
public class Main {

    /**
     * Test Driven Development (TDD)
     * Write your tests first and watch them fail.
     * Then write the algorithm and watch the tests pass.
     */
        public static void main(String[] args) {
            ReversePolishCalc rpc = new ReversePolishCalc();
            ReversePolishCalcList rpcList = new ReversePolishCalcList();

            // USING ARRAYS
            String rpnExpression = "5,1,2,+,4,*,+,3,-";
            double expectedResult=14;
            double actualResult = rpc.calculate(rpnExpression);
            checkResult(rpnExpression,expectedResult,actualResult);

            // USING LISTS
            rpnExpression = "1,2,+,3,-,4,*";
            expectedResult=0;
            actualResult = rpcList.calculate(rpnExpression);
            checkResult(rpnExpression,expectedResult,actualResult);
        }

        private static void checkResult(String expression, double expected, double actual) {
            if (expected == actual) {
                System.out.println("SUCCESS: " + expression + " is " + expected);
            } else {
                System.out.println("ERROR: " + expression + " expected " + expected + " actual " + actual);
            }
        }
}
