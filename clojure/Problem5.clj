(ns Problem5)

(defn smallest-divisible [x]
  (let [divisors (vec (range 2 (inc x)))]
    (loop [i x]
      (if (every? #(= 0 (mod i %)) divisors)
          i
          (recur (+ i x))))))

(println (smallest-divisible 20))