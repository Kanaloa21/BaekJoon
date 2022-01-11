s = input()
res = '?'
cnt = [0 for i in range(ord('A'), ord('Z') + 1)]
s = s.upper()

for char in s:
    cnt[ord(char) - ord('A')] += 1

res = max(cnt)
overlapped = False
for i in range(len(cnt)):
    if overlapped == False and cnt[i] == res:
        overlapped = True
    elif overlapped == True and cnt[i] == res:
        res = '?'

if res != '?':
    res = cnt.index(res)
    print(chr(res+ord('A')))

else: print(res)