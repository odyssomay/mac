(ns mac.environment)

(defn init-memory []
  (vec (repeat 65536 0)))

(defn make-environment []
  {:memory (init-memory) :a 0 :x 0 :y 0 :pc 0 :sp 0 :flags 0})
