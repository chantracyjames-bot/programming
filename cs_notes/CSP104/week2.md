# Week 2
<!-- AI generated powerpoint presentation? -->
## Course Orientation
### Learning Targets
- __Orientation__
  * Summarize the course contents, requirements, and learning expectations.
- __Compare Paradigms__
  * Distinguish procedural programming from object-oriented programming.
- __Model with objects__
  * Explain objects, attributes, methods, and encapsulation.
- __Reuse and adapt__
  * Discuss inheritence and polymorphism as toold for flexible software design.
- __Prepare to code__
  * Connect concepts to any OOP-capable language used in laboratory work.

### Course Introduction: What is this course all about?
- CSP104 uses object oriented programming to solve computing problems through organized, reusable, and maintainable programs.
- Object-oriented programming is a way of _designing_ __objects__ that contain both __data__ and __behavior__.
  * Lecture: concepts, designs, and examples.
  * Laboratory: hands-on coding and debugging.
  * Outputs: activities, exercises, quizzes, exams and projects.
  * Language: selected OOP language depending on class implementation.
- What makes a program easier to understand, modify, and reuse?
  > Commenting is one of the most important aspects in programming, enabling others to understand your code through your comments.
```
    // this is a comment in C-style languages.
```

### Topic Roadmap
- A smooth slow from course orientation to the main OOP principles.
```
1. Course Introduction
2. Procedural Programming
3. Object-Oriented Programming
4. Object, Classes and Encapsulation
5. Inheritance and Polymorphism
```
- Core Question: How do we design programs that behave like organized code systems instead of long lists of instructions?
> The main point of OOP is to modularize codebases, preventing them from getting too long and making debugging difficult due to the thousands of lines of code. OOP solves this by having other parts of code (or classes) be in separate files instead of one long file.

### Why Programming Paradigms Matter
- A paradigm is a way of thinking about how a program should be organized.
```
Problem -> Design -> Code -> Maintain -> Improve
```
- _Procedural Programming_ focuses on __steps and procedures__, mostly flows in one direction.
- _Object-Oriented Programming_ focuses on __objects and interactions__.
> Both can solve problems, but the are implemented in varying different ways and they organize solutions differently from one another.

## Procedural Programming
- Programs are structured as a __sequence of precedures__ of _functions_ that operate on data.
```
// pseudo code
START
    input studentName
    input grades
    average = computeAverage(grades)
    result = checkPassFail(average)
    display studentName, average, result
END
```
### Procedural Focus
- __Procedures__, __functions__, and __step-by-step instructions__
  * Data and procedures are often separate
  * Good for small, direct, and linear tasks
  * Can become harder to maintain as systems grow

### Procedural Thinking
> Do This, Then That.
- A procedure-centered program follows a clear instruction flow.
```
    Input -> Process -> Decide -> Output
```
- Strength: 
  * Easy to follow.
  * Easier for beginners.
  * Simple to understand for step-by-step tasks.
  * Direct control over program flow.
- Risk: 
  * Related data and operations may become scattered across many functions.
  * Data and functions may become separated.
  * Large systems can become harder to update, reuse, or debug.

## Object-Oriented Programming
- Programs are modeled as _objects_ that __combine__ both __data__ (_attributes_) and __behavior__ (_methods_).
```
Object = Data + Behavior
```
- __Data__ describes the __object's state__.
- __Behavior__ describes __what the object can do__.
- __Objects__ communicate by calling _methods_ or sending messages.
- The program becomes a _collection_ of __cooperating parts__.

### Procedural vs Object-Oriented Programming
> Same problem, different organization and implementation.
- Procedural
  * Organized around functions
  * Data is passed to procedures
  * Flow is usually sequential
  * Best for direct tasks
- Object-Oriented
  * Organized around objects
  * Data and behavior belong together
  * Objects interact with each other
  * Best for modular systems
> OOP helps manage complexity by grouping related data and actions in objects.

### Objects: The Basic Building Blocks
- An object represents a meaningful thing in the problem domain.
```
// example
Student -> Teacher -> Course -> Grade -> Report
```
- Object has identity
  * It can be distinguished from other objects, even if they have similar values.
- Object has state
  * It stores data or attributes, such as name, grade, or balance.
- Object has behavior
  * It performs actions through methods, such as compute, display, or update.

### Classes: Blueprints for Objects
- A class defines the structure and behavior that its objects will have
```
Class = blueprint
Object = actual instance
```