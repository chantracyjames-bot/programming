def data_types():
    print('Python Data Types')
    text_type()
    numeric_type()
    boolean_type()
    sequence_type()
    mapping_type()
    set_types()
    binary_type()
    none_type()
    
def text_type():
    print('Text type:')
    print('str : ', "Hello World")
    print()
    
def numeric_type():
    print('int     : ', 127)
    print('float   : ', 3.14)
    print('complex : ', 2 + 3j)
    print()
    
def boolean_type():
    print('bool : ', True)
    print()
    
def sequence_type():
    print('list  : ', [1, "idkman", False])
    print('tuple : ', (2, "lumbago", True))
    print()
    
def mapping_type():
    print('dict : ', {"yes" : "no", "hello" : "world"})
    print()
    
def set_types():
    print('set       : ', (1, "maybe", 3.14))
    print('frozenset : ', 'frozenset', (2, "probs", 6.18))
    print() 
    
def binary_type():
    print('bytes      : ', bytes(1))
    print('bytesarray : ', bytearray(2))
    print('memoryview : ', memoryview(bytes(2)))
    print() 
    
def none_type():
    print('NoneType : ', None)
    
if __name__ == '__main__':
    data_types()