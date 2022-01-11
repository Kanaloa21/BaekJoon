s = input()
for c in range(ord('a'), ord('z')+1):
    swt = True
    for i in range(len(s)):
        if chr(c) == s[i]:
            print(i, end=' ')
            swt = False
            break
    if(swt):
        print(-1, end=' ')