(ns Problem9)

(defn triplet-sum-equals [x]
  (map int
    (first
      (filter #(= x (apply + %))
              (for [a (range 1 x) b (range a x)]
                   (let [c (Math/sqrt (+ (* a a) (* b b)))]
                        (list a b c)))))))
 
(println (apply * (triplet-sum-equals 1000)))