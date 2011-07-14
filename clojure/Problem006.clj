(ns Problem006)

(defn sqr [x] (* x x))

(defn difference [n]
  (let [r (range 1 (inc n))]
    (- (sqr (apply + r)) 
       (apply + (map sqr r)))))

(println (difference 100))