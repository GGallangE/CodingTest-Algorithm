
while True:
    s = input()
    if s == '.':
        break
    sentence = []
    temp = True
    for i in s:
        if i == '(' or i == '[':
            sentence.append(i)
        elif i == ')':
            if not sentence or sentence[-1] == '[':
                temp = False
                break
            elif sentence[-1] == '(':
                sentence.pop()
        elif i == ']':
            if not sentence or sentence[-1] == '(':
                temp = False
                break
            elif sentence[-1] == '[':
                sentence.pop()
    if temp == True and not sentence:
        print('yes')
    else:
        print('no')