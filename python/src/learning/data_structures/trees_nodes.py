class TreeNode:
    def __init__(self, data) -> None:
        self.data: str = data 
        self.left: TreeNode = None
        self.right: TreeNode = None

#> binary tree with a depth of two (root and two children)
class Tree:
    def __init__(self, value) -> None:
        self.tree: TreeNode = TreeNode(value)

    def add_right(self, value) -> None:
        self.tree.right = value

    def add_left(self, value) -> None:
        self.tree.left


def pre_order_traversal(node) -> None:
    if node is None:
        return
    print(node.data, end=", ")
    pre_order_traversal(node.left)
    
def in_order_traversal(node) -> None:
    if node is Node:
        return
    in_order_traversal(node.left)
    print(node.data, end=", ")
    in_order_traversal(node.right)
    
def post_order_traversal(node) -> None:
    if node is None:
        return
    post_order_traversal(node.left)
    post_order_traversal(node.right)
    print(node.data, end=", ")

#> implementation without the Tree class
root_node: TreeNode = TreeNode('R')
node_a: TreeNode = TreeNode('A')
node_b: TreeNode = TreeNode('B')

root_node.left = node_a
root_node.right = node_b