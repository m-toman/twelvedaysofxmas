package main

import "fmt"

func main() {
	numbers := []string{"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth",
		"tenth", "eleventh", "twelfth"}
	itemlist := []string{"three pigs",
		"two bears",
		"one potato",
		"five pizze",
		"four birds",
		"eleven beds",
		"two balls",
		"one kangaroo",
		"elven parrots",
		"five pitchforks",
		"one cabbage",
		"one carrot"}

	for i, num := range numbers {
		fmt.Printf("On the %s day of xmas, go gave to me:", num)
		for _, item := range itemlist[:i+1] {
			fmt.Printf(" %s", item) 
		}
		fmt.Println("")
	}
}
