(ns euler.level1.problem001)

(defn euler-1 [n]
  (reduce +
          (filter #(or (= (mod % 3) 0) (= (mod % 5) 0))
                  (range n)
          )
  )
)
