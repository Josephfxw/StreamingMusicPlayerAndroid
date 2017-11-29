package com.josephxwf.streamingmusic;


public class Song {

    int Id;
    String title;
    int numplays;
    int numlikes;
    String artist;

    public Song (String Id, String title, String numplays, String numlikes, String aritst) {
        try {
            this.Id = Integer.parseInt(Id);
        } catch (Exception e) {
            this.Id = 0;
        }
        this.title = title;
        try {
            this.numplays = Integer.parseInt(numplays);
        } catch (Exception e) {
            this.numplays = 0;
        }
        try {
            this.numlikes = Integer.parseInt(numlikes);
        } catch (Exception e) {
            this.numlikes = 0;
        }
        this.artist = aritst;
    }

    public int getId () {
        return Id;
    }

    public String getTitle () {
        return title;
    }

    public int getNumplays(){
        return numplays;
    }

    public int getNumlikes () {
        return numlikes;
    }
    public String getArtist () {
        return artist;
    }
}
