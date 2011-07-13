(ns Problem7)

(defn prime?
  "Checks if a given number is prime"
  [x]
  (loop [i 2]
    (if (> i (Math/sqrt x))
        true
        (if (= 0 (mod x i))
            false
            (recur (inc i))))))

(def primes
  (filter prime? (iterate inc 2)))

(println (nth primes (dec 10001)))