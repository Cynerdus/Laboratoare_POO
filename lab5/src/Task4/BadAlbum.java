package Task4;

import java.util.ArrayList;
import java.util.List;

public class BadAlbum extends Album{

    private int getNumberOfDigits(int number) {
        if (number < 10) return 1;

        return getNumberOfDigits(number / 10) + 1;
    }

    private boolean isPalindrome(int number) {
        ArrayList<Integer> digits = new ArrayList<>();

        while (number != 0) {
            digits.add(number % 10);
            number /= 10;
        }

        int count = digits.size();

        while (!digits.isEmpty()) {
            if (digits.get(0).intValue() != digits.get(count - 1).intValue())
                return false;

            digits.remove(0);
            if (!digits.isEmpty())
                digits.remove(count - 2);
            count -= 2;
        }

        return true;
    }

    @Override
    public void addSong(Song song) {
        if (song.getName().length() == 3 && isPalindrome(song.getId()))
            songList.add(song);
    }
}
