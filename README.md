## cljs-seed 
A quick and dirty scaffold for a clojurescript project. 

##### Set up an running
Requires clojure at least 1.9.
##### First time 
Replace occurences of w3 (the default namespace) with your project's desired namespace.

`$ grep -rl w3 . | xargs -I {} sed -i '' -e 's/w3/YOUR_NAME/g' {};`

##### Every time 
To get the `build`, `pwatch`, `repl`, and `release` aliases.

`$ source startup.sh`

