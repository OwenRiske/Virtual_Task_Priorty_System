package com.company;

import java.util.ArrayList;

public class taskList {
    String listName;
    ArrayList<task>list;

    public taskList(String listName) {
        this.listName = listName;
        list= new ArrayList<task>();
    }

    void add(task newTask){
        list.add(newTask);
    }

    //Example of Polymorphism
    void display(){
        int counter=1;
        for(task thisTask:list){
            System.out.print(counter+". ");
            System.out.println(thisTask.taskName);
            counter++;
        }


    }
    //Overloaded display method
    void display(String sortKey){
       //display sorted, based on parameter sortKey is given
        if (sortKey.equalsIgnoreCase("priorityValue")){
            int counter=1;
            for (int i=10; i>0; i--){
                for(task thisTask: list){
                    if (thisTask.priorityValue==i){
                        System.out.println(counter+". "+thisTask.taskName);
                        counter++;
                    }

                }
            }
        }
        else{
            System.out.println("Invalid sort key, Please try again");
        }
    }
}
