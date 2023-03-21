
public class VisitingCitiesRedBlueBus {
    
    public static int[] visitingCities(int[] red, int[] blue, int blueCost) {
        int n = red.length; 
        int[] ans = new int[n + 1]; 
        ans[0] = 0; 
        boolean blueNow = false; 
        for (int i = 0; i < n; i++) {
            int onRed = ans[i] + red[i]; 
            int onBlue = blueNow ? ans[i] + blue[i] : ans[i] + blue[i] + blueCost; 
            ans[i + 1] = Math.min(onRed, onBlue); 
            blueNow = onBlue <= onRed; 
        }
        return ans; 
    }

    public static void printArray(int[] arr) {
        int n = arr.length; 
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] red = new int[]{2, 3, 4, 3, 5, 2, 7}; 
        int[] blue = new int[]{3, 1, 1, 6, 2, 3, 1}; 
        int[] ans = visitingCities(red, blue, 2); 
        printArray(ans); 
    }


}
