priorities = [2,1,3,2]
location = 2

def solution(priorities, location):
    answer = 0
    while priorities:
        if priorities[0] == max(priorities):
            priorities.pop(0)
            answer += 1
            if location == 0:
                return answer
            else:
                location -= 1
        else:
            priorities.append(priorities.pop(0))
            if location == 0:
                location = len(priorities) - 1
            else:
                location -= 1

print(solution(priorities, location))