# 한수
import time
def sol(n):
    res = n
    if n > 99:
        for i in range(99, n+1):
            stri = str(i)
            d = int(stri[0]) - int(stri[1])
            for j in range(len(stri)-1):
                if d != int(stri[j]) - int(stri[j+1]): 
                    res -= 1
                    break
    else: pass
    return res
start = time.time()
n = int(input())
print(sol(n))
print(f'Run time: {time.time() - start}')