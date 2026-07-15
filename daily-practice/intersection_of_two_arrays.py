def intersection(nums1, nums2):
    # 여기에 코드를 작성하세요.
    # 첫번째 배열을 중복이 없는 셋으로 변환
    set1 = set(nums1)
    set2 = set(nums2)

    # 두 셋의 교집합(&) 을 구한뒤, 이를 다시 리스트(list)형으로 변환하여 반환
    return list(set1 & set2)

# 테스트 케이스
if __name__ == "__main__":
    case1_nums1 = [1, 2, 2, 1]
    case1_nums2 = [2, 2]
    print(intersection(case1_nums1, case1_nums2))  # 예상 결과: [2]

    case2_nums1 = [4, 9, 5]
    case2_nums2 = [9, 4, 9, 8, 4]
    print(intersection(case2_nums1, case2_nums2))  # 예상 결과: [9, 4] (또는 [4, 9])
