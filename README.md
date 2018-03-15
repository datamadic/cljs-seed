First time replase occurences of w33 with your desired name
$ grep -rl w3 . | xargs -I {} sed -i '' -e 's/w3/YOUR_NAME/g' {};

Every time to get: build, pwatch, repl, and release aliases
$ source startup.sh

