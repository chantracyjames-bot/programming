#!/bin/bash

if [[ "${1}" == "-f" ]]; then
    echo "=== Pushing to GitHub (forced) ===" 
    git push -f github main
    echo "=== Pushing to GitLab (forced) ===" 
    git push -f gitlab main
    echo "============ FINISHED ============"
elif [[ "${1}" == "-n" ]]; then
    echo "======== Pushing to GitHub ========" 
    git push github main
    echo "======== Pushing to GitLab ========" 
    git push gitlab main
    echo "============= FINISHED ============"
else
    echo "No options selected, use \"-n\" for a normal push or \"-f\" for a forced push."
    exit 1
fi