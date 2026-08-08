# Week 2
## Target
- Learning Outcomes
  * Define computer
  * Define the scope of computer organization and explain its role in the functionality of computer
systems.
  * Define the scope of computer architecture and describe its impact on system design and performance. 
  * Identify common goals shared by computer organization and computer architecture and explain their interdependence.
  * Contrast computer organization and computer architecture by highlighting their differences in terms of system functionality, design, and
performance. 
- Topics
  1. Introduction to Computer Organization and Computer Architecture
    * 1.1. What is Computer, its features, advantages, disadvantages?
    * 1.2. Scope of Computer Organization
    * 1.3. Scope of Computer Architecture
    * 1.4.Common Goals and Interdependence
    * 1.5.Contrast Between Computer Organization 

## What is a Computer?
- Definition
  * A computer is an _electronic device_ that can __process and store information__.
  * It can __perform calculations__, __manipulate data__, and __execute instructions__ to __accomplish specific tasks__.
  * The basic components of a computer includes:
    + Processors — e.g. Central Processing Unit (_CPU_) 
    + Memory — e.g. Random Access Memory (_RAM_),
    + Storage — e.g. Hard Disk Drives or Solid-state Drives (_HDDs_ or _SSDs_), 
    + Input Devices — e.g. _Keyboard_, _Mouse_, etc.
    + Output Devices — e.g. _Monitor_, _Printer_, etc.; and 
    + Various Peripheral Devices — such as _USB drives_ or _external hard drives_.
  + __Computers do not have a brain__ like human beings.
    + __They have to be given instructions__ on what to do when a particular problem-situation arises
    + __They have to be told everything__, from:
      - _What to expect for data, what type of data_?
      - _How to process it,  How to perform calculations (operations)_? and
      - _Where to store the data_?
    + Humans, understand that language is composed of words which are composed of letters. But, __computers don't understand our language__ nor the words like “hello, good morning, discipline, etc.”.
  * __Computers only understand binary language__ whose vocabulary contains only two letters or states or symbols.
    + i.e. _0 and 1_, _True and False_, _On and Off_.
    + To maintain the states, __transistors are used__ — which are tiny device that are used to __store 2 values__, either a __1 and 0__ or __on and off__.
    + If the transistor is __turned on__, it has a __value of 1__. If it is __turned off__, it has a __value of 0__.
    + e.g. A memory chip contains hundreds of millions or even billions of transistors, each of which can be switched on or off individually. As transistors can store 2 distinct values, we can have millions of different values stored on a memory chip, consisting entirely of 0’s and 1’s.
    + When a very little amount of electric current passes through transistor, it maintains the state of 1. And when there is no electric current, then the transistor has the state of 0.
    + This 0’s and 1’s forms the __building blocks of computers__. With the combinations of 0 and 1 we create a whole new language. For example, 0 can be written as 0.
      - e.g.
        * 1 as 1
        * 2 as 10
        * 3 as 11
        * 4 as 100
        * 5 as 101
        * a as 01100001
        * A as 01000001
  * We, humans, can do everything that we desire and this code can be remembered very easily but we don’t have to remember. We just have to use our language and the software converts our normal letters into the binary language.
    + _Software_ is __a set of instructions__ that tells the computer _what to do, when to do, and how to do_.
    + e.g. Suppose we want to add 2 numbers and want to know what 2 + 2 is. We must give the computer instructions.
    ```
      Step 1: Take the value of 2
      Step 2: Store that value of 2
      Step 3: Add the stored value to 2 by using the addition operator +
      Step 4: Save the answer
    ```
    + Separate instructions are provided for the addition operator + so the computer knows how to do addition when it encounters + sign.
    + A software called the _Interpreter_ interprets our language code into binary code, converting our code into machine language that can be understood by computer.
    > Addition Information: Interpreters do not convert code directly into machine-readable langauge. It converts source code into an Intermediate Language, e.g. bytecode or an Abstract Syntax Tree (AST).
    + When we give input through hardware like keyboard, mouse, scanner, the software interprets it into machine language and then it is processed and our output is shown.
    + Process:
      - If we want to display letter ‘A’ on screen:
      ```
        Step 1: We first open notepad.
        Step 2: Then we will press Capslock or Shift key to make letter uppercase
        Step 3: After that we will press letter ‘a’.
        Step 4: And our screen will show the letter ‘A’.
      ```
    + Under the hood process: When we pressed the capslock or shift key, the software tells that whatever following this keypress should be printed on the screen and after we have pressed the letter a which is small letter, the software first converts it into binary like it had converted the shift or capslock key andthen after the computer understands it prints A on the screen.
- __Features of a Computer__
  * __Processor__:
    + It the __brain of the computer__, carrying out all the __instructions and calculations__ required by the system.
  * __Memory__:
    + The memory, Random Access memory (_RAM_), __stores data temporarily__ for the processor to __access quickly__.
  * __Storage__:
    + Storage devices provide __longterm storage for data and files__.
    + e.g. HDDs, SSDs, external drives
  * __Input devices__:
    + Enable the user to __provide data and instructions to the computer__.
    + e.g. keyboards, mice, scanners, and cameras 
  * __Output devices__:
    + __Displays the results__ of the computer’s processing.
    + e.g. monitors, printers, and speakers 
  * __Operating System__:
    + __Manages the computer__'s resources, controls the hardware, and runs application programs.
  * __Networking__:
    + __Allow computers to communicate and share resources__ with other computers and devices.
  * __Software__:
    + Is the set of instructions that __tell the computer what to do__, and it can range from simple applications to complex programs.
  * __Graphics and Sound__: 
    + Enables the computer to display and manipulate images, and play sounds and videos.
  * __Connectivity__:
    + Features like USB, Wi-Fi, Bluetooth, and Ethernet enable the computer to connect to other devices and the internet.
- __Advantages of Computers__
  * __Increased Efficiency and Productivity__: 
    + Computers can __perform tasks much faster and more accurately__ than humans, allowing for __increased efficiency and productivity__ in various industries.
  * __Storage and Organization of Information__: 
    + __Computers can store large amounts of data and organize__ it in a way that __is easily accessible and searchable__.
  * __Improved Communication__: 
    + Computers __enable people to communicate easily and instantly__ with others, __regardless of their location__.
  * __Access to Information and Resources__: 
    + The internet provides __access to a vast amount of information and resources__ that would otherwise be difficult or impossible to obtain.
  * __Automation of Repetitive Tasks__: 
    + Computers __can automate repetitive and mundane tasks__, __freeing up time and resources__ for more important work.
- __Disadvantages of Computers__
  * __Dependence on technology__: 
    + Over-reliance on computers __can lead to problems if they break down or malfunction__, leading to loss of productivity and data.
  * __Security risks__: 
    + Computers can be __vulnerable to viruses, malware, and hacking__, leading to data breaches and other security risks.
  * __Social isolation__: 
    + The overuse of computers __can lead to social isolation and reduced face-to-face interaction__, leading to social and emotional problems.
  * __Environmental impact__: 
    + The production and disposal of computers __can have a negative impact on the environment__ due to the use of resources and the creation of electronic waste.
  * __Job displacement__: 
    + Automation and the use of computers __can lead to job displacement in certain industries__, requiring workers to adapt to new skill sets or find new employment.