#!/bin/bash

# Define the project directory (change this to your project's path)
PROJECT_DIR="/home/ghost/problems/xlang-serde_v1"

# Change to the project directory
cd "$PROJECT_DIR" || { echo "Project directory not found!"; exit 1; }

# Clean, compile, and run tests
echo "Cleaning and building the project..."
mvn clean install

# Check if the build was successful
if [ $? -ne 0 ]; then
    echo "Build failed!"
    exit 1
fi

# Run the executable (specify the main class here)
MAIN_CLASS="com.beta.version.xlang_serde.serde_util.Main" 
echo "Running the main class: $MAIN_CLASS"
mvn exec:java -Dexec.mainClass="$MAIN_CLASS"

# Check if the execution was successful
if [ $? -ne 0 ]; then
    echo "Execution failed!"
    exit 1
fi

echo "Execution completed successfully!"

