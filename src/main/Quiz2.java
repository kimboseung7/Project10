package main;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		System.out.println("드라이버를 선택하세요.");
		System.out.println("1 : Mysql");
		System.out.println("2 : Oracle");
		System.out.println("3 : Postgres");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		DBDriver dbDriver = null;
		
		if(num ==1) {
			dbDriver = new MysqlDriver();
		}
		else if(num == 2) {
			dbDriver = new OracleDBDriver();
		}
		else if (num == 3) {
			dbDriver = new PostgresDbDriver();
		}
		if( dbDriver != null) {
			dbDriver.dbConnet();
		}
	}

}
class MysqlDriver implements DBDriver{

	@Override
	public void dbConnet() {
		System.out.println("MySql DB에 연결합니다");
		
		
	}
	
}
class OracleDBDriver implements DBDriver{

	@Override
	public void dbConnet() {
		System.out.println("Oracle DB에 연결합니다");
		
	}
	
}
class PostgresDbDriver implements DBDriver{

	@Override
	public void dbConnet() {
		System.out.println("PostgresDbDriver DB에 연결합니다");
		
	}
	
}