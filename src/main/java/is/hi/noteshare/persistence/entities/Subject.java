package is.hi.noteshare.persistence.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "subjects", schema = "public")
public class Subject {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "subject")
    private String subject;

    @ManyToMany(mappedBy = "subjects")
    private List<Course> courses;

    public Subject() {}

    public Subject(long id, String subject){
        this.id = id;
        this.subject = subject;
    }

    public long getId(){
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSubject() { return subject; }

    public void setSubject(String subject){ this.subject = subject; }

    public List<Course> getCourses() { return courses; }

    public void setCourses(List<Course> courses){ this.courses = courses; }

}
