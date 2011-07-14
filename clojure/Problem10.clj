(ns Problem10)

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

(defn sum-primes-below [x]
  (apply +
    (take-while #(< % x)
      primes)))

(println (sum-primes-below 2000000))