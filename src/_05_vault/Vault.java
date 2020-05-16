package _05_vault;

public class Vault {

	int secretcode = 12345;
	
	boolean tryCode(int number) {
		if(number==12345) {
			return true;
		}
		else {
			return false;
		}
	}
	
public class JamesBond{
	
	void findCode(Vault vault) {
		for (int i = 0; i < 1000001; i++) {
			tryCode(i);
		}
	}
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vault vault = new Vault();
		
		vault.tryCode(12345);
	}

}
