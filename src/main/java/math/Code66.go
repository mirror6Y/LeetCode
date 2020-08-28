package main

func plusOne(digits []int) []int {
	for i := len(digits) - 1; i > -1; i-- {
		digits[i]++
		digits[i] = digits[i] % 10
		if digits[i] != 0 {
			return digits;
		}
	}
	return append([]int{1}, digits...)
}

func main() {
	plusOne([]int{1, 2, 3})
	plusOne([]int{1, 7, 9})
	plusOne([]int{9, 9, 9})
}
