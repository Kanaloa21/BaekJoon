n = int(input())
case = [input() for i in range(n)]
for j in range(n):
    combo = 0
    res = 0
    for i in range(len(case[j])):
        if case[j][i] == 'O':
            if i > 0 and case[j][i-1] == 'O':
                combo += 1
            elif i > 0 and  case[j][i-1] == 'X':
                combo = 0
            res = res + 1 + combo
    print(res)