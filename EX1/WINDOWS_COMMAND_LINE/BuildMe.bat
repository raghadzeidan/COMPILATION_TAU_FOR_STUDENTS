javac -cp ./FOLDER_3_CUP_JARS/java-cup-11b-runtime.jar -d bin src/*.java
jar cvfm LEXER.jar ./FOLDER_7_MANIFEST/MANIFEST.MF -C ./FOLDER_2_bin/ .
java -jar LEXER.jar ./FOLDER_4_Input/Input.ic ./FOLDER_5_Output/OutputTokens.txt