package com.company;

public class Main {

    public static void main(String[] args) {
task firstTask = new task("Put on Socks", 6 );
task anotherTask=new task ("Brush teeth",9);
anotherTask.setDescription("Put toothbrush with toothpaste in your mouth and clean!!");
task yetAnotherTask = new task("Eat breakfast",3);
task stillAnotherTask = new task("Go to school",5);
stillAnotherTask.setDescription("Use legs to move to the building where schooling happens");

taskList toDoList = new taskList("To Do List");
    toDoList.add(firstTask);
    toDoList.add(anotherTask);
    toDoList.add(yetAnotherTask);
    toDoList.add(stillAnotherTask);


      // System.out.println(toDoList); this does nothing useful

        toDoList.display();
        System.out.println("\n\n\n");
        toDoList.display("priorityValue");
    }
}