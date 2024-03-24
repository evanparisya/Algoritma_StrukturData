/**
 * Latihan
 */
public class Latihan {

    public static int MaxAcceleration(String[][] data, int left, int right) {
        if (left == right) {
            return Integer.parseInt(data[left][3]);
        }
    
        int mid = (left + right) / 2;
        int maxLAcceleration = MaxAcceleration(data, left, mid);
        int maxRAcceleration = MaxAcceleration(data, mid + 1, right);
    
        return Math.max(maxLAcceleration, maxRAcceleration);
    }

    public static int MinAcceleration(String[][] data, int left, int right) {
        if (left == right) {
            return Integer.parseInt(data[left][3]);
        }
    
        int mid = (left + right) / 2;
        int minLAcceleration = MinAcceleration(data, left, mid);
        int minRAcceleration = MinAcceleration(data, mid + 1, right);
    
        return Math.min(minLAcceleration, minRAcceleration);
    }

    public static double rataTopPower(String[][] data) {
        int totalPower = 0;
        for (String[] row : data) {
            totalPower += Integer.parseInt(row[4]);
        }
        return (double) totalPower / data.length;
    }
}
