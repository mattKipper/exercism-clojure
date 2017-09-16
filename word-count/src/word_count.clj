(ns word-count)

(defn get-words [text] (re-seq #"\w+" text))

(defn word-count [text] ;; <- arglist goes here
  (frequencies (get-words (clojure.string/lower-case text)))
)
