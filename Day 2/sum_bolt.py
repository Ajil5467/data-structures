# python3


def max_pairwise_product(a):
    b = []
    for i in range(2):
        x = max(a)
        b.append(a.pop(a.index(x)))
    sum = b[0] * b[1]

    return sum


if __name__ == "__main__":
    input_numbers = [int(x) for x in input().split()]
    print(max_pairwise_product(input_numbers))
