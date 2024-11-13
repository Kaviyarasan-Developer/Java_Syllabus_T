

import java.util.Arrays;

public class SongPlaylist {
    public static void main(String[] args) {
        // Initializing an array of song titles
        String[] songs = {"Let it Be", "Bohemian Rhapsody", "Imagine", "Stairway to Heaven", "Hotel California"};

        // 1. Printing the original array
        System.out.println("Original Playlist: " + Arrays.toString(songs));
        
        // 2. Sorting the array (alphabetically)
        Arrays.sort(songs);
        System.out.println("Sorted Playlist: " + Arrays.toString(songs));

        // 3. Searching for a specific song in the sorted array
        int index = Arrays.binarySearch(songs, "Imagine");
        System.out.println("Index of 'Imagine': " + index);  // Returns the index of the song

        // 4. Filling the array with a specific song (for example, repeating a song)
        Arrays.fill(songs, "Song Repeated");
        System.out.println("Playlist After Filling with 'Song Repeated': " + Arrays.toString(songs));

        // 5. Copying the playlist into a new array (with 7 elements)
        String[] newSongs = Arrays.copyOf(songs, 7);
        System.out.println("New Playlist After Copying (with extra empty slots): " + Arrays.toString(newSongs));

        // 6. Comparing two arrays (check if two playlists are the same)
        String[] songsCopy = {"Song Repeated", "Song Repeated", "Song Repeated", "Song Repeated", "Song Repeated", "Song Repeated"};
        boolean isEqual = Arrays.equals(songs, songsCopy);
        System.out.println("Are the original and copied playlists equal? " + isEqual);

        // 7. Converting the song array to a list
        System.out.println("Playlist as List: " + Arrays.asList(songs));

        // 8. Deep string representation (useful for multi-dimensional arrays, but works for one-dimensional too)
        System.out.println("Deep String Representation of Playlist: " + Arrays.deepToString(songs));
    }
}
