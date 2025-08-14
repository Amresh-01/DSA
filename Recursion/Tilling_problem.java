
public class Tilling_problem {

    public static int tilingProblem(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }
        int verticalChoice = tilingProblem(n - 1);
        int horizontalChoice = tilingProblem(n - 2);

        int totalWays = verticalChoice + horizontalChoice;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
}
