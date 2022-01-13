serial_number = list(map(int, input().split()))
sum = 0
for i in serial_number:
    sum += i**2
unique_number = sum % 10
print(unique_number)