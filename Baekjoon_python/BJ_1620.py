N, M = map(int,input().split())

pokemon ={}

for i in range(N):
    name = input()
    pokemon[name] = i+1
    pokemon[str(i+1)] = name

for i in range(M):
    print(pokemon[input()])