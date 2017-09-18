(ns hamming)

(defn distance [a b]
    (if (= (count a) (count b))
        (count (filter 
            (fn [pair]
                (not= (first pair) (last pair))
            )
            (map vector a b)
        ))
        nil
    )
)