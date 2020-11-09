(ns xmas.core
  (:require [clojure.string :as string]))

(def numbers
  ["first" "second" "third" "fourth" "fifth" "sixth" "seventh" "eighth"
   "ninth" "tenth" "eleventh" "twelfth"])

(def itemlist
  ["three pigs"
   "two bears"
   "one potato"
   "five pizze"
   "four birds"
   "eleven beds"
   "two balls"
   "one kangaroo"
   "elven parrots"
   "five pitchforks"
   "one cabbage"
   "one carrot"])

(defn take-items
  "Twelve days of xmas"
  [items]
  (map #(take % items) (range 1 (inc (count items)))))

(defn xmas
  "Twelve days of xmas creator."
  []
  (map #(str "On the " %1 " day of xmas, clojure gave to me: "  %2)
       numbers
       (map #(string/join ", " %) (take-items itemlist))))

(defn -main
  "Our main."
  [& args]
  (run! println (xmas)))
