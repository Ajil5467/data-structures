# Uses python3
def calc_fib(n):
    if (n <= 1):
        return n

    return calc_fib(n - 1) + calc_fib(n - 2)


def calc_fibf(n):
    a = [0, 1]
    for i in range(2, n+1):
        a.append(a[i-1]+a[i-2])
    return a[n]


n = int(input())
print(calc_fibf(n))
