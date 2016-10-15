/**
 * TwoDArray.java creates a two dimensional array based on the size, the lower 
 * bound and the upper bound of the values that are passed in. In
 * the case of no values or wrong values are passed in, the default values will
 * be used to initialize the array.
 * 
 * @version %I%, %G%
 * 
 * @author Kim Nguyen
 */

package kim.nguyen.business;

import java.util.Arrays;
import java.util.Random;

public class TwoDArray {
    /* the size of the array */
    int size = 3;

    /* lower bound of the values in the array */
    int beginValue = 3;

    /* upper bound of the values in the array */
    int endValue = 10;

    public TwoDArray(String size, String beginValue, String endValue) {
        int newSize = getIntegerValue(size);
        int newBeginValue = getIntegerValue(beginValue);
        int newEndValue = getIntegerValue(endValue);

        /*
         * If the size that the user input is valid, the array's size will be
         * assigned to this value, otherwise the default size will be used.
         */
        if (newSize >= 0) {
            this.size = newSize;
        }

        /*
         * If the beginValue and the endValue are valid, these values will be
         * used to initialize the array, otherwise the default values will be
         * used.
         */
        if (newBeginValue >= 0 && newEndValue >= 0) {
            if (newEndValue > newBeginValue) {
                this.beginValue = newBeginValue;
                this.endValue = newEndValue;
            }
        }
    }

    /**
     * Converts the String value to an Integer value, if the String value is
     * invalid, the default value will be return
     * 
     * @param value
     *            the value that the user input, which will be converted into an
     *            Integer value
     * @return a valid Integer value for the array's computation
     */
    private int getIntegerValue(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            System.err.println(e);
            return -1;
        }
    }

    /**
     * Creates and initializes the two dimensional array of double
     * 
     * @param size
     *            the size of the array
     * @param beginValue
     *            the upper edge of the range of the values
     * @param endValue
     *            the lower edge of the range of the values
     * @return the two dimensional array of double
     */
    public double[][] iniTwoDArray() {

        /* Creates a two dimensional array of double */
        double[][] twoDArray = new double[size][size];

        Random rand = new Random();

        /* Assigns values for the array */
        for (int row = 0; row < size; ++row) {
            for (int column = 0; column < size; ++column) {
                twoDArray[row][column] = rand.nextInt((endValue - beginValue) + 1) + beginValue;
            }
        }

        return twoDArray;
    }

    /**
     * Prints the two dimensional array
     * 
     * @param array
     *            the two dimensional array in which values will be printed
     * @return the contents of the the array
     */
    public String getArrayValues(double[][] array) {
        return Arrays.deepToString(array);
    }
}
