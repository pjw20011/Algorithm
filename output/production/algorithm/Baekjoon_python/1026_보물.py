N = int(input())
A = list(map(int,input().split()))
B = list(map(int,input().split()))

A.sort()
S = 0

for i in range(N):
    b = max(B)
    S += A[i] * b
    B.remove(b)

print(S)
    