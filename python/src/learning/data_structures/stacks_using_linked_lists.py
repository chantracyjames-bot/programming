#> handles the node logic
class Node:
    def __init__(self, value) -> None:
        self.value: int = value                 #> takes in the value provided
        self.next: Node = None

#> handles the linked stack logic
class Stack:
    #> creates an empty stack
    def __init__(self) -> None:
        self.head: Node = None                  #> is the pointer to the first node
        self.size: int = 0                      #> represents the size of the list

    #> method to check if the linked list is empty
    def is_empty(self) -> bool:
        return self.sze == 0                    #> returns True if the stack is empty

    #> method to push new values to the stack
    def push(self, value) -> None:
        new_node = None(value)                  #> creates a new node for the new value
        if self.head:                           #> runs if the head is not empty
            new_node.next = self.head           #> gives the current head to the new node (value head)
        self.head = new_node                    #> gives the new node object to the head of the list
        self.size += 1                          #> increases the size by 1

    #> method to pop values from the stack
    def pop(self) -> int | None:
        if is_empty:                            #> checks if the stack is empty
            print("stack is empty")
            return None                         #> returns if True
        popped_node = self.head                 #> popped_head gets the self.head object
        self.head = self.head.next              #> the new head beomes the _.next attrubute_
        #> or the pointer to the next item in the stack
        #> from the top down
        self.size -= 1                          #> decreases the size by 1
        return popped_node.value                #> returns the value that the removed node holds

    #> method to look at the latest value in the stack
    def peek(self) -> int | None:
        if is_empty:                            #> checks if the stack is empty
            print("stack is empty")
            return None                         #> returns if True
        return self.head.value                  #> returns the current value at the top of the stack

    #> method to return the current size of the stack
    def size(self) -> int:
        return self.size                        #> returns the current size

    #> method to print the nodes in order
    def traverse(self) -> None:
        current_node = self.head                #> current_node gets a copy of self.head
        while current_node:                     #> loops current_node until it results to None
        #> which is the beginning of the stack
            print(current_node.value, end="- ") #> prints the value of the current node it is at
            current_node = current_node.next    #> changes the pointer to the next value in the stack
        print()                                 #> adds a new line