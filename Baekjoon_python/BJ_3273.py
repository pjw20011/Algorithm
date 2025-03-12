# 두수의 합

n = int(input())
num = list(map(int, input().split()))
x = int(input())
count = 0

num.sort()
l, r = 0, n-1
while l < r:
    if num[l] + num[r] == x:
        count+=1
        l+=1
        r-=1
    elif num[l] + num[r] < x:
        l+=1
    else:
        r-=1
print(count)

