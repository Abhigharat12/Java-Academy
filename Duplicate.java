public class Duplicate {
    public static void Dup(int nums[]) {
        boolean found = false; // to track if any duplicates exist

        for (int i = 0; i < nums.length - 1; i++) {       // use nums.length - 1
            for (int j = i + 1; j < nums.length; j++) {   // use nums.length
                if (nums[i] == nums[j]) {
                    System.out.println("Duplicate found: " + nums[i]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No duplicates found");
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 1};
        Dup(nums);
    }
}
