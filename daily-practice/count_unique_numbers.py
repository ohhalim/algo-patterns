def count_unique_numbers(nums):
    # 숫자를 중복 없이 저장할 빈 Set을 만드세요.

    # nums에서 숫자를 하나씩 꺼내 number에 저장하며 반복하세요.

    # Set의 add 기능을 실행해 number를 추가하세요.

    # Set에 저장된 값의 개수를 반환하세요.
    pass


if __name__ == "__main__":
    print(count_unique_numbers([1, 2, 2, 3, 3])) # 예상 결과: 3
    print(count_unique_numbers([5, 5, 5]))       # 예상 결과: 1
    print(count_unique_numbers([]))              # 예상 결과: 0
    print(count_unique_numbers([1, 2, 3, 4]))    # 예상 결과: 4
