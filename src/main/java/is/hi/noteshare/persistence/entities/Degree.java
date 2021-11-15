package is.hi.noteshare.persistence.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "degrees", schema = "public")
public class Degree {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "degree")
    private String degree;

    @OneToMany(mappedBy = "degree")
    private List<Course> courses;

    public Degree() {}

    public Degree(long id, String degree){
        this.id = id;
        this.degree = degree;
    }

    public long getId(){
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDegree() { return degree; }

    public void setDegree(String degree){ this.degree = degree; }

    public List<Course> getCourses() { return courses; }

    public void setCourses(List<Course> courses){ this.courses = courses; }
}
