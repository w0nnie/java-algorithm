import sys
input = sys.stdin.readline

n = int(input())
cnt = 0
last = 0
arr = [list(map(int,input().split())) for _ in range(n)]
arr = sorted(arr, key =lambda x : x[0])
# [[0, 6], [1, 4], [2, 13], [3, 5], [3, 8], [5, 7], [5, 9], [6, 10], [8, 11], [8, 12], [12, 14]]
# [[1, 4], [3, 5], [0, 6], [5, 7], [3, 8], [5, 9], [6, 10], [8, 11], [8, 12], [2, 13], [12, 14]]
# [[1, 4], [3, 5], [0, 6], [5, 7], [3, 8], [5, 9], [6, 10], [8, 11], [8, 12], [2, 13], [12, 14]]
arr = sorted(arr, key =lambda x : x[1])
for i,j in arr:
    if i>=last:
        cnt += 1
        last = j
print(cnt)
