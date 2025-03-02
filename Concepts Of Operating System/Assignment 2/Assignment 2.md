# Name: Soham Ghosh
# Form No: 241204774
***Formatted Using ChatGPT***

# Assignment 2
---

## Part A: What will the following commands do?

### 1. **echo "Hello, World!"**  
Prints "Hello, World!" to the terminal.  
**Output:**  
`Hello, World!`

### 2. **name="Productive"**  
Stores the string "Productive" in a variable named `name`.  
**Output:**  
No output.

### 3. **touch file.txt**  
Creates an empty file named `file.txt`.  
**Output:**  
No output.

### 4. **ls -a**  
Displays all files in the current directory, including hidden ones (those starting with a dot `.`).  
**Output:**  
Example output:  
```
.  ..  .hidden_file  file.txt  mydir
```

### 5. **rm file.txt**  
Removes `file.txt` permanently.  
**Output:**  
No output.

### 6. **cp file1.txt file2.txt**  
Copies `file1.txt` to `file2.txt`.  
**Output:**  
No output. 

### 7. **mv file.txt /path/to/directory/**  
Moves `file.txt` to `/path/to/directory/`.  
**Output:**  
No output. 

### 8. **chmod 755 script.sh**  
Grants the owner full access and others read and execute permissions.  
**Output:**  
No output. The file `script.sh` is given permissions:  
- Owner: read, write, execute (`7`)  
- Group: read, execute (`5`)  
- Others: read, execute (`5`).

### 9. **grep "pattern" file.txt**  
Finds lines containing "pattern" in `file.txt`.  
**Output:**  
Displays all lines in `file.txt` that contain the word "pattern".  
Example output:  
```
This line contains beautiful pattern.
```

### 10. **kill PID**  
Terminates a process with the given Process ID (PID).  
**Output:**  
No output. 

### 11. **mkdir mydir && cd mydir && touch file.txt && echo "Hello, World!" > file.txt && cat file.txt**  
Creates `mydir`, navigates into it, creates `file.txt`, writes "Hello, World!" to it, and displays its content.  
**Output:**  
```
Hello, World!
```

### 12. **ls -l | grep ".txt"**  
Displays details of files ending with `.txt`.  
**Output:**  
Example output:  
```
-rw-r--r-- 1 user group 12 Oct 10 10:00 file1.txt
-rw-r--r-- 1 user group 15 Oct 10 10:01 file2.txt
```

### 13. **cat file1.txt file2.txt | sort | uniq**  
Combines `file1.txt` and `file2.txt`, sorts them, and removes duplicate lines.  
**Output:**  
Example output:  
```
apple
banana
cherry
```

### 14. **ls -l | grep "^d"**  
Filters `ls -l` output to show only directories.  
**Output:**  
Example output:  
```
drwxr-xr-x 2 user group 4096 Oct 10 10:00 mydir
```

### 15. **grep -r "pattern" /path/to/directory/**  
Searches recursively for the word "pattern" in all files under `/path/to/directory/`.    
**Output:**  
Example output:  
```
/path/to/directory/file1.txt:This line contains the pattern.
/path/to/directory/subdir/file2.txt:Another pattern here.
```

### 16. **cat file1.txt file2.txt | sort | uniq -d**  
Displays only duplicate lines from `file1.txt` and `file2.txt`.  
**Output:**  
Example output:  
```
apple
```

### 17. **chmod 644 file.txt**  
Sets `file.txt` permissions so the owner can read/write, while others can only read.  
**Output:**  
No output. The file `file.txt` is given permissions:  
- Owner: read, write (`6`)  
- Group: read (`4`)  
- Others: read (`4`).

### 18. **cp -r source_directory destination_directory**  
Copies `source_directory` and all its contents to `destination_directory`.  
**Output:**  
No output.

### 19. **find /path/to/search -name "*.txt"**  
Searches for all `.txt` files inside `/path/to/search`.  
**Output:**  
Example output:  
```
/path/to/search/file1.txt
/path/to/search/subdir/file2.txt
```

### 20. **chmod u+x file.txt**  
Grants execution permission to the owner of `file.txt`.  
**Output:**  
No output.

### 21. **echo $PATH**  
Displays the directories in the `PATH` environment variable.  
**Output:**  
Example output:  
```
/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin
```

Here’s the updated version for **Part B** with the correct answers:

---

## Part B: Identify True or False:

1. **ls is used to list files and directories in a directory.**  
   **Answer:** True  

2. **mv is used to move files and directories.**  
   **Answer:** True  

3. **cd is used to copy files and directories.**  
   **Answer:** False  
   **Correction:** `cd` is used to change the current directory, not to copy files and directories.  

