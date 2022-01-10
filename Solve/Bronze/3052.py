import sys
a = { (int(sys.stdin.readline().strip()) % 42) for i in range(10) }
print(len(a))