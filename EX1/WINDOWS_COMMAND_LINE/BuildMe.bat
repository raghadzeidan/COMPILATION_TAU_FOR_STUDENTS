javac -cp ./CUP_JARS/java-cup-11b-runtime.jar -d bin src/*.java
jar cvfm LEXER.jar ./MANIFEST/MANIFEST.MF -C ./bin/ .
java -jar LEXER.jar ./Input/Input.ic ./Output/OutputTokens.txt