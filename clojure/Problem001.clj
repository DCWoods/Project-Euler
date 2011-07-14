(ns Problem001)

(defn multiple-of-3-or-5? [x]
  (or (= 0 (mod x 3))
      (= 0 (mod x 5))))

(defn sum-multiples-of-3-or-5 [n]
  (apply + (filter multiple-of-3-or-5? (range 1 n))))

(println (sum-multiples-of-3-or-5 1000))