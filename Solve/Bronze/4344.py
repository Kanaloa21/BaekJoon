n = int(input())
case = []
for i in range(n):
    case.append(list(map(int, input().split())))
    del case[i][0]
    avg = sum(case[i])/len(case[i])
    for j in range(len(case[i])):
        if case[i][j] > avg: case[i][j] = 1
        else: case[i][j] = 0 

for i in range(n):
    print('{:.3f}%'.format(case[i].count(1)/len(case[i])*100) )