package is.hi.noteshare.persistence.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @ManyToOne(fetch = FetchType.LAZY)
    private File file;

    @ManyToOne(fetch =FetchType.LAZY)
    private User user;

    private Date date;
    private int userid;
    private String text;

    public Comment(){

    }

    public Comment(File file, User user, Date date, int userid, String text){
        this.file = file;
        this.user = user;
        this.date = date;
        this.userid = userid;
        this.text = text;
    }

    public long getId() {
        return Id;
    }

    public void setID(long Id) {
        this.Id = Id;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
