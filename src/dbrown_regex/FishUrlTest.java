package dbrown_regex;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class FishUrlTest {

	    FishUrl fishUrl;
	    
	    /**
	     * Get Null pointer exception.
	     */

	    @Before
	    public void setUp() {
	        FishUrl testFishUrl = new FishUrl("This is a url http://www.yahoo.com/yourmail");
	    }

	    @Test
	    public void testGetUrl() throws Exception {
	    	String result = fishUrl.getUrl();
	        Assert.assertEquals("This is a url http://www.yahoo.com/yourmail", result);

	    }

	    @Test
	    public void testGetDomain() throws Exception {
	        String result = fishUrl.getUrl();
	        Assert.assertEquals("www.yahoo.com", result);
	    }

	    @Test
	    public void testGetPath() throws Exception {
	        String result = fishUrl.getUrl();
	        Assert.assertEquals("yourmail", result);
	    }
	

}
