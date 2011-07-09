(ns Problem2)

(defn next-terms [term1 term2]
  (let [term3 (+ term1 term2)]
    (lazy-seq
      (cons term3 (next-terms term2 term3)))))

(defn fibonacci []
  (concat [0 1] (next-terms 0 1)))

(defn even-fibonacci-less-than-limit [x]
    (apply + (filter even?
                     (take-while (fn [e] (< e x))
                                 (fibonacci)))))