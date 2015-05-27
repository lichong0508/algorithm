package com.nowcoder;

public class ReplaceSpace {
	public static void main(String args[]){
		StringBuffer str = new StringBuffer("hello world");
		ReplaceSpace rs = new ReplaceSpace();
		System.out.println(rs.Solution(str));
	}
	
	public String Solution(StringBuffer str){
		StringBuffer sb = new StringBuffer();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                sb.append("%");
                sb.append("2");
                sb.append("0");
            }else{
                sb.append(str.charAt(i));
            }
        }
		return new String(sb);
	}
}