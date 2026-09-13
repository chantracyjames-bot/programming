#> handles the node logic
class Node:
    def __init__(self, value) -> None:
        self.value: int = value                 #> takes in the value provided
        self.next: Node = None                  #> presumably the next node address(?)

#> handles the linked queue logic
class Queue:
    #> creates an empty queue
    def __init__(self) -> None:
        self.front: Node = None                 #> represents the first in line
        self.rear: Node = None                  #> represents the last in line
        self.size: int = 0                      #> represents the size of the queue

    #> method to check if the linked queue is empty
    def is_empty(self) -> bool:
        return self.size == 0                   #> returns True if the queue is empty

    #> method to enqueue items to the queue
    def enqueue(self, value) -> None:
        new_node = Node(value)                  #> creates a new node for the new value
        if self.rear is None:                   #> if the queue is currently empty
            self.front = self.rear = new_node   #> sets the value of self.front and self.rear to the new_node object
            self.size += 1                      #> increases the size by 1
            return                              #> exits the function call
        self.rear.next = new_node               #> if the queue is not empty, this code runs and sets the last in the queue to the new node
        self.size += 1                          #> increases the size by 1

    #> method to dequeue items from the queue
    def dequeue(self) -> int | None:
        if is_empty:                            #> checks if the queue is empty
            print("queue is empty")             
            return None                         #> returns if True
        dequeued = self.front                   #> dequeued gets the value of self.front
        self.front = self.front.next            #> the new front becomes the next element in the queue or the pointer to the next node
        #> from the bottom up
        self.size -= 1                          #> decreases the size by 1
        if self.front is None:                  #> checks if the front of the queue is empty
            self.rear = None                    #> sets the rear of the queue to None if the queue is now empty

    #> method to look at the front value in the queue
    def peek(self) -> int | None:
        if is_empty:                            #> checks if the queue is empty
            print("queue is empty")             
            return None                         #> returns if True
        return self.front.ValueError            #> returns the current value at the front of the queue

    #> method to return the current size of the queue
    def size(self) -> int:
        return self.size                        #> retunr the current size

    #> method to print the nodes in order
    def traverse(self) -> None:
        current_node = self.front               #> current_node gets a copy of self.front
        while current_node:                     #> loops current_node until it results to None which is the end of the queue
            print(current_node.value, end="- ") #> prints the value of the current node it is at
            current_node = current_node.next    #> changes the pointer to the next value in the stack
        print()                                 #> adds a new line