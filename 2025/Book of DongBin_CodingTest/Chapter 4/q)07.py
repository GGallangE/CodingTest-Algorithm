N = input()

def split_number(num):
    length = len(num)
    mid = length // 2
    left = num[:mid]
    right = num[mid:]
    return left, right, mid
    
    
left, right, half = split_number(N)
left_count = 0
right_count = 0

for i in range(half):
    left_count += int(left[i])
    right_count += int(right[i])

if left_count == right_count:
    print("LUCKY")
else:
    print("READY")