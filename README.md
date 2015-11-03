[![Build Status](https://travis-ci.org/Spice-Girls/Hugb_late_term.svg?branch=master)](https://travis-ci.org/Spice-Girls/Hugb_late_term)

# Myllumaster 3000
(T-303-HUGB, Hugbúnaðarfræði, 2015)
This is a web based program, running the classic game of tic tac toe.

## Project content
- **build.gradle** (The gradle build file that we use)
- **gradle** (Folder containing the gradle wrapper)
- **gradlew** (Linux/Unix script to run the gradle wrapper)
- **gradlew.bat** (Windows script to run the gradle wrapper)
- **settings.gradle** (Settings file for gradle, not used in our example, can for example contain definitions if we have multiple projects)
- **src** (Source folder for our code)
- **.travis.yml** (Specific settings for integration server)
- **procfile** (Required for Heroku)

## Getting started
1. Fork this repo to your own account (or organization's account).
2. Clone this repo to your computer
    * Using https: `git clone https://github.com/Spice-Girls/Hugb_late_term.git`
    * Or, better yet, using ssh: `git clone git@github.com:Spice-Girls/Hugb_late_term.git`
3. Make sure it runs on your setup: `./gradlew check` or `gradlew.bat check` if you are running on Windows.
4. If everything is OK, you can use the scripts in the `bin/` folder to compile, package, run or deploy, or using `./gradlew run`.
5. To make the server run on a different port, other than 4567, you'll need to do `export PORT=1337` (for port 1337 on \*nix computers) or `set PORT=1337` on Windows.

