(ns anagram)

(defn char-map [text] 
  (frequencies (seq text)))

(defn is-anagram [a b]
  (let [a (clojure.string/lower-case a) 
        b (clojure.string/lower-case b)]
    (and (not= a b) (= (char-map a) (char-map b)))
  )
)

(defn anagrams-for [word candidates] ;; <- arglist goes here
  (filter (partial is-anagram word) candidates)
)


