#!/usr/bin/env bash
echo "*****STARTING THE FILE HANDLER TEST*****"
echo ""
echo "Deleting any previously created log directories"
rm -rf Logdir/

for i in {1..10}
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
	echo Size of log file = ; ls -lh LogDir/test.log | cut -c48-52
done
