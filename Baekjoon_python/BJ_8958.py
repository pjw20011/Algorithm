T = int(input())

for i in range(T):
    question = input()
    score = 0
    count = 0
    for i in range(len(question)):
        if question[i] == 'O':
            count+=1
            score+=count
        else:
            count = 0
    print(score)