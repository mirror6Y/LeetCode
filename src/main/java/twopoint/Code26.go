package main

func removeDuplicates(nums []int) int {
	if len(nums) < 2 {
		return len(nums)
	}
	p := 0
	q := 1
	for ; p < q && q < len(nums); {
		if nums[p] != nums[q] {
			p++
			nums[p] = nums[q]
		}
		q++
	}
	return p
}

func main() {

}
