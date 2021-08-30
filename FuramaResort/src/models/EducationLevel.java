package models;

public class EducationLevel {
    private String educationLevel;
    private String intermediate;
    private String College;
    private String University;
    private String afterUniversity;

    public EducationLevel(String educationLevel, String intermediate, String college, String university, String afterUniversity) {
        this.educationLevel = educationLevel;
        this.intermediate = intermediate;
        College = college;
        University = university;
        this.afterUniversity = afterUniversity;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getIntermediate() {
        return intermediate;
    }

    public void setIntermediate(String intermediate) {
        this.intermediate = intermediate;
    }

    public String getCollege() {
        return College;
    }

    public void setCollege(String college) {
        College = college;
    }

    public String getUniversity() {
        return University;
    }

    public void setUniversity(String university) {
        University = university;
    }

    public String getAfterUniversity() {
        return afterUniversity;
    }

    public void setAfterUniversity(String afterUniversity) {
        this.afterUniversity = afterUniversity;
    }
}
