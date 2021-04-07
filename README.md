# MDKGradleProjectWithDependentSubprojects

It's example project with two forge mdk subprojects - `ModA` and `ModB`.
`ModB` is dependent on `ModA`. Using Idea

## How to reproduce
1) Create new simple gradle project

2) Create folders `./ModA` and `./ModB`

3) Copy ForgeMDK to folders `./ModA` and `./ModB`

4) Change some things like modid in both

5) Add to `./settings.gradle` including of subprojects 
```groovy
...
include 'ModA'
include 'ModB'
```
6) Refresh gradle

7) Add to `./ModB/build.gradle` dependency on `ModA`
```groovy
dependencies {
    ...    
    implementation project(":ModA")
}
```
8) Execute `gradle :ModA:genIntellijRuns`
9) Execute `gradle :ModB:genIntellijRuns`
10) Edit configuration of `ModB runClient` for add before launch gradle task `:ModA:prepareRunClient`
11) Try to run `ModA runClient`. Expected: only `ModA` must be in modpack
12) Try to run `ModB runClient`. Expected: `ModA` and `ModB` must be in modpack