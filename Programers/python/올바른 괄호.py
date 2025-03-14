def solution(s):
    stack = []
    answer = True

    for i in s:
        if i == '(':
            stack.append(i)
        elif i == ')':
            if not stack:
                answer = False
                return answer
            else:
                stack.pop()
    else:
        if not stack:
            answer = True
        else:
            answer = False
    return answer