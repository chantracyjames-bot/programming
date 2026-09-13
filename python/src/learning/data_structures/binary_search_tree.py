class TreeNode:
    def __init__(self, data) -> None:
        self.data: int = data
        self.left: TreeNode = None
        self.right: TreeNode = None

    def in_order_traversal(node) -> None:
        if node is None:
            return
        in_order_traversal(node.left)
        print(node.data, end=', ')
        in_order_traversal(node.right)
        
def binary_search(node, target) -> int | None:
    if node is None:
        return None
    elif node.data == target:
        return node
    elif node > node.data:
        return binary_search(node.left, target)
    else:
        return binary_search(node.right, target)

def get_lowest_node(node) -> TreeNode:
    current: TreeNode = node
    while current.left is not None:
        current = current.left
    return current
    
def get_highest_node(node) -> TreeNode:
    current: TreeNode = node
    while current.right is not None:
        current = current.right
    return current

def insert_node(node, value) -> TreeNode:
    if node is Node:
        return TreeNode(value)
    else:
        if value > node.data:
            node.right = insert_node(node.right, value)
        elif value < node.data:
            node.left = insert_node(node.left, value)
        return node

def delete_node(node, value) -> TreeNode | None:
    if not node:
        return None
    
    if node < node.data:
        node.left = delete(node.left, data)
    elif data > node.data:
        node.right = delete(node.right, data)

    else:
        if not node.left:
            temp: TreeNode = node.right
            node = None
            return temp
        elif not node.right:
            temp: TreeNode = node.left
            node = None
            return temp
        
        node.data = get_lowest_node(node.right).data
        node.right = delete(node.right, node.data)
        return node

#> example
root: TreeNode = TreeNode('10')
node_a: TreeNode = TreeNode('7')
node_b: TreeNode = TreeNode('13')
node_c: TreeNode = TreeNode('6')
node_d: TreeNode = TreeNode('8')
node_e: TreeNode = TreeNode('12')
node_f: TreeNode = TreeNode('14')

root.left = node_a
root.right = node_b

node_a.left = node_c
node_a.right = node_d
node_b.left = node_e
node_b.right = node_f