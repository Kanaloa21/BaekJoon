n = int(input())
grades = list(map(int, input().split()))
m = max(grades)
for i in range(len(grades)):
    grades[i] = grades[i] / m * 100
print(sum(grades)/len(grades))