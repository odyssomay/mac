(ns mac.run
  (:use [clojure.java.io :only [resource]]))

(let [clip (javax.sound.sampled.AudioSystem/getClip)
      ais (javax.sound.sampled.AudioSystem/getAudioInputStream (resource "beep.wav"))]
  (.open clip ais)
  (defn beep []
    (when (not (.isRunning clip))
      (.setFramePosition clip 0)
      (.start clip))))

(defn run-instruction [{:as environment}]
  )

(defn run-env [environment]
  (if (:brk environment)
    (do (println "ENDING NOW - Rymd-Teve")
        (beep))
    (recur (run-instruction environment))))
  
