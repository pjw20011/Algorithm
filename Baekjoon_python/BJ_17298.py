# 오큰수
N = int(input())

for i in range(N):
    stack = []
    result = []
    num = list(map(int, input().split()))
    for j in range(N):
        while stack and stack[-1][0] < num[j]:
            result.append(str(num[j]))
            stack.pop()
        stack.append((num[j], j))
    while stack:
        result.append('-1')
        stack.pop()
    print(' '.join(result))