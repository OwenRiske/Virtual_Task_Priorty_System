package com.company;

import java.util.Date;

public class task {
    public String taskName;//Can be accessed and changed from anywhere
    private String description; //Can only be accessed from inside the same object
    int priorityValue;//Package private (similar to public) by default
    private boolean completed;

    Date targetCompletionDate;



//Constructor
    task(String newTaskName, int newPriorityValue){
        taskName= newTaskName;
        priorityValue=newPriorityValue;
        completed=false;
    }
    void setDescription(String newDescription){
        description=newDescription;
    }

    String getDescription(){
        return description;
    }

    void markCompleted(){
        completed=true;
        priorityValue=0;
        description="This task is complete. " +description;


    }

}
