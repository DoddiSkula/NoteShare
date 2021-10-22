package is.hi.noteshare.persistence.entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;



@Entity
@Table(name ="schools")

public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Course> courses = new ArrayList<>();

    public School(){

    }

    public School(String name){
        this.name = name;
    }

    public long getid(){
        return id;
    }

    public void setid(long id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
