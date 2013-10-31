package dbrown_regex;

public class FishUrl {
	   private String fishUrl;
	   private String [] uArray;

	    public FishUrl(String fishUrl) {
	        this.fishUrl = fishUrl;
	    }

	    public String getUrl() {
	    	uArray = fishUrl.split("http(s)");
			return fishUrl;
	    }

	    public String getDomain() {
	    	uArray = fishUrl.split("/");
			return uArray[2];
	    }

	    public String getPath() {
	    	uArray = fishUrl.split("/");
			 return uArray[1];
	    }


	    @Override
	    public String toString() {
	        return "URL: " + getUrl() + "\n" +
	                "Domain: " + getDomain() + "\n" +
	                "Path: " + getPath() + "\n";
	    }
	
}
