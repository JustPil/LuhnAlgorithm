package luhn;

public class Luhn {
    /**
     * validate Receives a full number including the check digit and determines if it is valid as per the Luhn Algorithm.
     * @param number The number to validate.
     * @return True if the number is valid, false otherwise.
     */
    public boolean validate(String number) {
        if(number.length() <= 1) {
            return false;
        }
        return calculate(number, false) % 10 == 0;
    }

    /**
     * generateCheckDigit Generates a check digit for a specified number as per the Luhn algorithm.
     * @param number The number needing a check digit.
     * @return The check digit for the given number.
     */
    public int generateCheckDigit(String number) {
        if(number.length() <= 1 || calculate(number, true) == -1) {
            return -1;
        }
        int total = calculate(number, true);
        return total % 10 == 0 ? 0 : 10 - total % 10;
    }

    /**
     * calculate Performs the calculation of the Luhn algorithm.
     * @param number The input number.
     * @return The total sum of the number as per the Luhn algorithm.
     */
    private int calculate(String number, boolean flag) {
        int total = 0;
        for(int i = number.length() - 1; i >= 0; i--) {
            if(!Character.isDigit(number.charAt(i))) {
                return -1;
            }
            int digit = number.charAt(i) - '0';
            if(flag) {
                digit = digit * 2 > 9 ? (digit * 2) - 9 : digit * 2;
                flag = !flag;
            } else {
                flag = !flag;
            }
            total += digit;
        }
        return total;
    }
}
