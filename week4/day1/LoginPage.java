package week4.day1;




class LoginPage extends BasePage{
	
	public void performCommonTask()
	{
		System.out.println("Performing Common Task from Login Page");
		
	}
	
	public static void main(String[] args) {
		
		BasePage bp = new BasePage();
		bp.findElement();
		bp.clickElement();
		bp.enterText();
		bp.performCommonTask();
		
		System.out.println("-------------------------");
		
		LoginPage lp = new LoginPage();
		lp.findElement();
		lp.clickElement();
		lp.enterText();
		lp.performCommonTask();
	}

}
