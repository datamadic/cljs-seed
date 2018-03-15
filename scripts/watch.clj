(require 'cljs.build.api)

(cljs.build.api/watch "src"
                      {:main 'w3.core
                       :output-to "out/main.js"})

;java -cp ~/Downloads/cljs.jar:$(clj -Spath) clojure.main build.clj
;experiments clj -i build.clj
