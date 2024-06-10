package com.example.strategy;

import java.util.List;

public class PlayList {

    private List<Track> tracks = new java.util.ArrayList<>();
    private NextTrackStrategy nextTrackStrategy;

    public PlayList(NextTrackStrategy nextTrackStrategy) {
        this.nextTrackStrategy = nextTrackStrategy;
    }

    public void setNextTrackStrategy(NextTrackStrategy nextTrackStrategy) {
        this.nextTrackStrategy = nextTrackStrategy;
    }

    public void addTrack(Track track) {
        tracks.add(track);
    }

    public void removeTrack(Track track) {
        tracks.remove(track);
    }

    public Track getNextTrack() {
        return nextTrackStrategy.getNextTrack(tracks);
    }

}
