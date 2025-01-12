s = input()
answer = len(s)

for i in range(1, (len(s)//2 +1)):
    temp_letter = ""
    prev = s[0:i]
    count = 1
    
    for j in range(i, len(s), i):
        if prev == s[j:j+i]: # i가 2라 가정 하면 2~4, 4~6, 6~8 이런식으로 계산됨
            count += 1
        else:
            temp_letter += str(count) + prev if count >= 2 else prev
            prev = s[j:j+i]
            count = 1
    temp_letter += str(count) + prev if count >= 2 else prev
    answer = min(len(temp_letter), answer)
        
print(answer)