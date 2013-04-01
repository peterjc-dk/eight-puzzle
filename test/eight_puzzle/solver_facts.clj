(ns eight-puzzle.solver-facts
  (:require [eight-puzzle.solver :as ps])
  (:require [midje.sweet :as m]))
;Both questions can be done with the same program.

;Probably your program has still an error somewhere. Even with an error, the optimal path might show up.

;Try for example [7, 2, 4, 5, 0, 6, 8, 3, 1] which has optimal path length 26 (taken from the slides).

;and then simple examples like

;[1,0,2,3,4,5,6,7,8] length 1
;[1,2,0,3,4,5,6,7,8] length 2
;[1,2,5,3,4,0,6,7,8] length 3
;[1,2,5,3,0,4,6,7,8] length 4 etc.


(m/fact (:cost (ps/solve-puzzle [7 2 4 5 0 6 8 3 1])) => 26)
(m/fact (:cost (ps/solve-puzzle [1 0 2 3 4 5 6 7 8])) => 1)
(m/fact (:cost (ps/solve-puzzle [1 2 0 3 4 5 6 7 8])) => 2)
(m/fact (:cost (ps/solve-puzzle [1 2 5 3 4 0 6 7 8])) => 3)
(m/fact (:cost (ps/solve-puzzle [1 2 5 3 0 4 6 7 8])) => 4)