s = input()
cro = ['c=', 'c-', 'd-', 'lj', 'nj', 's=', 'z=']
cro_3 = 'dz='
res = 0
i = 0
while i < len(s):
    if i < (len(s)-1) and s[i]+s[i+1] in cro:
        i += 1
    elif i < (len(s)-2) and s[i]+s[i+1]+s[i+2] in cro_3:
        i += 2
    else: pass
    res += 1
    i += 1

print(res)