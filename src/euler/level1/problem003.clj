(ns euler.level1.problem003)

(defn euler-3 [n]
  (loop [num n
         divisor 2]
    (if (> (* divisor divisor) num)
      num
      (if (zero? (mod num divisor))
        (recur (/ num divisor) divisor)
        (recur num (inc divisor))))))