import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Album {
    public static List<Album> albumList = new ArrayList<Album>();


    public String AlbumName;
    public List<Song> songList;

    public Album(String albumName, List<Song> songList) {

        AlbumName = albumName;
        this.songList = songList;
    }

    public Album(String albumName) {

        AlbumName = albumName;
        this.songList = new ArrayList<Song>();
    }

    public static boolean searchAlbumByName(String searchName){
        for(Album album: albumList){
            if(album.AlbumName.equalsIgnoreCase(album.AlbumName))
                return true;
        }
        return false;
    }
}
