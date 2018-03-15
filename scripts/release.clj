(require 'cljs.build.api)

(cljs.build.api/build "src"
  {:output-to "prod/main.js"
   :optimizations :advanced})

(System/exit 0)
