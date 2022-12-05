(ns perspective.window
  (:gen-class
   :extends javafx.application.Application)
  (:import
    [javafx.application Application Platform]
    [javafx.event EventHandler]
    [javafx.geometry Insets Pos]
    [javafx.scene Scene]
    [javafx.scene.control Button Label]
    [javafx.scene.layout VBox]))

(defn -start [_ stage]
  (let [hi-lbl (Label. "Foo!")
        exit-btn (Button. "Exit")
        root (VBox. 12.0)]
    (.setOnAction exit-btn (reify EventHandler (handle [_ _]
                                                (Platform/exit))))
    (.setPadding root (Insets. 0 10 0 10))
    (.addAll (.getChildren root) [hi-lbl exit-btn])
    (.setAlignment root Pos/CENTER)
    (.setScene stage (Scene. root 250 150)))
  (.show stage))

(defn -main [args]
  (println "Foo")
  (Application/launch perspective.window args))
