public class equilibrium {
    public static int findEquilibriumPoint(int[] array) {
        int n = array.length;
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += array[i];
        }
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum -= array[i];
            if (leftSum == totalSum) {
                return i;
            }
            leftSum += array[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = { 10, 2, 8, 4, -2, 0 };
        int equilibriumIndex = findEquilibriumPoint(array);

        if (equilibriumIndex == -1) {
            System.out.println("No equilibrium point found.");
        } else {
            System.out.println("Equilibrium point found at index: " + equilibriumIndex);
        }
    }
}
