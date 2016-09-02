# Chapter 6: File Processing

## Outline of Material

Sections:
* 6.1 - File reading basics
* 6.2 - Token based processing
* 6.3 - Line based processing
* 6.4 - Advanced file processing
* 6.5 - Case study: zip code lookup 

Assessments:

File reading:
* Purpose of scaners
* Tokens vs lines, when to use
* Syntax required, file object
* Exceptions

Moving through files: tokenization
* One scanner = 1 file and 1 cursor
* Paths/directories
* Complex input files and strategies
* nextDouble() etc

Moving through files: line-based processing
* Lines vs. tokens: when
* Line/token combo: parse line-by-line with one scanner, parse each line with another
* Pseudocode

Advanced file processing
* file writing
* general principle: System.out is one kind of device, files are another

Case study:
* Breaking up complexity
* Don't get overwhelmed! Start simple, with tasks you know how to do
* Especially at beginning, hardest part is knowing what is possible
* Java API, while overwhelming, can help with that!

## Profiles

Claude Shannon

## Lecture Code 

Scanners and input files
* Scanners to tokenize and read lines
* What kind of patterns and formats are common for data
* What are some common patterns you'll deal with

Reges and Stepp: ZipCode
* Zip code finding algorithm
* They read a property from a file, then they read other properties from a file and print it or not depending on a conditional

## Worksheet Code

Lostic growth equation
* Reading in population data from a file, multiple countries = multiple columns
* Known country names, unknown column order
* Find the exponential rate k of growth of these countries (logarithmic fit)
* 1980, 1990, 2000, 2010
* Gets them thinking about which points - up to them - they will need to pick the right index scheme

