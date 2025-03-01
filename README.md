## 📂 Task Manager CLI (Java)
A simple **command-line task manager** built in **Java** that allows users to **add, list, and mark tasks as completed**. Task data is persisted using file storage.

### 🚀 Features
✅ Add tasks with a title and description\
✅ List all tasks (shows completed and pending)\
✅ Mark tasks as completed\
✅ Persist tasks using file storage (serialization)\

### 🛠️ Technologies Used
Java (Object-Oriented Programming)\
File I/O (Persistent task storage using serialization)\
Command-line Interface (Scanner for user input)\
### 📖 How to Run
Clone this repository:
```sh
git clone https://github.com/leonardof108/TaskManager.git
cd TaskManager
```
Compile the Java files:
```sh

javac src/com/leonardof108/taskmanager/*.java src/com/leonardof108/task/*.java src/Main.java -d out
```
Run the program:
```sh
java -cp out Main
```
### 📸 Demo
Example interaction:

```pgsql
Task Manager
1. Add Task
2. List Tasks
3. Mark Task as Completed
4. Exit
   Choose an option: 1
   Enter task title: Fix a bug
   Enter task description: Debug and resolve issue #42
   Task added successfully!

Choose an option: 2
1. [ ] Fix a bug: Debug and resolve issue #42

Choose an option: 3
Enter task number to mark as completed: 1
Task marked as completed!
```
### 🔮 Future Improvements
Implement a database storage option (PostgreSQL or SQLite)
Add due dates and priorities to tasks
Improve error handling.