def z(n, r, c):
    global res
    if n > 1:
        t = 2**(n-1)
        x, y = r//t, c//t
        if (x, y) == (0, 0): u = 0
        elif (x, y) == (0, 1): u = 1
        elif (x, y) == (1, 0): u = 2
        elif (x, y) == (1, 1): u = 3
        res += u * (t*t)
        r -= (x * t)
        c -= (y * t)
        z(n-1, r, c)

    elif n == 1:
        if (r, c) == (0, 0): res += 0
        if (r, c) == (0, 1): res += 1
        if (r, c) == (1, 0): res += 2
        if (r, c) == (1, 1): res += 3


res = 0
N, R, C = map(int, input().split())
z(N, R, C)
print(res)