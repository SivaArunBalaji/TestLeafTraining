package week2.day1;

public class Browser {
	
	public String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
		return browserName;
	}
	
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser BrowserActions = new Browser();
		String Br = "Chrome";
		//System.out.println(BrowserActions.launchBrowser(Br));
		BrowserActions.launchBrowser(Br);
		BrowserActions.loadUrl();

	}

}
