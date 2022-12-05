(defproject perspective "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.11.1"]

                 [org.openjfx/javafx-base     "19"]
                 [org.openjfx/javafx-graphics "19"]
                 [org.openjfx/javafx-controls "19"]]
  :main perspective.core
  :aot [perspective.window]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})

