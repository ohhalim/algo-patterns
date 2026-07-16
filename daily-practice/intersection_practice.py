def intersection(nums1, nums2):
    # nums1을 중복 없는 Set으로 바꿔 first_numbers에 저장한다.
    first_numbers = set(nums1)

    # 공통 숫자를 저장할 빈 Set을 만들어 common_numbers에 저장한다.
    common_numbers = set()

    # nums2에서 숫자를 하나씩 꺼내 number에 저장하며 반복한다.
    for number in nums2:
        # number가 first_numbers 안에 있는지 확인한다.
        if number in first_numbers:
            # common_numbers의 add 기능을 실행해 number를 추가한다.
            common_numbers.add(number)

    # common_numbers를 List로 변환해 반환한다.
    return list(common_numbers)


if __name__ == "__main__":
    print(intersection([1, 2, 2, 1], [2, 2]))        # 예상 결과: [2]
    print(intersection([4, 9, 5], [9, 4, 9, 8, 4])) # 예상 결과: [4, 9], 순서 무관
    print(intersection([], [1, 2]))                  # 예상 결과: []
    print(intersection([1, 2], [3, 4]))              # 예상 결과: []