4. **pwd stands for "print working directory" and displays the current directory.**  
   **Answer:** True  

5. **grep is used to search for patterns in files.**  
   **Answer:** True  

6. **chmod 755 file.txt gives read, write, and execute permissions to the owner, and read and execute permissions to group and others.**  
   **Answer:** True  

7. **mkdir -p directory1/directory2 creates nested directories, creating directory2 inside directory1 if directory1 does not exist.**  
   **Answer:** True  

8. **rm -rf file.txt deletes a file forcefully without confirmation.**  
   **Answer:** False  
   **Correction:** `rm -rf file.txt` is used to forcefully delete a directory and its contents. For a single file, `rm -f file.txt` is sufficient.  

## Identify the Incorrect Commands:

1. **chmodx is used to change file permissions.**  
   **Correction:** `chmod`  

2. **cpy is used to copy files and directories.**   
   **Correction:** `cp` 

3. **mkfile is used to create a new file.**  
   **Correction:** `touch` 

4. **catx is used to concatenate files.**  
   **Correction:** `cat` 

5. **rn is used to rename files.**  
   **Correction:** `mv` 
Here are the solutions to **Part C**:

---

## Part C: Shell Scripting Questions

### **Question 1:** Write a shell script that prints "Hello, World!" to the terminal.  
**Answer:**  
```bash
#!/bin/bash
echo "Hello, World!"
```

---

### **Question 2:** Declare a variable named "name" and assign the value "CDAC Mumbai" to it. Print the value of the variable.  
**Answer:**  
```bash
#!/bin/bash
name="CDAC Mumbai"
echo $name
```

---

### **Question 3:** Write a shell script that takes a number as input from the user and prints it.  
**Answer:**  
```bash
#!/bin/bash
echo "Enter a number:"
read number
echo "You entered: $number"
```

---

### **Question 4:** Write a shell script that performs addition of two numbers (e.g., 5 and 3) and prints the result.  
**Answer:**  
```bash
#!/bin/bash
num1=5
num2=3
sum=$((num1 + num2))
echo "The sum is: $sum"
```

---

### **Question 5:** Write a shell script that takes a number as input and prints "Even" if it is even, otherwise prints "Odd".  
**Answer:**  
```bash
#!/bin/bash
echo "Enter a number:"
read number
if [ $((number % 2)) -eq 0 ]; then
    echo "Even"
else
    echo "Odd"
fi
```

---

### **Question 6:** Write a shell script that uses a for loop to print numbers from 1 to 5.  
**Answer:**  
```bash
#!/bin/bash
for i in {1..5}
do
    echo $i
done
```

---

### **Question 7:** Write a shell script that uses a while loop to print numbers from 1 to 5.  
**Answer:**  
```bash
#!/bin/bash
i=1
while [ $i -le 5 ]
do
    echo $i
    i=$((i + 1))
done
```

---

### **Question 8:** Write a shell script that checks if a file named "file.txt" exists in the current directory. If it does, print "File exists", otherwise, print "File does not exist".  
**Answer:**  
```bash
#!/bin/bash
if [ -f "file.txt" ]; then
    echo "File exists"
else
    echo "File does not exist"
fi
```

---

### **Question 9:** Write a shell script that uses the if statement to check if a number is greater than 10 and prints a message accordingly.  
**Answer:**  
```bash
#!/bin/bash
echo "Enter a number:"
read number
if [ $number -gt 10 ]; then
    echo "The number is greater than 10"
else
    echo "The number is not greater than 10"
fi
```

---

### **Question 10:** Write a shell script that uses nested for loops to print a multiplication table for numbers from 1 to 5. The output should be formatted nicely, with each row representing a number and each column representing the multiplication result for that number.  
**Answer:**  
```bash
#!/bin/bash
for i in {1..5}
do
    for j in {1..10}
    do
        echo -n "$((i * j)) "
    done
    echo ""
done
```

---

### **Question 11:** Write a shell script that uses a while loop to read numbers from the user until the user enters a negative number. For each positive number entered, print its square. Use the break statement to exit the loop when a negative number is entered.  
**Answer:**  
```bash
#!/bin/bash
while true
do
    echo "Enter a number (negative to exit):"
    read number
    if [ $number -lt 0 ]; then
        break
    fi
    square=$((number * number))
    echo "Square of $number is: $square"
done
```

---

## Part E: Scheduling and Process Management

---

### **Question 1:**  
Consider the following processes with arrival times and burst times:  

