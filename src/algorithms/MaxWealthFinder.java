package algorithms;

class MaxWealthFinder {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;  // Initialize the maximum wealth

        // Loop through each customer
        for (int i = 0; i < accounts.length; i++) {
            int currentWealth = 0;  // Initialize current customer's wealth

            // Sum the wealth of the current customer across all banks
            for (int j = 0; j < accounts[i].length; j++) {
                currentWealth += accounts[i][j];
            }

            // Update maxWealth if the current customer's wealth is higher
            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }

        return maxWealth;  // Return the wealth of the richest customer
    }

    public static void main(String[] args) {
        int[][] accounts1 = {{1,2,3},{3,2,1}};
        System.out.println("maximum Wealth of [[1,2,3],[3,2,1]]: " + MaxWealthFinder.maximumWealth(accounts1));

        int[][] accounts2 = {{1,5},{7, 3},{3, 5}};
        System.out.println("maximum Wealth of [[1,5],[7,3],[3,5]]: " + MaxWealthFinder.maximumWealth(accounts2));

        int[][] accounts3 = {{2,8,7}, {7,1,3},{1,9,5}};
        System.out.println("maximum Wealth of [[2,8,7],[7,1,3],[1,9,5]]: " + MaxWealthFinder.maximumWealth(accounts3));
    }
}
