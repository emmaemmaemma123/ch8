public class InRange{
    public static int maxInRange(int[] array, int lowIndex, int highIndex) {
        if (lowIndex==highIndex) {
            return array[lowIndex];
        }
        int middle = (lowIndex+highIndex)/2;

        int maxLeft = maxInRange(array,lowIndex,middle);
        int maxRight = maxInRange(array,middle+1,highIndex);

        return Math.max(maxLeft, maxRight);
    }
}