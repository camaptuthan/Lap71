package taskmanagement;

import java.util.ArrayList;

public class TaskManagement {

    Validate m = new Validate();

    public static void main(String[] args) {
        TaskManagement a = new TaskManagement();
        a.run();
    }

    public void run() {
        ArrayList<Task> list = new ArrayList<>();
        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. Show task");
            System.out.println("4. Exit the program");
            int choice = m.checkInt("Enter your choice: ", 1, 4);
            switch (choice) {
                case 1:
                    addTask(list);
                    break;
                case 2:
                    deleteTask(list);
                    break;
                case 3:
                    showTask(list);
                    break;
                case 4:
                    return;
            }
        }
    }

    public void addTask(ArrayList<Task> list) {
        System.out.print("Enter Requirement Name: ");
        String requirementName = m.checkInputString();
        String taskTypeId = m.checkInputTypeId();
        System.out.print("Enter Date: ");
        String date = m.checkDate();
        System.out.print("Enter From: ");
        double planFrom = m.checkPlanFrom();
        System.out.print("Enter To: ");
        double planTo = m.checkPlanTo(planFrom);
        System.out.print("Enter Assignee: ");
        String assign = m.checkInputString();
        System.out.print("Enter Reviewer: ");
        String review = m.checkInputString();
        if (list.isEmpty()) {
            list.add(new Task(1, requirementName, taskTypeId,
                    date, planTo, planFrom, assign, review));
        } else {
            list.add(new Task(list.get(list.size() - 1).getId() + 1, requirementName,
                    taskTypeId, date, planTo, planFrom, assign, review));
        }
    }

    public int findTaskIdExits(ArrayList<Task> list) {
        int id = m.checkInt("Enter Id: ", 1, Integer.MAX_VALUE);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        System.err.println("Not found!!");
        return -1;
    }

    public void deleteTask(ArrayList<Task> list) {
        if (list.isEmpty()) {
            System.err.println("List is Empty!!!");
        } else {
            int findId = findTaskIdExits(list);
            if (findId != -1) {
                list.remove(findId);
                System.out.println("Successful");
            }
        }
    }

    public void showTask(ArrayList<Task> list) {
        if (list.isEmpty()) {
            System.err.println("List is empty!!");
            return;
        }
        System.out.printf("%-7s%-15s%-15s%-15s%-15s%-15s%-15s\n",
                "ID", "Name", "Task Type", "Date", "Time", "Assigment", "Reviewer");
        

        for (Task task : list) {
            System.out.printf("%-7s%-15s%-15s%-15s%-15s%-15s%-15s\n",
                    task.getId(), task.getName(),
                    task.getTaskType(), task.getDate(),
                    task.getPlanTo() - task.getPlanFrom(),
                    task.getAssignee(), task.getReviewer());
        }
    }
}


