t = []
while(True):
    try:a, b = map(int, input().split())
    except EOFError: break
    else: t.append((a, b))
for x, y in t:
    print(x + y)