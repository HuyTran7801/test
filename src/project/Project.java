package project;

import java.util.ArrayList;
import java.util.Date;

public class Project {
    private String projectId;
    private Date startDate;
    private Date endDate;
    ArrayList<Employee> listOfEmployee = new ArrayList<>();

    public Project(String projectId, Date startDate, Date endDate){
        this.projectId = projectId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public ArrayList<Employee> getListOfEmployee() {
        return listOfEmployee;
    }

    public void setListOfEmployee(ArrayList<Employee> listOfEmployee) {
        this.listOfEmployee = listOfEmployee;
    }

    public void addEmployee (Employee employee){
       listOfEmployee.add(employee);
    }

    public void checkEmployee(){
        for(int i = 0;i < listOfEmployee.size();i++){
            Employee employee = listOfEmployee.get(i);
        }
    }

    public int estimateBudget(Employee employee){
        int budget = employee.getSalaryPerHour()*

        return budget;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId='" + projectId + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", listOfEmployee=" + listOfEmployee +
                '}';
    }
}
