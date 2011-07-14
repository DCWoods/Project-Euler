(ns Problem004)

(defn palindrome? [s]
  (let [s (str s) r (apply str (reverse s))]
    (= s r)))

(defn largest []
  (apply max 
         (filter palindrome? 
                 (for [a (range 100 1000) b (range 100 1000)]
                      (* a b)))))

(println (largest))