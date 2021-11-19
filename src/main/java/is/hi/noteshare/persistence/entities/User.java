package is.hi.noteshare.persistence.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users", schema = "public")
public class User {

    @Column(name = "school_id")
    private int schoolId;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Id
    @Column(name = "email")
    private String email;

    @Column(name = "admin")
    private boolean admin;

    @ManyToMany
    @JoinTable(name = "user_courses",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<Course> courses;

    public User() {}

    public User(String username, String password, int schoolId, String email, boolean admin){
        this.username = username;
        this.password = password;
        this.schoolId = schoolId;
        this.email = email;
        this.admin = admin;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

}
