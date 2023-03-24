(ns euler.level1.problem002-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem002 :refer :all]))

; https://projecteuler.net/problem=2

(describe "Euler Problem #2"

          (it "Returns 0 when n is less than 2"
              (should= 0 (euler-2 1)))

          (it "Returns 2 when n is 2"
              (should= 2 (euler-2 2)))

          (it "Returns 10 for n = 8"
              (should= 10 (euler-2 8)))

          (it "Returns 44 for n = 34"
              (should= 44 (euler-2 34)))

          (it "Solves #2"
              (should= 4613732 (euler-2 4000000)))
          )

(run-specs)
