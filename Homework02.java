import java.util.*;
//统计一个字符在字符数组中的所有位置
public class Homework02{
    public static void main(String[] args){
	    char[] ch ={'统','计','一','个','字','符','在','字','串','中','所','有','位','置'};
		for(int i=0;i<ch.length;i++){
			if(ch[i] == '字'){
				System.out.println("字符在字符组中出现的位置为"+i);
			}
		}
		
	}
}