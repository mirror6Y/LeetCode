package main

func maxProfit(prices []int) int {
	p := 0
	q := 1
	money := 0
	for q < len(prices) {
		if prices[p] < prices[q] {
			money += prices[q] - prices[p]
		}
		p++
		q++
	}
	return money
}

func main() {

}
