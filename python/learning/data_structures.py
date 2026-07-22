# data structures
#   - are ways to store and organize data
#       - resulting in various levels of efficiency depending on use
#   - an example of data structures are Python's colections
#       - like list arrays
#       - refer to collections.py for more info
#
#   - Python lists
#       - lists are defined by square brackets [ ]
#       - syntax:
#           <list_name> = [<values>]
#       - example:
#           my_list = [1, 2, 3, 4]
#       - list methods
#           - there are various built-in methods that are used for operations
#           - like .append() or .sort()
#           - refer to functions.py for more info
#
#   - Stacks
#       - a stack is a linear structure that follows the LIFO principle
#           - being the Last-In-First-Out
#               - the last value added will the first value to be removed
#       - stacks are data structures that can hold many variables
#       - the basic operations that a stack can do is:
#           - push
#               - add elements to the stack (like appending)
#           - pop
#               - removes and returns the top element from the stack
#           - peek
#               - returns the top (logically last) element on the stack
#           - is empty
#               - queries if the stack is empty
#           - size
#               - queries the current size of the stack
#       - stacks in Python are usually implemented using lists or linked lists
#           - which can also be implemented to have undo mechanisms
#               - like reverting to previous states
#           - create algorithms for depth_first search or for backtracing
#
#       - stacks using lists
#           - why stacks using lists or arrays?
#               - memory efficiency
#                   - arrays do not hold the next elements' address
#                   - unlike linked lists with nodes do
#               - implementation
#                   - stacks using arrays requires less code as oppsed to linked lists
#                   - as it is easier to use lists than linked lists
#           - stack implemementation using Python's lists:
#               #> start with an empty stack
#               stack = []
#           
#               #> push elements to the end of the stack
#               stack.append('A')
#               stack.append('B')
#               stack.append('C')
#
#               #> peek at the last element on the stack
#               stack[-1]
#           
#               #> pops the element at the top of the stack
#               stack.pop
#
#               #> checks is the stack is empty
#               not bool(stack) #> empty elements return a false
#           
#               #> checks the size of the stack
#               len(stack)
#           - it is recommended to create a dedicated stack class
#               - such that the methods are a bit more straight forward
#           - sample code:
#               class Stack:
#                   #> creates an empty stack
#                   def __init__(self) -> None:
#                       self.stack = []
#
#                   #> method to check if the stack is empty
#                   def is_empty(self) -> bool:
#                       if len(self.stack):
#                           return False
#                       return True
#
#                   #> method to push elements to the end of the stack
#                   def push(self, value) -> None:
#                       self.stack.append(value)
#   
#                   #> method to pop elements from the end of the stack and return it
#                   def pop(self) -> int | None:
#                       #> checks if the stack is empty
#                       if self.is_empty():
#                           print("stack is empty")
#                           return None
#                       return self.stack.pop()
#           
#                   #> method to return the element at the top of the stack
#                   def peek(self) -> int | None:
#                       #> checks if the stack is empty
#                       if self.is_empty():
#                           print("stack is empty")
#                           return None
#                       return self.stack[-1]
#
#                   #> method to return the size of the stack
#                   def size(self) -> int:
#                       return len(self.stack)
#
#       - stacks using linked lists
#           - why stacks using linked lists?
#               - unlike normal lists
#                   - linked lists are able to be stored where there is free space in memory
#                   - where linked lists do not have to be stored contiguously in memory
#               - unlike lists when an element is removed (popped)
#                   - the rest of the nodes in the linked list do not have to be shifted
#           - sidenote:
#               - even though linked lists are better when dealing with a scattered memory space
#                   - this type of list will use more memory space due to having to also store the node addresses
#               - the code is also more complex
#                   - making it a bit hard to understand or interpret
#           - stack implementation using Python's linked lists:
#               #> handles the node logic
#               class Node:
#                   def __init__(self, value) -> None:
#                       self.value = value                      #> takes in the value provided
#                       self.next = None                        #> presumably the next node address(?)
#
#               #> handles the linked stack logic
#               class Stack:
#                   #> creates an empty stack
#                   def __init__(self) -> None:
#                       self.head = None                        #> is the pointer to the first node
#                       self.size = 0                           #> represents the size of the list
#  
#                   #> method to check if the linked list is empty
#                   def is_empty(self) -> bool:
#                       return self.sze == 0                    #> returns True if the stack is empty
#
#                   #> method to push new values to the stack
#                   def push(self, value) -> None:
#                       new_node = None(value)                  #> creates a new node for the new value
#                       if self.head:                           #> runs if the head is not empty
#                           new_node.next = self.head           #> gives the current head to the new node (value head)
#                       self.head = new_node                    #> gives the new node object to the head of the list
#                       self.size += 1                          #> increases the size by 1
#
#                   #> method to pop values from the stack
#                   def pop(self) -> int | None:
#                       if is_empty:                            #> checks if the stack is empty
#                           print("stack is empty")
#                           return None                         #> returns if True
#                       popped node = self.head                 #> popped_head gets the self.head object
#                       self.head = self.head.next              #> the new head beomes the .next attrubute
#                                                                   #> or the pointer to the next item in the stack
#                                                                   #> from the top down
#                       self.size -= 1                          #> decreases the size by 1
#                       return popped_node.value                #> returns the value that the removed node holds
#
#                   #> method to look at the latest value in the stack
#                   def peek(self) -> int | None
#                       if is_empty:                            #> checks if the stack is empty
#                           print("stack is empty")
#                           return None                         #> returns if True
#                       return self.head.value                  #> returns the current value at the top of the stack
#
#                   #> method to return the current size of the stack
#                   def size(self) -> int:
#                       return self.size                        #> returns the current size
#
#                   #> method to print the nodes in order
#                   def traverse(self) -> None:
#                       current_node = self.head                #> current_node gets a copy of self.head
#                       while current_node:                     #> loops current_node until it results to None
#                                                                   #> whcih is the beginning of the stack
#                           print(current_node.value, end="- ") #> prints the value of the current node it is at
#                           current_node = current_node.next    #> changes the pointer to the next value in the stack
#                       print()                                 #> adds a new line
#
#   - Queues
#       - this is concept follows the FIFO principle
#           - FIrst-In-First-Out
#               - the first element in would be the first element to be removed
#           - the exact opposite of the LIFO principle
#       - the basic operations that a queue can do it:
#           - enqueue
#               - adds an element to the end of the queue
#           - dequeue
#               - removes the first element on the queue
#           - peek
#               - returns the first element on the queue
#           - is_empty
#               - returns a boolean if queue is empty
#           - size
#               - returns an integer corresponding to the current size of the queue
#       - queue in Python are usually implemented using lists or linked lists
#           - being used for scheduling, order processing, or message queing
#           - or even be used for algorithms like breadth search in graphs
#
#       - queue using lists
#           - queues implementation in Python's list
#               #> start with an empty queue
#               queue = []
#
#               #> enqueue items in the queue
#               queue.append('A')
#               queue.append('B')
#               queue.append('C')
#
#               #> peek at the first item in the queue
#               queue[0]
#
#               #> dequeue items from the queue
#               queue.pop(0)
#
#               #> checks if the queue is empty
#               not bool(queue)
#
#               #> queries the size of the queue
#               len(queue)
#           - sidenote:
#               - unlike stacks, dequeuing items from a queue is generally inefficient
#                   - as it shifts the position of all items in the queue
#               -    even more so for large queues
#           - queues implemented as a class:
#               class Queue:
#                   #> creates an empty queue
#                   def __init__(self) -> None:
#                       self.queue = []
#   
#                   #> method to check if the queue is empty
#                   def is_empty(self) -> None:
#                       return len(self.queue) == 0
#
#                   #> method to enqueue items from the queue
#                   def enqueue(self, value) -> None:
#                       self.queue.append(value)
#
#                   #> method to dequeue items from the queue
#                   def dequeue(self) -> int | None:
#                       if self.is_empty():
#                           print("queue is empty")
#                           return None
#                       return self.queue.pop(0)
#                       
#                   #> method to return the first element in the queue
#                   def peek(self) -> None:
#                       if self.is_empty():
#                           print("queue is empty")
#                           return None
#                       return self.queue[0]
#
#                   #> method to return the current size of the queue
#                   def size(self) -> int:
#                       return len(self.queue)
#
#       - queue using linked lists
#           - why queues using linked lists?
#               - unlike normal lists
#                   - linked lists are able to be stored where there is free space in memory
#                   - where linked lists do not have to be stored contiguously in memory
#               - linked lists also don't shift the elements in current queue
#                   - unlike lists which shift items when items are removed inside the list
#               - unlike lists when an element is removed (popped)
#                   - the rest of the nodes in the linked list do not have to be shifted
#           - sidenote:
#               - even though linked lists are better when dealing with a scattered memory space
#                   - this type of list will use more memory space due to having to also store the node addresses
#               - the code is also more complex
#                   - making it a bit hard to understand or interpret
#           - queue implementation using Python's linked lists
#               #> handles the node logic
#               class Node:
#                   def __init__(self, value) -> None:
#                       self.value = value                      #> takes in the value provided
#                       self.next = None                        #> presumably the next node address(?)
#
#               #> handles the linked queue logic
#               class Queue:
#                   #> creates an empty queue
#                   def __init__(self) -> None:
#                       self.front = None                       #> represents the first in line
#                       self.rear = None                        #> represents the last in line
#                       self.size = 0#                          #> represents the size of the queue
#
#                   #> method to check if the linked queue is empty
#                   def is_empty(self) -> bool:
#                       return self.size == 0                   #> returns True if the queue is empty
#
#                   #> method to enqueue items to the queue
#                   def enqueue(self, value) -> None:
#                       new_node = Node(value)                  #> creates a new node for the new value
#                       if self.rear is None:                   #> if the queue is currently empty
#                           self.front = self.rear = new_node   #> sets the value of self.front and self.rear
#                                                                   #> to the new_node object
#                           self.size += 1                      #> increases the size by 1
#                           return                              #> exits the function call
#                       self.rear.next = new_node               #> if the queue is not empty, this code runs
#                                                                   #> sets the last in the queue to the new node
#                       self.size += 1                          #> increases the size by 1
#
#                   #> method to dequeue items from the queue
#                   def dequeue(self) -> int | None:
#                       if is_empty:                            #> checks if the queue is empty
#                           print("queue is empty")             
#                           return None                         #> returns if True
#                       dequeued = self.front                   #> dequeued gets the value of self.front
#                       self.front = self.front.next            #> the new front becomes the nect element in the queue
#                                                                   #> or the pointer to the next node
#                                                                   #> from the bottom up
#                       self.size -= 1                          #> decreases the size by 1
#                       if self.front is None:                   #> checks if the front of the queue is empty
#                           self.rear = None                    #> sets the rear of the queue to None if the queue is now empty
#
#                   #> method to look at the front value in the queue
#                   def peek(self) -> int | None:
#                       if is_empty:                            #> checks if the queue is empty
#                           print("queue is empty")             
#                           return None                         #> returns if True
#                       return self.front.ValueError            #> returns the current value at the front of the queue
#
#                   #> method to return the current size of the queue
#                   def size(self) -> int:
#                       return self.size                        #> retunr the current size
#
#                   #> method to print the nodes in order
#                   def traverse(self) -> None:
#                       current_node = self.front               #> current_node gets a copy of self.front
#                       while current_node:                     #> loops current_node until it results to None
#                                                                   #> whcih is the end of the queue
#                           print(current_node.value, end="- ") #> prints the value of the current node it is at
#                           current_node = current_node.next    #> changes the pointer to the next value in the stack
#                       print()                                 #> adds a new line
#
#   - Linked Lists
#       - is a list whre the nodes are linked together
#       - each node contains both a data and a pointer
#           - the data it stores are able to be any value
#               - like normal arrays
#           - the pointer it holds is a pointer to another node
#       - the elements in this list is linked together such that each node points to where in memory the other node is placed
#       - illustration:
#           |========|     |========|     |========|
#           |  DATA  |   ->|  DATA  |   ->|  DATA  |
#           |========|  /  |========|  /  |========|
#           |  NEXT -|-/   |  NEXT -|-/   |  NEXT -|
#           |========|     |========|     |========|
#       - linked lists vs arrays (Python)
#           - unlike linked lists, arrays are a existing data structure
#               - unlike linked lists wherein the have to be implemented
#           - in arrays, elements are stored together right next to each other (contiguous)
#               - this is more memory efficient unlike linked lists wherein it has to accomodate nodes as well
#               - while in linked lists, they are store separately in their own part in memory
#           - in linked lists, elements are not able to be accessed directly (random access)
#               - while in arrays, this is not the case
#           - elements are able to be removed or added without any shfiting in linked lists
#               - this is not the case in arrays, due to each element shifting
#           - implementing linked lists is way more complecated unlike built-in arrays
#               - this is due to the logic required to efficiently traverse linked lists
#       - time complexities in Linked Lists Operations
#           - Linear search works the same as normal lists
#               - due to the algorithm searching through each node (element) one after the other
#           - Binary search however, is impractical in linked lists
#               - this is due to the algorithm needing to jump to specific nodes
#               - it is technically possible, but the performance penalty makes it impractical to use
#           - sorting algorithms that goes through each node sequentially is possible in linked lists
#               - but algorithms that requires to jump through each other nodes (or based on an index)
#               - are unlikely to work in linked lists
#       - in linked lists, there are basic operations that is commonly done
#           - traversal
#               - traverses from one node to another
#               - sample code:
#                   #> singly linked lists
#                   class Node:
#                       def __init__(self, value) -> None:
#                           self.data = data
#                           self.next = None
#
#                   #> logic
#                   def traverse(head) -> None:
#                       current_node = head
#                       while current_node:
#                           print(current_node.data, end=" > ")
#                           current_node = current_node.next
#                       print("null")
#           - removing a node
#               - nodes are able to be removed at a constant performace penalty
#               - like removing a certain node, this comes at a constant performace penalty
#           - sort
#               - this type of operation is more complicated but has the same penalties
#       - types of linked lists
#           - singly linked liss
#               - this type of list are the simplest kind of linked lists
#               - it takes up less memory space than other types
#                   - due to each node only being linked to one other node
#               - illustration
#                   |========|     |========|     |========|
#                   |  DATA  |   ->|  DATA  |   ->|  DATA  |
#                   |========|  /  |========|  /  |========|
#                   |  NEXT -|-/   |  NEXT -|-/   |  NEXT -|
#                   |========|     |========|     |========|
#           - double linked lists
#               - this type of linked list has both the address of the next node
#                   - but also has the address of the previous node
#               - this type of link takes up more memory space than single linked nodes
#                   - due to having an additional memory address to store
#               - illutration
#                   |========|<----|========|<----|========|
#                   |  PREV  |   ->|  PREV  |   ->|  PREV  |
#                   |========|   | |========|   | |========|
#                   |  DATA  |  /  |  DATA  |  /  |  DATA  |
#                   |========|  |  |========|  |  |========|
#                   |  NEXT -|-/   |  NEXT -|-/   |  NEXT -|
#                   |========|     |========|     |========|
#           - circular linked lists
#               - this type of linked lists mostly stays the same as doubly linked lists
#                   - but the "head" and "tail" nodes are connected
#               - even though this types of linked lists mostly take the same memory doubly linked lists
#                   - it is a lot more complicated to implement
#               - the trade off is that this type of linked lists are "contiguous"
#                   - the elements inside are able to be cycled through
#                   - though it is required to run checks every time a new node is created or removed
#                       - to check if there are no links that points to null
#               - there are two types of circular linked lists
#                   - a circular singly linked list only points to the next node
#                       - it cannot do so to the previous node
#                       - illustration
#                           |========|     |========|     |========|
#                         ->|  DATA  |   ->|  DATA  |   ->|  DATA  |
#                         | |========|  /  |========|  /  |========|
#                         | |  NEXT -|-/   |  NEXT -|-/   |  NEXT -|-\
#                         | |========|     |========|     |========| |
#                         \------------------------------------------/
#                   - a circular doubly linked list can point both at the next node
#                       - and also to the previous node
#                       - illustration
#                         /------------------------------------------\
#                         | |========|<----|========|<----|========| |
#                         \-|  PREV  |   ->|  PREV  |   ->|  PREV  |</
#                         > |========|   | |========|   | |========|
#                         | |  DATA  |  /  |  DATA  |  /  |  DATA  |
#                         | |========|  |  |========|  |  |========|
#                         | |  NEXT -|-/   |  NEXT -|-/   |  NEXT -|-\
#                         | |========|     |========|     |========| |
#                         \------------------------------------------/