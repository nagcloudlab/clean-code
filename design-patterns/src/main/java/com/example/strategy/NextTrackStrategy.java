package com.example.strategy;

import java.util.List;

public interface NextTrackStrategy {
     Track getNextTrack(List<Track> tracks);
}
