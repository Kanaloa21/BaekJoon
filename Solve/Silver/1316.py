# 그룹 단어 체커

n = int(input())
s = [input() for i in range(n)]
a = [s[i][0] for i in range(n)]
res = len(s)
for j in range(n):
    for i in range(1, len(s[j])):
        if s[j][i] == s[j][i-1]: pass
        elif s[j][i] in a[j]:
            res -= 1
            break
        else: a[j] += s[j][i]
print(res)