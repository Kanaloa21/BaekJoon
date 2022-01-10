n = int(input())
n_origin = n
cnt = 0
while(True):
    n_10 = n // 10
    n_1 = n % 10
    m = n_10 + n_1
    m_1 = m % 10
    n = (n_1 * 10) + m_1
    cnt += 1
    if n_origin == n: break
print(cnt)