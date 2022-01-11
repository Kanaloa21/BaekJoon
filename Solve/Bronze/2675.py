case = int(input())
new_s = ['' for _ in range(case)]

for n in range(case):
    sn, s = input().split()
    for i in range(len(s)):
            new_s[n] += s[i] * int(sn)

for st in new_s: print(st)