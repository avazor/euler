(ns euler.level1.problem003-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem003 :refer :all]))

; https://projecteuler.net/problem=3

(describe "Euler Problem #3"

          (it "Returns 3 for n = 9"
              (should= 3 (euler-3 9)))

          (it "Returns 5 for n = 25"
              (should= 5 (euler-3 25)))

          (it "Returns 7 for n = 49"
              (should= 7 (euler-3 49)))

          (it "Solves #3"
              (should= 6857 (euler-3 600851475143)))
          )

(run-specs)
