class Queue:
    #> creates an empty queue
    def __init__(self) -> None:
        self.queue: list = []

    #> method to check if the queue is empty
    def is_empty(self) -> None:
        return len(self.queue) == 0

    #> method to enqueue items from the queue
    def enqueue(self, value) -> None:
        self.queue.append(value)

    #> method to dequeue items from the queue
    def dequeue(self) -> int | None:
        if self.is_empty():
            print("queue is empty")
            return None
        return self.queue.pop(0)

    #> method to return the first element in the queue
    def peek(self) -> None:
        if self.is_empty():
            print("queue is empty")
            return None
        return self.queue[0]

    #> method to return the current size of the queue
    def size(self) -> int:
        return len(self.queue)