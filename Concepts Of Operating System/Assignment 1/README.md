# Name: Soham Ghosh
# Form No: 241204774
***Formatted Using ChatGPT***

# Concepts of Operating System - Assignment 1

## Problem 1

### a) Navigate and List:
#### Question:
Start by navigating to your home directory and list its contents. Then, move into a directory named "LinuxAssignment" if it exists; otherwise, create it.

#### Command:
```bash
cd ~
ls

if [ -d LinuxAssignment ]; then
  cd LinuxAssignment
else
  mkdir LinuxAssignment
fi
```
#### Output Example:
```
Desktop  Documents  Downloads  LinuxAssignment  Pictures  Videos
```

---

### b) File Management:
#### Question:
Inside the "LinuxAssignment" directory, create a new file named "file1.txt". Display its contents.

#### Command:
```bash
cd LinuxAssignment
touch file1.txt
cat file1.txt
```
#### Output Example:
```
(No output since file1.txt is empty)
```

---

### c) Directory Management:
#### Question:
Create a new directory named "docs" inside the "LinuxAssignment" directory.

#### Command:
```bash
mkdir docs
```
#### Output Example:
```
(No output on successful execution)
```

---

### d) Copy and Move Files:
#### Question:
Copy the "file1.txt" file into the "docs" directory and rename it to "file2.txt".

#### Command:
```bash
cp file1.txt docs/file2.txt
```
#### Output Example:
```
(No output on successful execution)
```

---

### e) Permissions and Ownership:
#### Question:
Change the permissions of "file2.txt" to allow read, write, and execute permissions for the owner and only read permissions for others. Then, change the owner of "file2.txt" to the current user.

#### Checking Permissions:
```bash
ls -l docs/file2.txt
```
#### Output Example:
```
-rw-r--r-- 1 user user 0 Feb 27 19:57 file2.txt
```
#### Changing Permissions:
```bash
chmod 744 docs/file2.txt
```
#### Output Example:
```
-rwxr--r-- 1 user user 0 Feb 27 19:57 file2.txt
```
#### Changing Ownership:
```bash
sudo chown $USER docs/file2.txt
```

---

### f) Final Checklist:
#### Question:
Finally, list the contents of the "LinuxAssignment" directory and the root directory to ensure that all operations were performed correctly.

#### Command:
```bash
ls LinuxAssignment
ls /
```
#### Output Example:
```
docs  file1.txt
bin  boot  dev  etc  home  lib  mnt  proc  root  sys  tmp  usr  var
```

---

### g) File Searching:
#### Question:
Search for all files with the extension ".txt" in the current directory and its subdirectories. Then, display lines containing a specific word in a file.

#### Command:
```bash
find . -type f -name "*.txt"
```
#### Output Example:
```
./LinuxAssignment/docs/file2.txt
./LinuxAssignment/file1.txt
```
#### Searching for a Word:
```bash
grep "Hello" file1.txt
```
#### Output Example:
```
Hello
Hello World
```

---

### h) System Information:
#### Question:
Display the current system date and time.

#### Command:
```bash
date
```
#### Output Example:
```
Tue Feb 27 20:00:00 UTC 2025
```

---

### i) Networking:
#### Question:
Display the IP address of the system. Then, ping a remote server to check connectivity.

#### Command:
```bash
ip addr show
ping google.com
```
#### Output Example:
```
192.168.1.100/24
64 bytes from 142.250.190.78: icmp_seq=1 ttl=118 time=20 ms
```

---

### j) File Compression:
#### Question:
Compress the "docs" directory into a zip file and extract the contents into a new directory.

#### Command:
```bash
zip -r docs.zip docs
unzip docs.zip -d docs2
```

---

### k) File Editing:
#### Question:
Open the "file1.txt" file in a text editor and add some text to it. Then, replace a specific word in "file1.txt" with another word.

#### Command:
```bash
nano file1.txt
sed -i 's/Hello/Hi/g' file1.txt
```

---

## Problem 2

### a) Display First 10 Lines:
#### Question:
Suppose you have a file named "data.txt" containing important information. Display the first 10 lines of this file to quickly glance at its contents.

#### Command:
```bash
head -n 10 data.txt
```
#### Output Example:
```
Line 1
Line 2
...
Line 10
```

---

### b) Display Last 5 Lines:
#### Question:
To check the end of the file for any recent additions, display the last 5 lines of "data.txt".

#### Command:
```bash
tail -n 5 data.txt
```
#### Output Example:
```
Line 96
Line 97
...
Line 100
```

---

### c) Display First 15 Lines of numbers.txt:
#### Question:
In a file named "numbers.txt," there are a series of numbers. Display the first 15 lines of this file to analyze the initial dataset.

#### Command:
```bash
head -n 15 numbers.txt
```
#### Output Example:
```
1
2
...
15
```

---

### d) Display Last 3 Lines of numbers.txt:
#### Question:
To focus on the last few numbers of the dataset, display the last 3 lines of "numbers.txt".

#### Command:
```bash
tail -n 3 numbers.txt
```
#### Output Example:
```
98
99
100
```

---

### e) Convert Lowercase to Uppercase in input.txt:
#### Question:
Imagine you have a file named "input.txt" with text content. Use a command to translate all lowercase letters to uppercase and save the modified text in a new file named "output.txt".

#### Command:
```bash
tr '[:lower:]' '[:upper:]' < input.txt > output.txt
```
#### Output Example:
```
HELLO WORLD
```

---

### f) Remove Duplicate Lines from duplicate.txt:
#### Question:
In a file named "duplicate.txt," there are several lines of text, some of which are duplicates. Use a command to display only the unique lines.

#### Command:
```bash
uniq duplicate.txt
```
#### Output Example:
```
Hello
World
Linux
```

---

### g) Count Unique Items in fruit.txt:
#### Question:
In a file named "fruit.txt," there is a list of fruits, but some fruits are repeated. Use a command to display each unique fruit along with the count of its occurrences.

#### Command:
```bash
sort fruit.txt | uniq -c
```
#### Output Example:
```
  2 Apple
  3 Banana
  1 Mango
```

