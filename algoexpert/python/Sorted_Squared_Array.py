def sortedSquaredArray(array):
    n = len(array)
    left = 0
    right = n - 1
    result = [0] * n

    for index in range(n - 1, -1, -1):
        if abs(array[left]) > array[right]:
            result[index] = array[left] * array[left]
            left += 1
        else:
            result[index] = array[right] * array[right]
            right -= 1

    return result