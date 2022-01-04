# 쉬운 계단 수

def func(n):
    global dp
    if n > 1:
        for j in range(1,n):
            for i in range(10):          
                if i > 0 and i < 9: 
                    dp[j][i] = dp[j-1][i-1]+ dp[j-1][i+1]
                elif i == 0:
                    dp[j][i] = dp[j-1][i+1]
                elif i == 9:
                    dp[j][i] = dp[j-1][i-1]
    elif n == 1:
        pass
        
while(True):
    num = int(input())
    dp = [[0, 1, 1, 1, 1, 1, 1, 1, 1, 1] for i in range(num)]

    func(num)
    res = 0
    for i in dp[num-1]:
        print(i)
        res = res + i

    print(res%1000000000)