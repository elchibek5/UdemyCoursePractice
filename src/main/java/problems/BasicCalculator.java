package problems;

public class BasicCalculator {
    public class SimpleCalculator {
        // write code here
        private double firstNumber;
        private double secondNumber;

        public double getFirstNumber() {
            return firstNumber;
        }

        public double getSecondNumber() {
            return secondNumber;
        }


        public void setSecondNumber(double number) {
            this.secondNumber = number;
        }

        public double getAdditionResult() {
            return firstNumber + secondNumber;
        }


    }
}
