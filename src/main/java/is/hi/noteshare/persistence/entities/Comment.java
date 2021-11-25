package is.hi.noteshare.persistence.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "comments", schema = "public")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private long id;

    @Column(name = "file_id")
    private long fileId;

    @Column(name = "user_id")
    private long userId;

    @Column(name = "comment")
    private String text;

    @Column(name = "likes")
    private int likes;

    public Comment() {}

    public Comment(long fileId, long userId, String text, int likes){
        this.fileId = fileId;
        this.userId = userId;
        this.text = text;
        this.likes = likes;
    }

    public long getId() {
        return id;
    }

    public void setID(long id) {
        this.id = id;
    }

    public long getFileId() {
        return fileId;
    }

    public void setFileId(long fileId) {
        this.fileId = fileId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setLikes(int likes) { this.likes = likes; }

    public int getLikes() { return likes; }
}
