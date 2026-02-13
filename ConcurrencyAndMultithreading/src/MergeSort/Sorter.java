package MergeSort;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {

    private List<Integer> arrayToSort;
    private ExecutorService executorService;

    public Sorter(List<Integer> arrayToSort, ExecutorService executorService) {
        this.arrayToSort = arrayToSort;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        // base case
        if(arrayToSort.size() <= 1) return arrayToSort;

        int mid = arrayToSort.size()/2;

        // extract left arr
        List<Integer> leftArr = new ArrayList<>(arrayToSort.subList(0,mid));
        // extract right arr
        List<Integer> rightArr = new ArrayList<>(arrayToSort.subList(mid,arrayToSort.size()));

        // left task
        Sorter leftSorter = new Sorter(leftArr,executorService);
        // right task
        Sorter rightSorter = new Sorter(rightArr,executorService);

        Future<List<Integer>> futureLeftArr = executorService.submit(leftSorter);  // sbumit left task
        Future<List<Integer>> futureRightArr = executorService.submit(rightSorter); // submit right task

        List<Integer> sortedLeft = futureLeftArr.get(); // get sorted array
        List<Integer> sortedRight = futureRightArr.get();

        return merge(sortedLeft,sortedRight);

    }

    private List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> merged = new ArrayList<>();
        int i=0, j=0;
        while(i < left.size() && j < right.size()) {
            if(left.get(i) <= right.get(j)) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        }

        while(i < left.size()) merged.add(left.get(i++));
        while(j < right.size()) merged.add(right.get(j++));

        return merged;
    }
}
