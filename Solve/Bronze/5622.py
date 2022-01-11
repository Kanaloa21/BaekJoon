numeric = [
    ['A', 'B', 'C'],
    ['D', 'E', 'F'],
    ['G', 'H', 'I'],
    ['J', 'K', 'L'],
    ['N', 'M', 'O'],
    ['P', 'Q', 'R', 'S'],
    ['T', 'U', 'V'],
    ['W', 'X', 'Y', 'Z']
]

s = input()
res = 0
for c in s:
    for i in range(len(numeric)):
        try: 
            c == numeric[i].index(c)
            res = res + (i+3)
        except ValueError:
            pass
print(res)