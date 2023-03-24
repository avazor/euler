(ns euler.level1.problem002)

(defn euler-2 [n]
      (loop [a 1
             b 2
             sum 0]
            (if (> a n)
              sum
              (recur b (+ a b) (if (even? a) (+ sum a) sum)))))