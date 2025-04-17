import sys
sys.setrecursionlimit(10**6)

class Node:
    def __init__(self, idx, x, y):
        self.idx = idx
        self.x = x
        self.y = y
        self.left = None
        self.right = None

def insert(parent, child):
    if child.x < parent.x:
        if parent.left is None:
            parent.left = child
        else:
            insert(parent.left, child)
    else:
        if parent.right is None:
            parent.right = child
        else:
            insert(parent.right, child)

def solution(nodeinfo):

    node_obj = [Node(idx+1, x, y) for idx, (x,y) in enumerate(nodeinfo)]

    node_obj.sort(key=lambda node: (-node.y,node.x))

    root = node_obj[0]

    for node in node_obj[1:]:
        insert(root, node)


    preorder_result= []
    postorder_result= []

    def preorder(node):
        if node:
            preorder_result.append(node.idx)
            preorder(node.left)
            preorder(node.right)

    def postorder(node):
        if node:
            postorder(node.left)
            postorder(node.right)
            postorder_result.append(node.idx)

    preorder(root)
    postorder(root)

    return [preorder_result, postorder_result]

nodeinfo = [[5,3],[11,5],[13,3],[3,5],[6,1],[1,3],[8,6],[7,2],[2,2]]
print(solution(nodeinfo))