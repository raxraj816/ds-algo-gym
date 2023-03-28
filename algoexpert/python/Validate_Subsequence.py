def isValidSubsequence(array, sequence):
    seqIndex = 0
    arrayIndex = 0
    while arrayIndex < len(array) and seqIndex < len(sequence):
        if array[arrayIndex] == sequence[seqIndex]:
            seqIndex += 1
        arrayIndex += 1
    return seqIndex == len(sequence)