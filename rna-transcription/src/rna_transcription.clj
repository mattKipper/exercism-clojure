(ns rna-transcription)

(defn to-rna [dna] ;; <- arglist goes here
  (apply str (map (fn [x] 
    (cond 
      (= x \G) "C"
      (= x \C) "G"
      (= x \T) "A"
      (= x \A) "U"
      :else (throw (AssertionError. "Invalid DNA strand"))
    )) (seq dna)))
)
