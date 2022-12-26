package Task4;

public class DangerousAlbum extends Album{

    private boolean isPrime(int number) {
        if (number == 1 || (number != 2 && number % 2 == 0))
            return false;

        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0)
                return false;
        }

        return true;
    }

    @Override
    public void addSong(Song song) {
        if (isPrime(song.getId()))
            songList.add(song);
    }
}
