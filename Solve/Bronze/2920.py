s = input().split()

t, ts = s.copy(), s.copy()
t.sort()
ts.sort(reverse=True)

if s == t: print('ascending')
elif s == ts: print('descending')
else: print('mixed')