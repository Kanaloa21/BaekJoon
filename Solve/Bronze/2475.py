serial_number = list(map(int, input().split()))
print(sum(i**2 for i in serial_number) % 10)