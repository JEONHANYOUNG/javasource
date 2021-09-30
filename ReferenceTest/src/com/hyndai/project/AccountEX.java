package com.hyndai.project;

import java.util.Scanner;

// 같은 패키지가 아닌 클래스를 불러올 때 필요 
import com.samsung.project.Account;

public class AccountEX {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		
		
		//홍길동 계좌
		Account account1 = new Account("122-01-12222",10000,"홍길돟");
		// The field Account.accountNo is not visible
		//account1.accountNo= "122-01-12222";
		//account1.balance=10000;
		//account1.name="홍길동";
		
	    // 입금
		account1.deposit(50000);
		
		//출금
		System.out.println("현재 잔액: "+account1.withdraw(30000));		
	
	}

}
