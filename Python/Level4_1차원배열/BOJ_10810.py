#10810
N,M = map(int,input().split())
bisket = [0] * N
for a in range(M):
    i,j,k = map(int,input().split())
    for x in range(i,j+1):
        bisket[x-1] = k
    
for i in range(N):
    print(bisket[i],end=" ")