package gacha2;

import java.util.Scanner;
import service.process;

public class main {

	
	public static void main(String[] args) {
		while(true){
			Scanner scanner = new Scanner(System.in);
			System.out.println("単発か10連か入力してください 単発の場合は1, 10連の場合は10: ");
			int num = scanner.nextInt();
			decision(num);
			//else if(n == 10) {
			//	juren.main(args);
			//}
			//if(num == 1 || num == 10) {
				//process.syori(num);
			//}
			//else if(n == 10) {
			//	juren.main(args);
			//}
			//else {
				//System.out.println("単発の場合は1, 10連の場合は10を入れてください");
			//}
		}
		// TODO 自動生成されたメソッド・スタブ

	}

	public static void decision(int num) {
		if(num == 1 || num == 10) {
			process.syori(num);
		}
		//else if(n == 10) {
		//	juren.main(args);
		//}
		else {
			System.out.println("単発の場合は1, 10連の場合は10を入れてください");
		}
	}
}
