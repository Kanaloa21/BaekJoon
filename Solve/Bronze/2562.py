import sys

case = []
for i in range(9):
    case.append(int(sys.stdin.readline()))

index = 1
maxnum = case[0]

for idx, val in enumerate(case, start=1):
    if maxnum < val:
        maxnum = val
        index = idx

print(maxnum)
print(index)