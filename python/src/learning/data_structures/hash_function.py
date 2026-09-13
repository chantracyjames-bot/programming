#> create an empty list (can be a set or a dictionary)
my_list: list[list] = [[], [], [], [], []] #> stores 5 elements
#> also called "buckets"
#> nested arrays prevent collisions
#> also called "chaining"   

#> create a hash function
def hash_function(value) -> int:
    hash_sum = 0                                 #> stores the value of the has
    for char in value:                           #> loops through every single character
        hash_sum += ord(char)                    #> converts a character into a unicode code number
    return hash_sum % 5                          #> uses a modulo to dictate where the value is stored in
                                                        #> different text will result into different hash codes
                                                        #> using a modulo will make storing a bit easier
#> create an add function
def add(value) -> None:
    index = hash_function(value)             #> calls the hash_function to return an index
                                                    #> where the new value is going to be stored in 
    my_list[index].append(value)             #> appends the new value to the corresponding index

#> create a loopup function
def lookup(value) -> None:
    index = hash_function(value)             #> calls the hash_function to return an index
                                                    #> looks up where the value might be stored in
    print(f"{value} is at {index}")          #> returns the index wherein the valus is stored at