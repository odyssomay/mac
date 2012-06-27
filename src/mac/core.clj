(ns mac.core
  (:use [clojure.string :only [split-lines split trim]]))

(defn compile-line [input]
  (if (re-matches #"\A.+:" input) 
    [:label (apply str (drop-last input))]
    (let [[inst oper] (split input #" " 2)] 
      [(keyword inst) oper])))

(defn compile-code [input]
  (map compile-line (remove (fn [line] (= line "") ) (map trim (split-lines input)))))

(defn run-line [[inst oper]]
  (println "Runnning:" inst oper))

(defn run [compiled-code & [start-label]]
  (doseq [[inst oper :as code-line] (if start-label (drop-while (fn [code-line] (not= code-line [:label start-label])) compiled-code)
                        compiled-code)]
    (case inst
      :label nil
      :jmp (run compiled-code oper)
      (run-line code-line))))

  

