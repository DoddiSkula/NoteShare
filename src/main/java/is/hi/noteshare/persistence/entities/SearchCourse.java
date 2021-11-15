package is.hi.noteshare.persistence.entities;


public class SearchCourse {
    private long school;
    private long subject;
    private long degree;
    private String keyword;

    public SearchCourse() {}

    public SearchCourse(long school, long subject, long degree, String keyword) {
        this.school = school;
        this.subject = subject;
        this.degree = degree;
        this.keyword = keyword;
    }

    public long getDegree() {
        return degree;
    }

    public void setDegree(long degree) {
        this.degree = degree;
    }

    public long getSchool() {
        return school;
    }

    public void setSchool(long school) {
        this.school = school;
    }

    public long getSubject() {
        return subject;
    }

    public void setSubject(long subject) {
        this.subject = subject;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
