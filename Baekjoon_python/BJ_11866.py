from collections import deque

N, K = map(int,input().split())
q = deque()
result = []

for i in range(1, N+1):
    q.append(i)

while q:
    for i in range(K-1):
        q.append(q.popleft())

    result.append(str(q.popleft()))

print('<'+', '.join(result)+'>')
