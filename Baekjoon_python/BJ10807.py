# 백준 10807번 문제: 개수 세기

N = int(input())

number = list(map(int,input().split()))
v = int(input())
count = 0

for num in number:
    if num == v:
        count += 1
print(count)