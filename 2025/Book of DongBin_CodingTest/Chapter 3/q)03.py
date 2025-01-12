S = input()

all_0 = 0
all_1 = 0

if S[0] == '0':
    all_0 += 1
else:
    all_1 += 1

for i in range(len(S)-1):
    if S[i] != S[i+1]:
        if S[i+1] == '1':
            all_0 += 1
        else:
            all_1 += 1
print(min(all_0, all_1))