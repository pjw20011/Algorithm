import heapq


jobs = [[0,3],[1,9],[3,5]]

def solution(jobs):
    jobs.sort(key=lambda x: x[0])

    heap = []
    time = 0
    idx = 0
    total_time = 0

    while heap:
        while idx < len(jobs) and jobs[idx][0] <= time:
            heapq.heappush(heap, (jobs[idx][1], jobs[idx][0]))
            idx += 1

        if heap:
            job = heapq.heappop(heap)
            time += job[0]
            total_time += time - job[1]
        else:
            time = jobs[idx][0]
            idx += 1

    while idx < len(jobs):
        while idx < len(jobs) and jobs[idx][0] <= time:
            heapq.heappush(heap, (jobs[idx][1], jobs[idx][0]))
            idx += 1

        if heap:
            job = heapq.heappop(heap)
            time += job[0]
            total_time += time - job[1]
        else:
            time = jobs[idx][0]
            idx += 1

    return total_time // len(jobs)


print(solution(jobs))



