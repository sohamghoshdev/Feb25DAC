
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

---
