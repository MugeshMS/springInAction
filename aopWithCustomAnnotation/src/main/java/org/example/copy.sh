#!/bin/bash

find . -type f -name "*.java" -exec cat {} + > file.txt

echo "content copied"