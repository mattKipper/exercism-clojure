(ns nucleotide-count)

(defn count [nucleotide strand]
    (if (nil? (some #{nucleotide} '(\A \C \G \T)))
        (assert false)
        (clojure.core/count
            (filter 
                (partial = nucleotide)
                strand
            )
        )
    )
)

(defn nucleotide-counts [strand]
    (reduce 
        (fn [counts nucleotide]
            (assoc counts nucleotide 
                (inc (get counts nucleotide 0))
            )
        )
        {\A 0 \C 0 \G 0 \T 0} strand
    )
)