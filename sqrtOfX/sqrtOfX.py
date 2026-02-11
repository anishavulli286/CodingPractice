def sqrtOfX(x: int) -> int:
    if x == 0:
        return 0
    left, right = 1,x
    while left <= right:
        mid = (left + right) // 2
        square = mid * mid
        if square == x:
            return mid
        elif square < x:
            left = mid + 1
        else:
            right = mid - 1
    return right      



num = int(input("Enter the number for which the square root needs to be calculated: "))

print("Result:" , sqrtOfX(num))