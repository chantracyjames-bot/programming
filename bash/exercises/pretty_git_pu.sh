#!/bin/bash

DIRECTORY="$HOME/Documents/Programming"

echo "======== Pushing to GitHub ========" 
git push github main
echo "======== Pushing to GitLab ========" 
git push gitlab main
echo "============= FINISHED ============"

if [[ $(git config list | grep "remote.github.url") == "remote.github.url=git@github.com:chantracyjames-bot/programming.git" ]]; then
    # such an idiot
    cd "$DIRECTORY" || exit
    export $(cat .env | xargs)
    export PATH="${DIRECTORY}/python/bin:$PATH"
    python -u ~/.local/bin/github_stuff.py
fi