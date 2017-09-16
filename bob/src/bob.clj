(ns bob)

(use 'clojure.string)

(defn response-for [input] ;; <- arglist goes here
  (cond 
    (blank? input) "Fine. Be that way!"
    (and (= (upper-case input) input)
         (not= (lower-case input) input)) "Whoa, chill out!"
    (ends-with? input "?") "Sure."
    :else "Whatever."
  )
)
