N = int(input())
cnt = 1
stop = 1

if(N==1):
    cnt =1
else:
    while(N>stop):
        stop = (cnt * 6) + stop
        cnt += 1

print(cnt)