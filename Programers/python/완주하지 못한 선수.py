def solution(participant, completion):
    success = {}

    for person in participant:
        success[person] = success.get(person,0) + 1

    for person in completion:
        success[person] -= 1

    for key, value in success.items():
        if value == 1:
            return key