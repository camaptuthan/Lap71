
package taskmanagement;

public class Task {
    private int id;
    private String name;
    private String taskType;
    private String date;
    private double planTo;
    private double planFrom;
    private String assignee;
    private String reviewer;

    public Task() {
    }

    public Task(int id, String name, String taskType, String date, double planTo, double planFrom, String assignee, String reviewer) {
        this.id = id;
        this.name = name;
        this.taskType = taskType;
        this.date = date;
        this.planTo = planTo;
        this.planFrom = planFrom;
        this.assignee = assignee;
        this.reviewer = reviewer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPlanTo() {
        return planTo;
    }

    public void setPlanTo(double planTo) {
        this.planTo = planTo;
    }

    public double getPlanFrom() {
        return planFrom;
    }

    public void setPlanFrom(double planFrom) {
        this.planFrom = planFrom;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }
    
}
