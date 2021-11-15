package is.hi.noteshare.persistence.entities;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name ="schools", schema = "public")
public class School {
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "level")
    private String level;

    @OneToMany(mappedBy ="school")
    private List<Course> courses;

    public School(){}

    public School(String name, String level){
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level){
        this.level = level;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

}
