package Javaweek2;

public class Browser {

	
	    public String launchBrowser() {
	        return "Browser launched successfully";
	    }

	 	    public void loadURL(String url) {
	        System.out.println("Loading URL: " + url);
	    }
	    
	    public static void main(String[] args) {
	       
	        Browser myBrowser = new Browser();
	        	    
	        System.out.println(myBrowser.launchBrowser());
	        
	          myBrowser.loadURL("www.google.com");
	    }
	

	}


