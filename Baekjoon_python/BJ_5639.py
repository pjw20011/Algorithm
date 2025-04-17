import sys
sys.setrecursionlimit(10**6)  # 트리가 깊을 때를 대비해 설정

# 1. 전위 순회 결과를 입력받아 리스트로 저장
preorder = list(map(int, sys.stdin.read().splitlines()))

idx = 0  # preorder 리스트에서 현재 처리 중인 인덱스

# 2. 트리의 노드를 나타내는 클래스
class Node:
    def __init__(self, val):
        self.val = val       # 값 저장
        self.left = None     # 왼쪽 자식 노드
        self.right = None    # 오른쪽 자식 노드

# 3. 전위 순회를 기반으로 이진 검색 트리 만들기
def build_tree(min_val, max_val):
    global idx
    if idx >= len(preorder):  # 인덱스를 벗어나면 종료
        return None

    val = preorder[idx]

    # 현재 값이 범위를 벗어나면 이 위치에 올 수 없음
    if val < min_val or val > max_val:
        return None

    # 현재 값을 트리에 넣기
    idx += 1
    node = Node(val)

    # 왼쪽은 더 작은 값들로 트리 구성
    node.left = build_tree(min_val, val)

    # 오른쪽은 더 큰 값들로 트리 구성
    node.right = build_tree(val, max_val)

    return node

# 4. 후위 순회로 출력하기
def postorder(node):
    if node:
        postorder(node.left)     # 왼쪽 먼저
        postorder(node.right)    # 그 다음 오른쪽
        print(node.val)          # 마지막에 현재 노드 출력

# 트리 만들고 출력
root = build_tree(float('-inf'), float('inf'))  # 가능한 가장 넓은 범위로 시작
postorder(root)
