package is.hi.noteshare.persistence.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "files", schema = "public")
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private long id;

    @Column(name = "user_id")
    private long user;

    @Column(name = "course_id")
    private long course;

    @Column(name = "date")
    private Date date;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "likes")
    private int likes;
    
    @Column(name = "data")
    private byte[] data;

    public File(){}

    public File(Date date, String title, String description, long user, long course, String fileName, int likes, byte[] data){
        this.date = date;
        this.title = title;
        this.description = description;
        this.user = user;
        this.course = course;
        this.fileName = fileName;
        this.likes = likes;
        this.data = data;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date.toString().substring(0,11);
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getUser() {
        return user;
    }

    public void setUser(long user) {
        this.user = user;
    }

    public long getCourse() {
        return course;
    }

    public void setCourse(long course) {
        this.course = course;
    }

    public String getFileName() { return fileName; }

    public void setFileName(String fileName) { this.fileName = fileName; }

    public int getLikes() { return likes; }

    public void setLikes(int likes) { this.likes = likes; }

    public byte[] getData() { return data; }

    public void setData(byte[] data) { this.data = data; }

}
