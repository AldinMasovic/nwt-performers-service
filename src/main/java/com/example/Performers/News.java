package com.example.Performers;

import java.util.Date;
        import java.util.List;
        import javax.persistence.*;

/**
 *
 * @author DT User
 */
@Entity
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long newsId;
    @ManyToOne
    private User userId;
    private String message;
    private Date date;
    private boolean isRead;


    protected News() {
    }

    public News(User u,String message, Date date, boolean isRead) {
        this.userId=u;
        this.message=message;
        this.date=date;
        this.isRead=isRead;
    }

    @Override
    public String toString() {
        return String.format(
                "News[NewsId='%s', UserId='%s', Message='%s', Date='%s', IsRead='%s']",
                newsId, userId.getUserId(), message, date, isRead);
    }

    public Long getUserId() {
        return userId.getUserId();
    }

    public Long getNotificationId() {
        return newsId;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    public boolean getIsRead() {
        return isRead;
    }

}
