import heapq
import sys

input = sys.stdin.readline

V, E = map(int, input().split())
K = int(input())

graph = [[] for _ in range(V+1)]
distance = [float('inf')] * (V + 1)

for _ in range(E):
    u, v, w = map(int, input().split())
    graph[u].append((v,w))

distance[K] = 0

def dijkstra(K):
    heap = []
    heapq.heappush(heap, (0, K))

    while heap:
        dist, now = heapq.heappop(heap)

        if distance[now] < dist:
            continue

        for i in graph[now]:
            cost = dist + i[1]
            if cost < distance[ i[0]]:
                distance[i[0]] = cost
                heapq.heappush(heap, (cost, i[0]))

dijkstra(K)

for i in range(1, V + 1):
    if distance[i] == float('inf'):
        print("INF")
    else:
        print(distance[i])