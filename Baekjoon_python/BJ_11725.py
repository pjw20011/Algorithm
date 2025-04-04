import sys

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





