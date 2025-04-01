import sys
import heapq

input = sys.stdin.readline
N = int(input())
cards = []
num = 0

for _ in range(N):
    heapq.heappush(cards, int(input()))

while len(cards)>1: # card = [10, 20 ,40]
    A = heapq.heappop(cards) # A = 10, card = [20, 40]
    B = heapq.heappop(cards) # B = 20, card = [40]
    heapq.heappush(cards, A+B) # card = [30, 40]
    num += A+B # num = 30+40 = 70  # num = 100
print(num)