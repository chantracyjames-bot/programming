# Topic 3 & 4
- Learning Outcomes
  * Identify the main components of a computer system, including the Central Processing Unit (CPU), memory (RAM), input/output devices, storage devices, and buses.
  * Explain, describe, or identify the function of the computer components in the overall operation of a computer system. 
  * Explain the importance of standards in computing and their role in ensuring interoperability, consistency, and innovation.
  *  Identify key computer organization standards and describe their impact on the development and compatibility of computer systems.
- Topics
  3. Introduction to Computer Components
    + 3.1.Central Processing Unit (CPU)
    + 3.2.Memory (RAM)
    + 3.3.Input and Output Devices
    + 3.4. Storage Devices
    + 3.5.Buses (Data Pathways)
  4. Introduction to Standard Organizations
    + 4.1.Importance of Standards in Computing
    + 4.2.Computer Organization Standards
    + 4.3. Strengths of Standard Organizations
    + 4.4.Weaknesses and Challenges

## Introduction to Computer Components
- Background
  + The foundational components of a computer are essential for understanding its operations and functionalities. This lecture will intoduces key elements that make up a computer system; the Central Processing Unit (CPU), Memory (RAM), Input and Output Devices, Storage Devices, and Buses (Data Pathways).
  + Each componnet is crucial to the computer's ability to process data, store information, and interact with users. 
  + By understanding these components, certain insight will be gained into how computers perform tasks, manage resources, and support various applications.
- Diagram
  ![Components of computer](../../html-css/image_sets/CSP103-3.png)

### Central Processing Unit (CPU)
- Definition:
  * The _CPU_ is often called the "__brain__" of the computer, as it is __responsible for executing instructions, performing calculations, and managing data__ flow within the system.
  * It is a _complex microprocessor_ composed of __millions of transistors__, and it plays a __central role in the functioning__ of the computer.
- It has three main parts:
  1. __Arithmetic Logic Unit__ (_ALU_)
    + Definition: 
      - The _ALU_ is the _CPU_ component that __performs all arithmetic operations__—_Addition, Subtraction, Multiplication, and Division_—and logical operations, such as comparisons like _significant than, less than or equal to_.
      - It is crucial for __processing numerical data__ and __making decisions baed on logic__.
    + Example:
      - When a program requires calculation, such as adding two numbers, the ALU performs the operation and stores the result in a register or memory location for future use.
  2. __Control Uunit__ (CU)
    + Definition:
      - The _CU_ directs the _CPU_'s operarions by __controlling the data flow__ between the __CPU, memory, and input/output devices__.
      - It __fetches instructions__ from memory, __decodes them__ to determine the required actions, and the __executes them__ by the _ALU_ and other components.
    + Example:
      - If a program instructs the computer to read data from memory, the _CU_ fetches the instruction, decodes it to understand that data needs to be read, and the sends signals to the appropriate components for the operation.
  3. __Registers__
    + Definition:
      - _Registers_ are __small, fast storage locations__ within the _CPU_ that __temporarily hold data and instructions__ that are being processed.
      - It plays a vital role in the _CPU_'s ability to __quickly access__ and __manipulate data__, aloowing for efficient execution of instructions.
    + Example:
      - When calculating, the CPU may store intermediate results in registers to speed up the process and reduce the need to access slower memory location
- Diagram:
  ![Block Diagram of First Generation Microprocessors](../../html-css/image_sets/CSP103-4.png)

### Memory
- Definition:
  * __Random Access Memory__ (_RAM_) is the computer's __short-term memory__, used to __store data actively being processed__ by the CPU.
  * _RAM_ is __volatile__, meaning it loses all stored data when the power is turned off.
  * The __speed__ and __capacity__ of _RAM_ directly __influence the computer's performance__, as it determinces how quickly the _CPU_ can access data and how much data can be processed simultaneosuly.
  * When an application is opened, the operating system loads the application's data and code into _RAM_, allowing the _CPU_ to access and execute the necessary instructions quickly.
  * If the RAM is complete (full), the system may slow down, as it has to rely on slower storage devices (swaps or pagefiles) to store overflow data.
- It has two types:
  * __Dynamic Random Access Memory__ (_DRAM_)
    + The __most common type__ of _RAM_, used in most computers and devices.
    + _DRAM_ needs to be __refreshed thousands of times per second__, as it __stores each bit of data in a tiny capacitor__.
  * __Static Random Access Memory__ (_SRAM_)
    + __Faster and more expensive__ than _DRAM_, used for __cache memory, providing high-speed CPU data access__.
  
### Input & Output Devices
- Definition
  * __Input and Output (_I/O_) Devices__ are the __peripherals that allow users to interact__ with the computer, enabling __data input and output__, __to and from the system__.
- __Input Devices__
  * Definition
    + __Converts user actions into data__ that the computer can process.
    + These devices include __keyboards, mice, scanners, microphones, cameras__, etc.
    + They are __essential for entering data, controlling applications, and providing instructions__ to the computer.
  * Example:
    + When typing a document, each keystroke on the keyboard is converted into digital signals that the _CPU_ can process, displaying the corresponding character on the screen.
- __Output Devices__
  * Definition
    + __Converts processed data from the computer into a from that users can understand or interact with__.
    * Typical output devices include __monitors__ for visual display, __printers__ for physical copies of documents, and __speakers__ for audio output.
  * Example:
    + After typing a document, a printer might be used. The _CPU_ sends the processed data to the printer, procuding a physical document copy.
- Diagram:
 ![Input and Ouput Devices Diagram](../../html-css/image_sets/CSP103-5.jpg)
<!-- i hate light mode huhuhu -->

### Storage Devices

- Diagram:
 ![SSDs vs HDDs](../../html-css/image_sets/CSP103-6.png)

### Buses (Data Pathways)

- Diagram:
 ![Data Pathways](../../html-css/image_sets/CSP103-7.png)

## Introduction to Standard Organizations

### Importance of Standards in Computing

### Computer Organization Standards

### Strengths of Standard Organizations

### Weakneses and Challenges