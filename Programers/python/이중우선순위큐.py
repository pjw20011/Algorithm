import heapq

operations = ["I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"]

def solution(operations):
   answer = []
   for operation in operations:
       op, num = operation.split()
       if op == 'I':
           heapq.heappush(answer, int(num))
       elif op == 'D' and answer:
           if num =='1':
               idx = answer.index(max(answer))
               del answer[idx]
               heapq.heapify(answer)
           elif num == '-1':
               heapq.heappop(answer)

   if not answer:
        return [0, 0]
   else:
        return [max(answer), min(answer)]

print(solution(operations))