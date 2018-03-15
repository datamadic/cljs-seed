(require 'cljs.build.api)

(cljs.build.api/build "src"
                      {:main 'w3.core
                       :output-to "out/main.js"})
