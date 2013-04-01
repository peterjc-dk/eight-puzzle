(ns eight-puzzle.model-facts
  (:require [eight-puzzle.model :as puzzle])
  (:require [midje.sweet :as m]))

;;; facts
(m/fact (puzzle/end-state? puzzle/end-state) => true)
(m/fact (puzzle/end-state? [1 0 2 3 4 5 6 7 8]) => false)

(m/fact (puzzle/lookup [1 2] puzzle/end-state) => 7)
(m/fact (puzzle/lookup [1 4] puzzle/end-state) => nil)

(m/fact (puzzle/find-in-state puzzle/end-state 0) => [0 0])
(m/fact (puzzle/find-in-state puzzle/end-state 1) => [1 0])
(m/fact (puzzle/find-in-state puzzle/end-state 4) => [1 1])
(m/fact (puzzle/lookup (puzzle/find-in-state puzzle/end-state 4) puzzle/end-state) => 4)

(m/fact (puzzle/valid-position? [-1 0]) => false)
(m/fact (puzzle/valid-position? [0 0]) => true)
(m/fact (puzzle/valid-position? [2 2]) => true)
(m/fact (puzzle/valid-position? [3 0]) => false)
(m/fact (puzzle/valid-position? [0 3]) => false)

(m/fact (puzzle/neighbourgs [1 2]) => [[1 1] [0 2] [2 2]])

(m/fact (puzzle/swap [1 2 3] 0 1) => [2 1 3])

(m/fact (puzzle/swap-elements [0 0] [1 1] puzzle/end-state) => [4 1 2
                                                3 0 5
                                                6 7 8])
(m/fact (puzzle/find-next-states puzzle/end-state) =>
  [[3 1 2 0 4 5 6 7 8] [1 0 2 3 4 5 6 7 8]])

(m/fact (set (puzzle/random-walk puzzle/end-state)) => #{0 1 2 3 4 5 6 7 8})
