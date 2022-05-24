
class PasswordException extends Exception{
	
	String errorM;
	
	public PasswordException(String errorM) {
		super(errorM);
	}
}

class PasswordTest{
	private String password;
	
	private String pass = new String();
	
	public String getPass() {
		return pass;
	}
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) throws PasswordException {
		if(password == null) {
			PasswordException pw = new PasswordException("��й�ȣ�� null���Դϴ�!");
			throw pw;
		}else if(password.length() < 5) {
			PasswordException pw = new PasswordException("��й�ȣ�� 5�ں��� �����ϴ�!");
			throw pw;
		}else if(pass.matches("[a-zA-z]+") == true) {
			PasswordException pw = new PasswordException("��й�ȣ�� ��� ���ڿ��Դϴ�!");
			throw pw;
		}
		this.password = password;
	}
}

public class May23 {

	public static void main(String[] args) {
		PasswordTest test = new PasswordTest();
		
		String userPw = null;
		
		try {
			test.setPassword(userPw);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		userPw = "aaa";
		
		try {
			test.setPassword(userPw);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		userPw = "aaa123";
		
		try {
			test.setPassword(userPw);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
