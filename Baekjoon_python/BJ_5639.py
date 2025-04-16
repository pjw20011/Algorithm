import sys
sys.setrecursionlimit(10**6)

input = sys.stdin.readline

class Node:
    def __init__(self, val):
        self.val = val
        self.left = None
        self.right = None

def insert(node, val):
    if val < node.val:
        if node.left is None:
            node.left = Node(val)
        else:
            insert(node.left, val)
    elif val > node.val:
        if node.right is None:
            node.right = Node(val)
        else:
            insert(node.right, val)

def postorder(node):
    if node is not None:
        postorder(node.left)
        postorder(node.right)
        print(node.val)

preorder = []
while True:
    try:
        val = int(sys.stdin.readline())
        preorder.append(val)
    except:
        break

root = Node(preorder[0])
for val in preorder[1:]:
    insert(root, val)

postorder(root)

