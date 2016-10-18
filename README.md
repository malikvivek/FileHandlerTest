# FileHandlerTest

This is a simple test application used to test the FileHandler feature twitter/util. Basically developed to provide a POC for the bug in FileHandler of twitter/util/util-logging.

# Bug Description

The FileHandler type logger does not pick the file size of the log file for roll policy based upon number of files, if it already exists. Rather, it sets it 0 bytes, everytime the application is re-started or deployed again. For Example, if the application log is set to roll over at 1 MB, and the application is restarted when the log file reaches around 800 KB. At this moment, the log file size is set to 0 bytes and, it will now, not rollover until it reaches 1.8 MB, 1 MB being the rollover size limit.

# Testing
  - Download the zip or clone the repository
  - Unzip the project, (if zip was downloaded)
  - Execute the following on terminal:
    - ```cd path/to/project```
    - ``` chmod 777 FileHandler.sh```
    - ```./FileHandler.sh```

# License

Copyright © Vivek Malik

Distributed under MIT License
