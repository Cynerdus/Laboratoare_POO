package Task4;

public class ThrillerAlbum extends Album{
    @Override
    public void addSong(Song song) {
        if (song.getComposer().matches("Michael Jackson") && song.getId() % 2 == 0)
            songList.add(song);
    }
}
