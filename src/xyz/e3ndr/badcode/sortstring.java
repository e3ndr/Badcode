package xyz.e3ndr.badcode;

import java.util.Random;

public class sortstring {
    private static String TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam ante enim, rhoncus sed sem in, viverra dictum diam.";
    
    // https://www.reddit.com/r/badcode/comments/isjvxc/bad_code_coding_challenge_45_sort_by_word_length/
    // My BOGOSORT implementation, made Eclipse chug a bit: https://i.imgur.com/eLXIr9Q.png
    public static void main(String[] args) {
        String[] arr = TEXT.split(" ");
        long start = System.currentTimeMillis();
        
        while (true) {
            System.out.println("Sorting " + arr.length + " words");
            
            arr = sort(arr);
            
            for (int i = 0; i != arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            
            System.out.println();
            
            if (isSorted(arr)) {
                System.out.println("Sorted! Took " + ((System.currentTimeMillis() - start) / 1000d) + "s");
                return;
            } else {
                System.out.println("Not sorted!");
            }
        }
    }

    private static boolean isSorted(String[] arr) {
        for (int i = 0; i != arr.length - 1; i++) {
            String current = arr[i];
            String next = arr[i+1];
            
            if (current.length() < next.length()) {
                return false;
            }
        }
        
        return true;
    }

    public static String[] sort(String[] strings) {
        String[] sorted = new String[strings.length];

        while (hasNull(sorted)) {
            int rand1 = new Random().nextInt(strings.length);
            int rand2 = new Random().nextInt(strings.length);

            if (strings[rand1] != null && sorted[rand2] == null) {
                sorted[rand2] = strings[rand1];
                strings[rand1] = null;
            }
        }

        return sorted;
    }

    private static boolean hasNull(String[] sorted) {
        for (int i = 0; i != sorted.length; i++) {
            if (sorted[i] == null) return true;
        }

        return false;
    }

}
