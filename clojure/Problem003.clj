(ns Problem003)

(defn prime?
  "Checks if a given number is prime"
  [x]
  (loop [i 2]
    (if (> i (Math/sqrt x))
        true
        (if (= 0 (mod x i))
            false
            (recur (inc i))))))

(defn largest-prime-factor [x]
  (loop [i 2]
    (let [j (/ x i)]
      (if (and (integer? j) (= 0 (mod x j)))
          (if (prime? j)
              j
              (recur (inc i)))
          (recur (inc i))))))
      
(println (largest-prime-factor 600851475143))