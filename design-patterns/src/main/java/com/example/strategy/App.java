package com.example.strategy;

public class App {
    public static void main(String[] args) {

        // FIFO
        NextTrackStrategy fifo = tracks -> tracks.remove(0);

        // LIFO
        NextTrackStrategy lifo = tracks -> tracks.remove(tracks.size() - 1);

        // Random
        NextTrackStrategy rand = tracks -> {
            int random = (int) (Math.random() * tracks.size());
            return tracks.remove(random);
        };


        PlayList playList1 = new PlayList(rand);
        playList1.addTrack(new Track("Track 1", "Artist 1", "Album 1", "Genre 1", 2021));
        playList1.addTrack(new Track("Track 2", "Artist 2", "Album 2", "Genre 2", 2022));
        playList1.addTrack(new Track("Track 3", "Artist 3", "Album 3", "Genre 3", 2023));


        Track track = playList1.getNextTrack();
        System.out.println(track);

        track = playList1.getNextTrack();
        System.out.println(track);

        track = playList1.getNextTrack();
        System.out.println(track);

    }
}
