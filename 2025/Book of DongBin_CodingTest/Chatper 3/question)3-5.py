N, M = map(int,input().split())
boling = list(map(int, input().split()))
count = 0

for i in range(len(boling)-1):
    for j in range(i+1,len(boling)):
        if boling[i] != boling[j]:
            count += 1
            
print(count)