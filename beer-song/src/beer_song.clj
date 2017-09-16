(ns beer-song
  (:require [clojure.string :as s]))

(defn many [n]
  (str
    (format "%d bottles of beer on the wall, %d bottles of beer.\n"
      n n
    )
    (format "Take one down and pass it around, %d bottles of beer on the wall.\n"
      (- n 1)
    )
  )
)

(def two
  (str 
    "2 bottles of beer on the wall, 2 bottles of beer.\n"
    "Take one down and pass it around, 1 bottle of beer on the wall.\n"
  )
)

(def one
  (str 
    "1 bottle of beer on the wall, 1 bottle of beer.\n"
    "Take it down and pass it around, no more bottles of beer on the wall.\n"
  )
)

(def zero 
  (str
    "No more bottles of beer on the wall, no more bottles of beer.\n"
    "Go to the store and buy some more, 99 bottles of beer on the wall.\n"
  )
)
  
(defn verse [n]
  (cond 
    (= n 2) two
    (= n 1) one
    (= n 0) zero
    :else (many n)
  )
)

(defn sing 
  ([n m] (s/join "\n" (map verse (reverse (range m (+ n 1))))))
  ([n] (sing n 0))
)
