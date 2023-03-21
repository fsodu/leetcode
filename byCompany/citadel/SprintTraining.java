
/**
 * https://algo.monster/problems/citadel-oa-sprint-training
 */

public class SprintTraining {
    
    public static int sprintTraining(int n, int[] sprints) {
        int m = sprints.length; 
        int[] cnt = new int[n + 1]; 
        for (int i = 1; i < m; i++) {
            int start = Math.min(sprints[i], sprints[i - 1]); 
            int end = Math.max(sprints[i], sprints[i - 1]); 
            cnt[start] += 1; 
            if (end + 1 <= n) cnt[end] -= 1; 
        }
        int sum = 0; 
        int max = 0; 
        int maxIndex = 0; 
        for (int i = 0; i <= n; i++) {
            sum += cnt[i]; 
            cnt[i] = sum; 
            if (cnt[i] > max) {
                max = cnt[i]; 
                maxIndex = i; 
            }
        }
        return maxIndex; 
    }

    public static void main(String[] args) {
        System.out.println(sprintTraining(5, new int[]{2, 4, 1, 3}));
    }
}
