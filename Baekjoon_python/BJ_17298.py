#오큰수 - 17298번
N = int(input())
num = list(map(int,input().split()))
stack = []
answer = [-1] * N

for i in range(N):
    while stack and num[stack[-1]] < num[i]:
        idx = stack.pop()
        answer[idx] = num[i]
    stack.append(i)

print(' '.join(map(str,answer)))