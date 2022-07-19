import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Insert_Interval_57 {

    public static void main(String[] args) {


//        int[][] intervals = {{1, 5}};
//        int[] newInterval = {2, 3};

        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = {4, 8};

//        insert(intervals, newInterval);
        insert2(intervals, newInterval);
    }

    public static void insert2(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();

        // Iterate through all slots
        for (int[] slot : intervals) {

            // if newInterval before slot insert newInterval & update slot as new interval
            if (newInterval[1] < slot[0]) {
                result.add(newInterval);
                newInterval = slot;
            }

            // if slot is lesser than new Interval insert slot
            else if (slot[1] < newInterval[0]) {
                result.add(slot);
            }

            // if above conditions fail its an overlap since possibility of new interval existing in left & right of slot is checked
            // update lowest of start & highest of end & not insert
            else {
                newInterval[0] = Math.min(newInterval[0], slot[0]);
                newInterval[1] = Math.max(newInterval[1], slot[1]);
            }
        }

        // insert the last newInterval
        result.add(newInterval);


        // convert to int[][] array
        System.out.println(result.toArray(new int[result.size()][]));
        System.out.println(Arrays.deepToString(result.toArray(new int[result.size()][])));
    }


    private static void insert(int[][] intervals, int[] newInterval) {


        List<List<Integer>> results = new ArrayList<>();
        List<Integer> compareInterval = Arrays.stream(newInterval)
                .boxed().collect(Collectors.toList());

        if (intervals.length == 0) {
            results.add(compareInterval);
        }

        System.out.println(compareInterval);

        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] > compareInterval.get(1)) {
                if (!results.contains(compareInterval)) {
                    results.add(compareInterval);
                }
                results.add(Arrays.stream(intervals[i])
                        .boxed().collect(Collectors.toList()));
            } else if (intervals[i][1] < compareInterval.get(0)) {

                results.add(Arrays.stream(intervals[i])
                        .boxed().collect(Collectors.toList()));
            } else {
                List<Integer> interval = new ArrayList<>();


                System.out.println(Math.min(intervals[i][0], compareInterval.get(0)));
                System.out.println(Math.max(intervals[i][1], compareInterval.get(1)));

                interval.add(Math.min(intervals[i][0], compareInterval.get(0)));
                interval.add(Math.max(intervals[i][1], compareInterval.get(1)));

                compareInterval = interval;

            }


        }

        if (!results.contains(compareInterval)) {
            results.add(compareInterval);
        }

        int[][] re = results.stream().map(l -> l.stream().mapToInt(Integer::intValue).toArray()).toArray(int[][]::new);

        System.out.println(Arrays.deepToString(re));

    }
}
