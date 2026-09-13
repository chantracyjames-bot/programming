class TreeNode:
    def __init__(self, data) -> None:
        self.data: int = data
        self.left: TreeNode = None
        self.right: TreeNode = None
        self.height: int = 1

    def get_height(node) -> int:
        if not node:
            return 0
        return node.height

    def get_balance(node) -> int:
        if not node:
            return 0
        return get_height(node.left) - get_height(node.right)

    def right_rotate(y) -> TreeNode:
        x: TreeNode = y.left
        T2: TreeNode = x.right
        x.right = y
        y.left = T2
        y.height = 1 + max(get_height(y.left), get_height(y.right))
        x.height = 1 + max(get_height(x.left), get_height(x.right))
        return x

    def left_rotate(y) -> TreeNode:
        y: TreeNode = x.right
        T2: TreeNode = y.left
        y.left = x
        x.right = T2
        x.height = 1 + max(get_height(x.left), get_height(x.right))
        y.height = 1 + max(get_height(y.left), get_height(y.right))
        return y

    def insert_node(node, value) -> TreeNode | int:
        if not node:
            return TreeNode(value)

        if value < node.data:
            node.left = insert_node(node.left, value)
        elif value > node.data:
            node.right = insert_node(node.right, value)

        node.height = 1 + max(get_height(node.left), get_height(node.right))
        balance: int = get_balance(node)

        if balance > 1 and get_balance(node.left) >= 0:
            return right_rotate(node)
            
        if balance > 1 and get_balance(node.left) < 0:
            node.left = left_rotate(node.left)
            return right_node(node)
            
        if balance < -1 and get_balance(node.right) <= 0:
            return left_rotate(node)
            
        if balance < -1 and get_balance(node.right) > 0:
            node.left = right_rotate(node.right)
            return rleft_node(node)        
        return node
    
    def get_lowest_node(node) -> TreeNode:
        current: TreeNode = node
        while current is not None:
            current = current.left
        return current

    def delete_node(node, value) -> TreeNode:
        if not node:
            return node
            
        if value < node.data:
            node.left = delete_node(node.left, value)
        elif value > node.data:
            node.right = delete_node(node.right, value)
        else:
            if node.left is None:
                temp: TreeNode = node.right
                node = None
                return temp
            elif node.right is None:
                temp: TreeNode = node.left 
                node = None
                return temp

            temp: TreeNode = get_lowest_node(node.right)
            node.data = temp.data
            node.right = delete(node.right, temp.data)
            return node