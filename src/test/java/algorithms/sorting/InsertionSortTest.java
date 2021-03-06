package algorithms.sorting;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

/**
 * Created by Orestis on 14/01/2015
 */
public class InsertionSortTest {

    @Test
    public void sort1(){
        int[] given = {5,4,8,9,10,66,22,5};
        int[] expected = {4,5,5,8,9,10,22,66};
        InsertionSort.sortArray(given);
        assertEquals(Arrays.toString(expected), Arrays.toString(given));
    }

    @Test
    public void sort2(){
        int[] given = {8,7,6,5,4};
        int[] expected = {4,5,6,7,8};
        InsertionSort.sortArray(given);
        assertEquals(Arrays.toString(given), (Arrays.toString(expected)));
    }

    @Test
    public void sort3(){
        int[] given = {100,8,44,21,96,85,55,44,1};
        int[] expected = {1,8,21,44,44,55,85,96,100};
        InsertionSort.sortArray(given);
        assertEquals(Arrays.toString(expected), (Arrays.toString(given)));
    }

    @Test
    public void sort4(){
        int[] given = {10,9,8,7,6,5,4,3,2,1,0};
        int[] expected = {0,1,2,3,4,5,6,7,8,9,10};
        InsertionSort.sortArray(given);
        assertEquals(Arrays.toString(expected), (Arrays.toString(given)));
    }
}
