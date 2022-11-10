package Task4;

import java.util.ArrayList;

public abstract class Album {
    protected final ArrayList<Song> songList = new ArrayList<>();

    abstract void addSong(Song song);

    void removeSong(Song song) {
        songList.remove(song);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("Album{songs=[");
        for (Song song : songList) {
            output.append("Song{name=").append(song.getName()).append(", id=").append(song.getId()).append(", composer=").append(song.getComposer()).append("}");
            if (!song.equals(songList.get(songList.size() - 1)))
                output.append(", ");
        }
        output.append("]}");
        return output.toString();
    }
}