| Process | Arrival Time | Burst Time |  
|---------|--------------|------------|  
| P1      | 0            | 5          |  
| P2      | 1            | 3          |  
| P3      | 2            | 6          |  

Calculate the average waiting time using **First-Come, First-Served (FCFS)** scheduling.  

**Answer:**  

1. **Gantt Chart:**  
   ```
   P1 (0–5) → P2 (5–8) → P3 (8–14)
   ```

2. **Waiting Time Calculation:**  
   - Waiting time for P1 = 0  
   - Waiting time for P2 = 5 - 1 = 4  
   - Waiting time for P3 = 8 - 2 = 6  

3. **Average Waiting Time:**  
   ```
   Average Waiting Time = (0 + 4 + 6) / 3 = 10 / 3 = 3.33
   ```

---

### **Question 2:**  
Consider the following processes with arrival times and burst times:  

| Process | Arrival Time | Burst Time |  
|---------|--------------|------------|  
| P1      | 0            | 3          |  
| P2      | 1            | 5          |  
| P3      | 2            | 1          |  
| P4      | 3            | 4          |  

Calculate the average turnaround time using **Shortest Job First (SJF)** scheduling.  

**Answer:**  

1. **Gantt Chart:**  
   ```
   P1 (0–3) → P3 (3–4) → P4 (4–8) → P2 (8–13)
   ```

2. **Turnaround Time Calculation:**  
   - Turnaround time for P1 = 3 - 0 = 3  
   - Turnaround time for P3 = 4 - 2 = 2  
   - Turnaround time for P4 = 8 - 3 = 5  
   - Turnaround time for P2 = 13 - 1 = 12  

3. **Average Turnaround Time:**  
   ```
   Average Turnaround Time = (3 + 2 + 5 + 12) / 4 = 22 / 4 = 5.5
   ```

---

### **Question 3:**  
Consider the following processes with arrival times, burst times, and priorities (lower number indicates higher priority):  

| Process | Arrival Time | Burst Time | Priority |  
|---------|--------------|------------|----------|  
| P1      | 0            | 6          | 3        |  
| P2      | 1            | 4          | 1        |  
| P3      | 2            | 7          | 4        |  
| P4      | 3            | 2          | 2        |  

Calculate the average waiting time using **Priority Scheduling**.  

**Answer:**  

1. **Gantt Chart:**  
   ```
   P1 (0–1) → P2 (1–5) → P4 (5–7) → P1 (7–13) → P3 (13–20)
   ```

2. **Waiting Time Calculation:**  
   - Waiting time for P1 = 7 - 1 = 6  
   - Waiting time for P2 = 0  
   - Waiting time for P4 = 5 - 3 = 2  
   - Waiting time for P3 = 13 - 2 = 11  

3. **Average Waiting Time:**  
   ```
   Average Waiting Time = (6 + 0 + 2 + 11) / 4 = 19 / 4 = 4.75
   ```

---

### **Question 4:**  
Consider the following processes with arrival times and burst times, and the time quantum for Round Robin scheduling is 2 units:  

| Process | Arrival Time | Burst Time |  
|---------|--------------|------------|  
| P1      | 0            | 4          |  
| P2      | 1            | 5          |  
| P3      | 2            | 2          |  
| P4      | 3            | 3          |  

Calculate the average turnaround time using **Round Robin** scheduling.  

**Answer:**  

1. **Gantt Chart:**  
   ```
   P1 (0–2) → P2 (2–4) → P3 (4–6) → P4 (6–8) → P1 (8–10) → P2 (10–12) → P4 (12–13)
   ```

2. **Turnaround Time Calculation:**  
   - Turnaround time for P1 = 10 - 0 = 10  
   - Turnaround time for P2 = 12 - 1 = 11  
   - Turnaround time for P3 = 6 - 2 = 4  
   - Turnaround time for P4 = 13 - 3 = 10  

3. **Average Turnaround Time:**  
   ```
   Average Turnaround Time = (10 + 11 + 4 + 10) / 4 = 35 / 4 = 8.75
   ```

---

### **Question 5:**  
Consider a program that uses the `fork()` system call to create a child process. Initially, the parent process has a variable `x` with a value of 5. After forking, both the parent and child processes increment the value of `x` by 1.  

What will be the final values of `x` in the parent and child processes after the `fork()` call?  

**Answer:**  

1. **Parent Process:**  
   - Initial value of `x` = 5  
   - After increment: `x = 6`  

2. **Child Process:**  
   - Initial value of `x` = 5 (copied from parent)  
   - After increment: `x = 6`  

**Final Values:**  
- Parent process: `x = 6`  
- Child process: `x = 6`  

---
