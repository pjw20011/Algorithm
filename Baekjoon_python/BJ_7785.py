N = int(input())

people = {}

for i in range(N):
    name, action = input().split()
    if action == 'enter':
        people[name] = 1
    else:
        people.pop(name, None)

result = sorted(people.keys(), reverse=True)

print('\n'.join(result))

