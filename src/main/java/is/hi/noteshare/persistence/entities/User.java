package is.hi.noteshare.persistence.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private String username;
    private String password;
    private int schoolid;
    private String email;
    private boolean isAdmin;
    private int[] courses;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Comment> comments = new ArrayList<>();

    public User() {
    }

    public User(String username, String password, int schoolid, String email, boolean isAdmin, int[] courses){
        this.username = username;
        this.password = password;
        this.schoolid = schoolid;
        this.email = email;
        this.isAdmin = isAdmin;
        this.courses = courses;
    }

    //vantar meira her
}
