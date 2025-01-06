import sys
from collections import deque

N, K = map(int,sys.stdin.readline().split())

q = deque([i for i in range(1,N+1)])

result =[]
cnt=0

while(len(q)>0):
    current = q.popleft()
    q.append(current)
    cnt +=1
    if cnt == K:
        result.append(current)
        q.pop()
        cnt = 0

print("<",end="")
for i in range(len(result)):
    print(result[i] , end="")
    if i != len(result)-1:
        print(", ",end="")
print(">")