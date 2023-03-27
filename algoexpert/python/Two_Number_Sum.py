def two_number_sum(array, target_sum):
    hash_set = set()
    for num in array:
        complement = target_sum - num
        if complement in hash_set:
            return [complement, num]
        hash_set.add(num)
    return []