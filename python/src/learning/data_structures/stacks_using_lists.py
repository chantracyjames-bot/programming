class Stack:
    #> creates an empty stack
    def __init__(self) -> None:
        self.stack: list = []
    
    #> method to check if the stack is empty
    def is_empty(self) -> bool:
        if len(self.stack):
            return False
        return True
    
    #> method to push elements to the end of the stack
    def push(self, value) -> None:
        self.stack.append(value)
    
    #> method to pop elements from the end of the stack and return it
    def pop(self) -> int | None:
        #> checks if the stack is empty
        if self.is_empty():
            print("stack is empty")
            return None
        return self.stack.pop()
    
    #> method to return the element at the top of the stack
    def peek(self) -> int | None:
        #> checks if the stack is empty
        if self.is_empty():
            print("stack is empty")
            return None
        return self.stack[-1]
    
    #> method to return the size of the stack
    def size(self) -> int:
        return len(self.stack)