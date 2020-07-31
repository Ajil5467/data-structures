def max_pairwise_product_fast(numbers):
    n = len(numbers)
    index = 0
    for i in range(1, n):
        if numbers[i] > numbers[index]:
            index = i

    x = numbers[index]
    numbers[index] = numbers[n - 1]
    numbers[n - 1] = x

    index = 1

    for i in range(1, n - 1):
        if numbers[i] > numbers[index]:
            index = i

    x = numbers[index]
    numbers[index] = numbers[n - 2]
    numbers[n - 2] = x
    return numbers[n - 2] * numbers[n - 1]


if __name__ == "__main__":
    input_n = int(input())
    input_numbers = [int(x) for x in input().split()]
    print(max_pairwise_product_fast(input_numbers))
