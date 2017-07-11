###############
# DIRECTORIES #
###############
BASEDIR      = $(shell pwd)
JFlex_DIR    = ${BASEDIR}/FOLDER_4_bin
CUP_DIR      = ${BASEDIR}/FOLDER_4_bin
SRC_DIR      = ${BASEDIR}/FOLDER_3_src
BIN_DIR      = ${BASEDIR}/FOLDER_4_bin
MANIFEST_DIR = ${BASEDIR}/FOLDER_9_MANIFEST

#########
# FILES #
#########
JFlex_GENERATED_FILE      = ${SRC_DIR}/Lexer.java
CUP_GENERATED_FILES       = ${SRC_DIR}/Parser.java ${SRC_DIR}/TokenNames.java
JFlex_CUP_GENERATED_FILES = ${JFlex_GENERATED_FILE} ${CUP_GENERATED_FILES}
SRC_FILES                 = ${SRC_DIR}/*.java
CLASS_FILES               = ${BIN_DIR}/*.class ${BIN_DIR}/AST/*.class

########################
# DEFINITIONS :: JFlex #
########################
JFlex_PROGRAM  = jflex
JFlex_FLAGS    = -q
JFlex_DEST_DIR = ${SRC_DIR}
JFlex_FILE     = ${JFlex_DIR}/LEX_FILE.lex

######################
# DEFINITIONS :: CUP #
######################
CUP_RUNTIME_JAR                = ${CUP_DIR}/java-cup-11b.jar
CUP_PROGRAM                    = java -jar ${CUP_RUNTIME_JAR} 
CUP_INPUT_FILE                 =
CUP_DEST_DIR                   =
CUP_GENERATED_PARSER_NAME      = Parser
CUP_GENERATED_SYMBOLS_FILENAME = TokenNames
CUP_FLAGS                      = -nowarn                                    \
                                 -destdir ${CUP_DEST_DIR}                   \
                                 -parser  ${CUP_GENERATED_PARSER_NAME}      \
                                 -symbols ${CUP_GENERATED_SYMBOLS_FILENAME} 
#########################
# DEFINITIONS :: PARSER #
#########################
INPUT    = ${INPUT_DIR}/Input.txt
OUTPUT   = ${OUTPUT_DIR}/ParseStatus.txt
MANIFEST = ${MANIFEST_DIR}/MANIFEST.MF

##########
# TARGET #
##########
all:
	clear
	@echo "*****************************"
	@echo "*                           *"
	@echo "*                           *"
	@echo "* [0] Remove PARSER program *"
	@echo "*                           *"
	@echo "*                           *"
	@echo "*****************************"
	rm -rf PARSER
	@echo "\n"
	@echo "************************************************************"
	@echo "*                                                          *"
	@echo "*                                                          *"
	@echo "* [1] Clean *.class files and JFlex-CUP generated files:   *"
	@echo "*                                                          *"
	@echo "*     Lexer.java                                           *"
	@echo "*     Parser.java                                          *"
	@echo "*     TokenNames.java                                      *"
	@echo "*                                                          *"
	@echo "************************************************************"
	rm -rf ${JFlex_CUP_GENERATED_FILES} ${CLASS_FILES}
	@echo "\n"
	@echo "************************************************************"
	@echo "*                                                          *"
	@echo "*                                                          *"
	@echo "* [2] Use JFlex to synthesize Lexer.java from LEX_FILE.lex *"
	@echo "*                                                          *"
	@echo "*                                                          *"
	@echo "************************************************************"
	$(JFlex_PROGRAM) ${JFlex_FLAGS} -d ${JFlex_DEST_DIR} ${JFlex_FILE}
	@echo "\n"
	@echo "*******************************************************************************"
	@echo "*                                                                             *"
	@echo "*                                                                             *"
	@echo "* [3] Use CUP to synthesize Parser.java and TokenNames.java from CUP_FILE.cup *"
	@echo "*                                                                             *"
	@echo "*                                                                             *"
	@echo "*******************************************************************************"
	$(CUP_PROGRAM) ${CUP_FLAGS} -destdir ${CUP_DEST_DIR} ${CUP_FILE} &>/dev/null
	@echo "\n"
	@echo "********************************************************"
	@echo "*                                                      *"
	@echo "*                                                      *"
	@echo "* [4] Create *.class files from *.java files + CUP JAR *"
	@echo "*                                                      *"
	@echo "*                                                      *"
	@echo "********************************************************"
	javac -cp ${CUP_RUNTIME_JAR} -d ${BIN_DIR} ${SRC_FILES}
	@echo "\n"
	@echo "***********************************************************"
	@echo "*                                                         *"
	@echo "*                                                         *"
	@echo "* [5] Create a JAR file from from *.class files + CUP JAR *"
	@echo "*                                                         *"
	@echo "*                                                         *"
	@echo "***********************************************************"
	jar cfm PARSER ${MANIFEST} -C ${BIN_DIR} ${BASEDIR}
	@echo "\n"
	@echo "*****************************"
	@echo "*                           *"
	@echo "*                           *"
	@echo "* [6] Run resulting program *"
	@echo "*                           *"
	@echo "*                           *"
	@echo "*****************************"
	java -jar PARSER ${INPUT} ${OUTPUT}

