package Project.TestVagrant;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SongManagerTest 
{
    private SongManager mgr;
    
    @BeforeMethod
    public void setUp() 
    {
        mgr = new SongManager(3); 
    }
    
    @Test
    public void testAddToRecentSongs() 
    {
        mgr.addToRecentSongs("user1", "song1");
        mgr.addToRecentSongs("user1", "song2");
        mgr.addToRecentSongs("user1", "song3");
        
        assertEquals(mgr.getRecentSongs("user1").size(), 3);
        assertTrue(mgr.getRecentSongs("user1").contains("song1"));
        assertTrue(mgr.getRecentSongs("user1").contains("song2"));
        assertTrue(mgr.getRecentSongs("user1").contains("song3"));
    }
    
    @Test
    public void testCapacityEviction()
    {
    	mgr.addToRecentSongs("user1", "song1");
    	mgr.addToRecentSongs("user1", "song2");
    	mgr.addToRecentSongs("user1", "song3");
    	mgr.addToRecentSongs("user1", "song4"); // removing "song1"
        
        assertFalse(mgr.getRecentSongs("user1").contains("song1"));
        assertTrue(mgr.getRecentSongs("user1").contains("song2"));
        assertTrue(mgr.getRecentSongs("user1").contains("song3"));
        assertTrue(mgr.getRecentSongs("user1").contains("song4"));
    }
    
    @Test
    public void testGetRecentSongs() 
    {
    	mgr.addToRecentSongs("user1", "song1");
    	mgr.addToRecentSongs("user1", "song2");
        
        assertEquals(mgr.getRecentSongs("user1").size(), 2);
        assertTrue(mgr.getRecentSongs("user1").contains("song1"));
        assertTrue(mgr.getRecentSongs("user1").contains("song2"));
    }
}
