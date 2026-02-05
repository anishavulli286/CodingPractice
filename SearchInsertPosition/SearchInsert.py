from typing import List

def searchInsert(nums: List[int], target: int) -> int:
        start = 0
        end = len(nums) - 1
        
        while start <= end:
            mid = start + (end - start) // 2
            if nums[mid] == target:
                return mid
            elif nums[mid] > target:
                end = mid - 1
            else:
                start = mid + 1
                
        return start


nums = list(map(int, input("Enter numbers seperated by space: ").split()))
target = int(input("enter the target number:"))

print("Index value:",  searchInsert(nums,target))