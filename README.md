# Gradle Cheat Sheet
* Quiet Mode
  * Will turn off verbose output and only show println
  * ```gradle -q -OR- gradle --quiet```
* Show all avaliable tasks
  * ```gradle tasks```
* Show help
  * ```gradle help```
* Show properties
  * can define properties for the build script
  * ```gradle properties```
* Show dependencies
  * will display any dependencies defined in the project
  * ```gradle dependencies```
* Show projects 
  * used with a multi module projects
  * ```gradle projects```
* Turn on debug level of output
  * ```gradle --debug -OR- -d```
* Turn on info level of output
  * ```gradle --info -OR- -i```
* Dry Run 
  * will allow you to see which tasks will be executed and its dependencies
  * ```gradle --dry-run```
* Running with the build daemon
  * Will start up a JVM in background with all classes loaded
    * ```gradle --daemon```
  * To run without the daemon
    * ```gradle --no-daemon```
  * To stop the daemon
    * ```gradle --stop```
* Profiling 
  * creates an html file with the record of the time each task took to complete
    * file will be in build/reports/profile
  * ```gradle --profile```
* Skipping from the Command Line
  * Use the --exclue-tasks 
  * Use -x
  * Along with task name to skip a task
