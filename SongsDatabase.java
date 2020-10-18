import java.util.Map;
import java.util.HashMap;

public class SongsDatabase {
private Map<String, Set<String>> genreMap = new HashMap<String, Set<String>>();

public void addSong(String genre, String songTitle) {

genreMap.put(genre,songTitle);
    

    

        

    }

    public Set<String> getSongs(String genre) {

        return genre;

    }

    public String getGenreOfSong(String songTitle) {

        return songTitle; 
        // You must implement this method

    }

}

/*So, your hashMap, visually,  looks like the following:



Soul -> (SoulSong1, SoulSong2, SoulSong3, etc.)

Rock -> (RockSong1, RockSong2, RockSong3, etc.)

Jazz -> (JazzSong1, JazzSong2, JazzSong3, etc.)

Etc.



Hint:

Your hash map is a name-value pair where the name is a genre.  The genre is a key to retrieve your songs that are stored in a set.  When you add a genre-song value pair you must use the genre to retrieve your set from your map.  Once retrieved, you can add additional songs to the set.  You must account for the case when initially the genre has not been created yet.
*/



/*So, your hashMap, visually,  looks like the following:



Soul -> (SoulSong1, SoulSong2, SoulSong3, etc.)

Rock -> (RockSong1, RockSong2, RockSong3, etc.)

Jazz -> (JazzSong1, JazzSong2, JazzSong3, etc.)

Etc.



Hint:

Your hash map is a name-value pair where the name is a genre.  The genre is a key to retrieve your songs that are stored in a set.  When you add a genre-song value pair you must use the genre to retrieve your set from your map.  Once retrieved, you can add additional songs to the set.  You must account for the case when initially the genre has not been created yet.
*/