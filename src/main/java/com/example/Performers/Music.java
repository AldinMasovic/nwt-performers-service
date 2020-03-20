package com.example.Performers;

import javax.persistence.*;

        import javax.persistence.ManyToMany;
        import java.util.List;

@Entity
public class Music {

    @Id
    private Long musicId;

    protected Music() {
    }
    public Music(Long id) {
        this.musicId=id;
    }

    @Override
    public String toString() {
        return String.format(
                "Music[id=%d]",
                musicId);
    }

    public Long getEventId() {
        return musicId;
    }
    public void setEventId(Long musicId) {
        this.musicId=musicId;
    }

    @ManyToMany(mappedBy = "musicsList")
    private List<User> userList;
}