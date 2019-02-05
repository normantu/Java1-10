public class Java {

    public static void main(String[] args) {
        System.out.println(sleepIn(weekday));
        System.out.println(doubleX(str));
        System.out.println(makeAbba("nice", "morning"));
        System.out.println(doubleChar("evening"));
        System.out.println(countYZ("Zebra"));
        System.out.println(firstLast6(new int[]{6,3,2,4,1}));
        System.out.println(countEvens(new int[]{5,6,7,8}));
        System.out.println(canBalance(new int[]{1,1,1,2,1}));
        System.out.println(cigarParty(30, false));
        System.out.println(luckySum(1,2,3));


    }

    // 1) Warm-up 1 -> sleepIn:
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation) {
            return true;
        }
        return false;
    }

    // 2) Warm-up 2 -> doubleX:
    public static boolean doubleX(String str) {
        int i = str.indexOf("x");
        if(i == -1)
            return false;
        if(i + 1 >= str.length()) return false;
        return str.substring(i +1, i+2).equals("x");

// 3) String 1 -> makeAbba:
        public static String makeAbba(String a, String b) {
            return(a+b+b+a);
        }

// 4) String 2 -> doubleChar:
        public static String doubleChar(String str) {
            String next = "";
            for (int i = 0; i < str.length(); i++) {
                char add = str.charAt(i);
                next += "" + add + add;
            }
            return next;
        }

// 5) String 3 -> countYZ:
        public static int countYZ(String str) {
            int count = 0;
            str = str.toLowerCase() + " ";
            for (int i = 0; i < str.length() - 1; i++)
                if ((str.charAt(i) == 'y' || str.charAt(i) == 'z')
                        && !Character.isLetter(str.charAt(i + 1)))
                    count++;
            return count;
        }

// 6) Array 1 -> firstLast6:
        public static boolean firstLast6(int[] nums) {
            if(nums[0] == 6 || nums[nums.length-1] == 6 ) {
                return true;
            } else {
                return false;
            }
        }

// 7) Array 2 -> countEvens:
        public static int countEvens(int[] nums) {
            int count = 0;
            for(int i = 0; i < nums.length; i++)
                if(nums[i] % 2 == 0)
                    count++;
            return count;
        }

// 8) Array 3 -> canBalance:
        public static boolean canBalance(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                int sum = 0;
                for (int j = 0; j < i; j++) sum += nums[j];
                for (int j = i; j < nums.length; j++) sum -= nums[j];
                if (sum == 0) return true;
            }
            return false;
        }

// 9) Logic 1 -> cigarParty:
        public static boolean cigarParty(int cigars, boolean isWeekend) {
            if(isWeekend) return(cigars >= 40);
            return cigars >= 40 && cigars <= 60;
        }

// 10) Logic 2 ->luckySum
        public static int luckySum(int a, int b, int c) {
            if (a == 13) return 0;
            if (b == 13) return a;
            if (c == 13) return a + b;
            return a + b + c;
        }


    }
}