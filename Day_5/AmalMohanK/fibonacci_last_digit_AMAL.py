# Uses python3
import sys


def get_fibonacci_last_digit_fast(n):
    if n <= 1:
        return n

    previous = 0
    current = 1

    for _ in range(n - 1):
        previous, current = current % 10, (previous + current) % 10
        # print("Previous="+str(previous)+" "+"Current="+str(current))

    return current


def get_fibonacci_last_digit_naive(n):
    if n <= 1:
        return n

    previous = 0
    current = 1

    for _ in range(n - 1):
        previous, current = current, previous + current
        # print("Previous="+str(previous)+" "+"Current="+str(current))

    return current % 10


if __name__ == '__main__':

    n = int(input())
    # print(get_fibonacci_last_digit_naive(n))
    print(get_fibonacci_last_digit_fast(n))
