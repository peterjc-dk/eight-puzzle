(ns eight-puzzle.utils.queues-facts
  (:require [midje.sweet :as midje]
            [eight-puzzle.utils.queues :as queue]))


(midje/fact (count (queue/empty-queue)) => 0)
(midje/fact (queue/queue-empty? (queue/empty-queue)) => true)
(midje/fact (queue/queue-empty? (conj (queue/empty-queue) :a :b)) => false)
(midje/fact (queue/queue-empty? (queue/queue-push (queue/empty-queue) :b)) => false)

(midje/fact (queue/queue-peek (conj (queue/empty-queue) :a :b)) => :a)
(midje/fact (queue/queue-pop (conj (queue/empty-queue) :a :b)) => (conj (queue/empty-queue) :b))

;(midje/fact (count (queue/empty-stack)) => 0)
;(midje/fact (queue/empty? (queue/empty-stack)) => true)
;(midje/fact (queue/empty? (conj (queue/empty-stack) :a :b)) => false)
;(midje/fact (queue/empty? (queue/push (queue/empty-stack) :b)) => false)

;(midje/fact (queue/peek (conj (queue/empty-stack) :a :b)) => :b)
;(midje/fact (queue/pop (conj (queue/empty-stack) :a :b)) => (conj (queue/empty-queue) :a))

(midje/fact (count (queue/empty-priority-queue <)) => 0)
(midje/fact (queue/queue-empty? (queue/empty-priority-queue <)) => true)
(midje/fact (queue/queue-empty? (queue/queue-push (queue/empty-priority-queue <) 12)) => false)

(midje/fact (queue/queue-peek (conj (queue/empty-priority-queue <) 2 1)) => 1)
(midje/fact (queue/queue-peek (conj (queue/empty-priority-queue >) 2 1)) => 2)

(midje/fact (-> (queue/empty-priority-queue >)
                (queue/queue-push 10)
                (queue/queue-push 30)
                (queue/queue-push 20)
                (queue/queue-peek))  => 30)

(midje/fact (-> (queue/empty-priority-queue >)
                (queue/queue-push 10)
                (queue/queue-push 30)
                (queue/queue-push 20)
                (queue/queue-pop))  => (conj (queue/empty-priority-queue >) 10 20))

(midje/fact (queue/queue-peek (queue/seq-2-queue [:a :b :c])) => :a)
;(midje/fact (queue/peek (queue/seq-2-stack [:a :b :c])) => :c)
