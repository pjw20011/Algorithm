import sys
sys.setrecursionlimit(10**6)

input= sys.stdin.readline

N = int(input())

tree = {}

for _ in range(N-1):
    a, b = map(int, input().split())
    if a not in tree:
        tree[a] = []
    if b not in tree:
        tree[b] = []

    tree[a].append(b)
    tree[b].append(a)

parent = [0] * (N+1)

def dfs(node):
    for child in tree[node]:
        if parent[child] == 0:
            parent[child] = node
            dfs(child)

parent[1] = 1
dfs(1)

for i in range(2, N+1):
    print(parent[i])