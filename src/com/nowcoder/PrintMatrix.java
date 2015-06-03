package com.nowcoder;

import java.util.ArrayList;
import java.util.List;

public class PrintMatrix {
	public static void main(String args[]){
		int[][] matrix = new int[4][4];
		int n = 1;
		for(int i = 0; i < 4; i++){
			for(int j =0; j < 4; j++){
				matrix[i][j] = n;
				n++;
			}
		}
		PrintMatrix pm = new PrintMatrix();
		List<Integer> list = pm.solution(matrix);
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
	}
	public ArrayList<Integer> solution(int[][] matrix){
		/**
		 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
		 * 例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
		 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
		 */
		ArrayList<Integer> list=new ArrayList<Integer>();
        if(matrix.length==0)return list;
        int rows=matrix.length;
        int columns=matrix[0].length;
        int start=0;
        while(rows>start*2&&columns>start*2){
            int endx=columns-1-start;
            int endy=rows-1-start;
            //打印从左到右
            for(int i=start;i<=endx;i++){
                list.add(matrix[start][i]);
            }
            //打印从上到下
            if(start<endy){
                for(int i=start+1;i<=endy;i++){
                    list.add(matrix[i][endx]);
                }
            }
            //打印从右到左
            if(start<endy&&start<endx){
                for(int i=endx-1;i>=start;i--){
                    list.add(matrix[endy][i]);
                }
            }
            //打印从下到上
            if(start<endx&&start<endy-1){
                for(int i=endy-1;i>=start+1;i--){
                    list.add(matrix[i][start]);
                }
            }
            ++start;
        }
        return list;
	}

}
