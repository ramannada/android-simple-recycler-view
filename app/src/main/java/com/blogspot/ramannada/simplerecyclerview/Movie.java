package com.blogspot.ramannada.simplerecyclerview;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ramannada on 10/20/2017.
 */

public class Movie implements Parcelable {
    private String title;
    private String synopsis;
    private String director;
    private String releaseDate;
    private String boxOffice;
    private String duration;
    private int poster;

    public Movie(String title, String synopsis, String director, String releaseDate, String boxOffice, String duration, int image) {
        this.title = title;
        this.synopsis = synopsis;
        this.director = director;
        this.releaseDate = releaseDate;
        this.boxOffice = boxOffice;
        this.duration = duration;
        this.poster = image;
    }

    public Movie(String title, String duration, int image) {
        this.title = title;
        this.duration = duration;
        this.poster = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getBoxOffice() {
        return boxOffice;
    }

    public void setBoxOffice(String boxOffice) {
        this.boxOffice = boxOffice;
    }

    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.synopsis);
        dest.writeString(this.director);
        dest.writeString(this.releaseDate);
        dest.writeString(this.boxOffice);
        dest.writeString(this.duration);
        dest.writeInt(this.poster);
    }

    protected Movie(Parcel in) {
        this.title = in.readString();
        this.synopsis = in.readString();
        this.director = in.readString();
        this.releaseDate = in.readString();
        this.boxOffice = in.readString();
        this.duration = in.readString();
        this.poster = in.readInt();
    }

    public static final Parcelable.Creator<Movie> CREATOR = new Parcelable.Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel source) {
            return new Movie(source);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };
}
