# num of n

x = int(input("Enter a number: "))


def sum(n):
    if n == 0:
        return 0
    else:
        return n+sum(n-1)


sum = sum(x)
print("Sum: ")
print(sum)
