import java.util.ArrayList;
import java.util.List;

public class Singer {


    public String SingerName;
    public List<Album> albumList = new ArrayList<Album>();
    public List<Song> songList = new ArrayList<Song>();
    public  static List<Singer> singerList = new ArrayList<Singer>();

    public Singer(String singerName){
        SingerName = singerName;
    }



    public static boolean searchSingerByName(String searchName){
        for(Singer singer: singerList){
            if(singer.SingerName.equalsIgnoreCase(singer.SingerName))
                return true;
        }
        return false;
    }
}