a = [1, 5, 3, 9, 15, 23, 12, 34, 5, 23, 122]
b = []
for i in range(2):
    x = max(a)
    b.append(a.pop(a.index(x)))
sum = b[0] * b[1]
print(sum)
