package mytool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 用于随机分配任务，参与者所分配任务不重复
 * @author Administrator
 */
public class RandomTask {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		System.out.print("请输入参与组数:");
		int peopleNum = in.nextInt();    //参与人数
		System.out.print("请输入待选项个数:");
		int choiceNum = in.nextInt();    //待选项个数
		//循环产生随机数，添加到集合中（所添加数不重复！）
		for (int i = 0; i < peopleNum; i++) {
			do {
				//产生待选项个数范围内的随机数
				int num = (int)(Math.random()*choiceNum) + 1;
				//判断集合中是否已包含新产生的随机数,若未包含则添加该数
				if (!li.contains(num)) {  
					li.add(num);
					break;
				}
			} while (true);
		}
		//遍历显示集合元素
		for (int i = 0; i < li.size(); i++) {
			System.out.println((i+1) + "号参与者的任务:" + li.get(i));
		}
		in.close();
	}
}
