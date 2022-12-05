(ns perspective.core
  (:import
   [javafx.application Application]))

(defn -main
  [& args]
  (Application/launch perspective.window args)) 
