package corejava;

public class GraduateStudent extends Student {
	//Fields
    private String advisor;
    private String thesisTopic;
    //Method
    public GraduateStudent(String name, int age, int studentId, String major, String advisor, String thesisTopic) {
        super(name, age, studentId, major);
        this.advisor = advisor;
        this.thesisTopic = thesisTopic;
    }
    //Creating Getter and Setter

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

    public String getThesisTopic() {
        return thesisTopic;
    }

    public void setThesisTopic(String thesisTopic) {
        this.thesisTopic = thesisTopic;
    }
}