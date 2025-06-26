# This is my Readmefile

---

## ✅ Summary: Interpreter vs Compiler

| Feature     | Interpreter         | Compiler                |
|-------------|---------------------|--------------------------|
| Execution   | Line-by-line        | Entire code at once     |
| Speed       | Slower              | Faster (after compilation) |
| Errors      | Stops at first error| Shows all errors after compiling |
| Output      | No separate file    | Generates an executable file |
| Examples    | Python, JavaScript  | C, C++, Java             |


 
- Interpreter + JIT in JVM to execute bytecode.



💡 **Java uses both**:  
- Compiler (`javac`) to convert `.java` to bytecode.  
- Interpreter + JIT in JVM to execute bytecode.

✅ Main Functions of JVM:
🔧 Function	📄 Description
1. Class Loader	Loads .class files (bytecode) into memory. It handles loading, linking, and initialization of classes.
2. Bytecode Verifier	Ensures the code follows JVM rules and doesn’t do anything unsafe (security + integrity check).
3. Interpreter / Execution Engine	Reads bytecode and executes it line by line, or passes it to the JIT compiler for faster execution.
4. JIT Compiler (Just-In-Time)	Converts bytecode into native machine code for better performance at runtime.
5. Memory Management	Allocates and deallocates memory for objects and variables automatically.
6. Garbage Collection	Frees up memory by deleting objects no longer in use.
7. Exception Handling	Provides a structured way to handle errors during program execution.
8. Security Management	Applies security policies to control file access, network access, etc.


---


---

 Git & GitHub Workflow Summary (June 23, 2025)

### 📁 Repository Setup
- Created a local folder `bridgelab`
- Initialized it with `git init`
- Created files using `touch` (like `README.md`, `notes.txt`)
- Connected local repo to remote GitHub repo using:
  ```bash
 




