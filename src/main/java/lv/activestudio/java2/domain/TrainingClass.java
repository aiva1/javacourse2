package lv.activestudio.java2.domain;

public class TrainingClass {

    private Long id;
    private String name;
    private String description;
    private Teacher teacher; //TODO: or String teacherName ?

    @Override
    public String toString() {
        return "TrainingClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", teacher=" + teacher +
                '}';
    }

    //TODO: override hashCode and equals

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
