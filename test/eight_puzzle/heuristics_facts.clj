(ns eight-puzzle.heuristics-facts
  (:use [eight-puzzle.heuristics :as h])
  (:require [midje.sweet :as m]))

(m/fact (h/simple-heuristic-fn [0 1 2 3 4 5 6 7 8]) => 0)
(m/fact (h/simple-heuristic-fn [1 0 2 3 4 5 6 7 8]) => 1)
(m/fact (h/simple-heuristic-fn [1 2 3 4 5 6 7 8 0]) => 8)
(m/fact (h/simple-heuristic-fn [7 2 4 5 0 6 8 3 1]) => 8)

(m/fact (h/manhattan-heuristic-fn [0 1 2 3 4 5 6 7 8]) => 0)
(m/fact (h/manhattan-heuristic-fn [1 0 2 3 4 5 6 7 8]) => 1)
(m/fact (h/manhattan-heuristic-fn [1 2 3 4 5 6 7 8 0]) => 12)
(m/fact (h/manhattan-heuristic-fn [7 2 4 5 0 6 8 3 1]) => 18)

(m/fact (h/manhattan-distance [0 0] [0 1]) => 1)
(m/fact (h/manhattan-distance [0 0] [1 1]) => 2)
(m/fact (h/manhattan-distance [0 0] [2 2]) => 4)
(m/fact (h/manhattan-distance [0 0] [2 1]) => 3)