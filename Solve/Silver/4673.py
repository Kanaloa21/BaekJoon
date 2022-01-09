import time

def SelfNum():
    a = []
    for i in range(10000):
        isum = 0
        for j in str(i):
            isum += int(j)
        a.append(i+isum)
    for i in range(10000):
        try: 
            a.index(i)
        except ValueError: 
            print(i)

start = time.time()
SelfNum()
print(f'Run time:{time.time() - start}')