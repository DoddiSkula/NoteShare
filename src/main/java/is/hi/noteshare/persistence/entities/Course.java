package is.hi.noteshare.persistence.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "courses", schema = "public")
public class Course {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "short_name")
    private String shortName;

    @Column(name = "name")
    private String longName;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "school_id")
    private School school;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "degree_id")
    private Degree degree;

    @ManyToMany(mappedBy = "userCourses")
    private List<User> users;

    @ManyToMany
    @JoinTable(name = "course_subjects",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id"))
    private List<Subject> subjects;


    public Course() {}

    public long getId(){
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(){
        this.shortName = shortName;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Degree getDegree() { return degree; }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public List<Subject> getSubjects() { return subjects; }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public List<User> getUsers() { return users; }

    public void setUsers(List<User> users) { this.users = users; }

}
