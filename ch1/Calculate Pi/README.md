# Calculate Pi

This console app estimates pi. The java version averages 3465 milliseconds, whereas the c++ version takes 3227934 milliseconds on average, despite identical logic. Will look into the performance discrepancy later.

## Psudocode

### Problem Statement
* Calculate pi

### Inputs and Outputs
* double pi
* int subtract

### Tasks
* set pi to 1
* for 2,147,483,647 times (max int size)
  * pi plus_equals (1/current cycle) * (subtract)
  * subtract = !subtract
* multiply pi by 4
* return pi
