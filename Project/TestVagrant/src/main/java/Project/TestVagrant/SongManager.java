package Project.TestVagrant;
import java.util.*;

public class SongManager 
{
    private final int capacity; 
    private final Map<String, LinkedList<String>> userSongs; 
    private final Map<String, Integer> songPositions; 
    public SongManager(int capacity)
    {
        this.capacity = capacity;
        this.userSongs = new HashMap<>();
        this.songPositions = new HashMap<>();
    }
    
    public void addToRecentSongs(String user, String song) 
    {
        LinkedList<String> songs = userSongs.computeIfAbsent(user, k -> new LinkedList<>());
        
        if (songs.size() >= capacity) 
        {
            String oldestSong = songs.removeLast();
            songPositions.remove(oldestSong);
        }
        
        songs.addFirst(song);
        songPositions.put(song, 0);
    }
    
    public List<String> getRecentSongs(String user) 
    {
        return userSongs.getOrDefault(user, new LinkedList<>());
    }
}
