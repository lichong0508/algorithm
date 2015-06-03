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
