T = int(input())

for i in range (T):
    stack = []
    VPS = input()
    for j in VPS:
        if j == '(':
            stack.append(j)
        elif j == ')':
            if not stack:
                print('NO')
                break
            stack.pop()
    else:
        if not stack:
            print('YES')
        else:
            print('NO')