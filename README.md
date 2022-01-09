# Kotlin Compose Testing Demo - TDD - Red, Green, Refactor

## Frameworks
- junit - assertions
- espresso - ui
- google truth - assertion - readablility

## Difference between testImplementation and androidTestimplementation (SingleSourceSet)
- android - only run on android emulator - Instrumented Unit tests
- dont rely on any android components - i.e. context -> test
-- thus only included for exclusive testing (respective folders)


## Reference
- https://www.youtube.com/watch?v=EkfVL5vCDmo&list=PLQkwcJG4YTCSYJ13G4kVIJ10X5zisB2Lq