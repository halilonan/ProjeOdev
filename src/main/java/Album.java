import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Album {
    public static List<Album> albumList = new ArrayList<Album>();

    public int Id;
    public String AlbumName;
    public List<Song> songList;

    public Album(int Id,String albumName, List<Song> songList) {
        this.Id = Id;
        AlbumName = albumName;
        this.songList = songList;
    }

    public Album(int Id,String albumName) {
        this.Id = Id;
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
