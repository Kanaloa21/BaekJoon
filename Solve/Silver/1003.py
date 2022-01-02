# 피보나치 함수

o = [1, 0]
for i in range(2, 82):
    if i % 2 == 0:
        o.append(o[i-1])
    else:
        o.append(o[i-2] + o[i-3])
        
n0, n1 = 0, 0
result = []
num = []

tc = int(input())

for i in range(tc):
    num.append(int(input()))

for i in num:
    print(o[i*2], o[i*2+1])
