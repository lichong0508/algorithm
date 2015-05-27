package com.datastructure;

import java.util.Arrays;

public class Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {7,9,25,3,43,3,5,8,0,12};
		Sort sort = new Sort();
		long startTime = System.nanoTime();
		sort.insertSort(numbers);
		long endTime = System.nanoTime();
		System.out.println("排序耗时："+(endTime-startTime)+"ns");
		for(int i = 0; i < numbers.length; i++){
			System.out.println(numbers[i]);
		}
	}
	/**
	 * @param numbers
	 * 			冒泡排序，比较相邻两个元素，将最大的数移到末端
	 */
	public int[] bubbleSort(int[] numbers){
		int temp;
		for(int i = 0; i < numbers.length-1; i++){
			for(int j = i+1; j < numbers.length;j++ ){
				if(numbers[i] > numbers[j]){
					temp = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = temp;
				}
			}
		}
		return numbers;
	}
	/**
	 * 快速排序
	 * @param numbers
	 * @param start
	 * @param end
	 */
	public int[] quickSort(int[] numbers, int start, int end){
		int key = numbers[start];
		int temp;
		int i = start;
		int j = end;
		do {
			while((numbers[i] < key) && (i < end))
				i++;
			while((numbers[j] > key) && (j> start))
				j--;
			if(i <= j){
				temp = numbers[j];
				numbers[j] = numbers[i];
				numbers[i] = temp;
				i++;
				j--;
 			}
		} while (i <= j);
		if(start < j)
			quickSort(numbers,start,j);
		if(end > i)
			quickSort(numbers,i,end);		
		return numbers;  
	}
	/**
	 * 插入排序
	 * <ul>  
	 * <li>从第一个元素开始，该元素可以认为已经被排序</li>  
	 * <li>取出下一个元素，在已经排序的元素序列中从后向前扫描</li>  
	 * <li>如果该元素（已排序）大于新元素，将该元素移到下一位置</li>  
	 * <li>重复步骤3，直到找到已排序的元素小于或者等于新元素的位置</li>  
	 * <li>将新元素插入到该位置中</li>  
	 * <li>重复步骤2</li>  
	 * </ul>
	 * @param numbers
	 */
	public int[] insertSort(int[] numbers){
		int temp,j;
		for(int i = 1; i < numbers.length; i++){
			temp = numbers[i];
			for( j = i; j > 0 && temp < numbers[j-1]; j--){
				numbers[j] = numbers[j-1];
			}
			numbers[j] = temp;
		} 
		return numbers;
	}
	
	/**  
	 * 归并排序<br/>  
	 * <ul>  
	 * <li>申请空间，使其大小为两个已经排序序列之和，该空间用来存放合并后的序列</li>  
	 * <li>设定两个指针，最初位置分别为两个已经排序序列的起始位置</li>  
	 * <li>比较两个指针所指向的元素，选择相对小的元素放入到合并空间，并移动指针到下一位置</li>  
	 * <li>重复步骤3直到某一指针达到序列尾</li>  
	 * <li>将另一序列剩下的所有元素直接复制到合并序列尾</li>  
	 * </ul>    
	 * @param numbers  
	 */  
	public static void mergeSort(int[] numbers, int left, int right) {   
	    int t = 1;// 每组元素个数   
	    int size = right - left + 1;   
	    while (t < size) {   
	        int s = t;// 本次循环每组元素个数   
	        t = 2 * s;   
	        int i = left;   
	        while (i + (t - 1) < size) {   
	            merge(numbers, i, i + (s - 1), i + (t - 1));   
	            i += t;   
	        }   
	        if (i + (s - 1) < right)   
	            merge(numbers, i, i + (s - 1), right);   
	    }   
	}   
	/**  
	 * 归并算法实现  
	 *   
	 * @param data  
	 * @param p  
	 * @param q  
	 * @param r  
	 */  
	private static void merge(int[] data, int p, int q, int r) {   
	    int[] B = new int[data.length];   
	    int s = p;   
	    int t = q + 1;   
	    int k = p;   
	    while (s <= q && t <= r) {   
	        if (data[s] <= data[t]) {   
	            B[k] = data[s];   
	            s++;   
	        } else {   
	            B[k] = data[t];   
	            t++;   
	        }   
	        k++;   
	    }   
	    if (s == q + 1)   
	        B[k++] = data[t++];   
	    else  
	        B[k++] = data[s++];   
	    for (int i = p; i <= r; i++)   
	        data[i] = B[i];   
	}
}
