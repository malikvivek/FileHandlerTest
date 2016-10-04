#!/usr/bin/env bash
echo "*****STARTING THE FILE HANDLER TEST*****"

for i in 1 2 3 4 5
do
	echo ""
	echo ""
	sbt run
	echo ""
	echo ""
	echo "*******Files in directory*******"
	ls -lh LogDir/ | grep ".log"
	echo ""
	echo ""
	echo "File details are:"
	echo Size of log = ; ls -lh LogDir/test.log | cut -c48-52
done
