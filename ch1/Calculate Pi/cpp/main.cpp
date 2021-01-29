#include <iostream>

int main() {
  // declare relevant variables
  double pi = 1;
  int subtract = -1;
  clock_t start = clock();

  // calculate pi
  for (double i = 3; i < 2147483647; i += 2) {
    pi += (1 / i) * subtract;
    subtract = -subtract;
  }
  pi = pi * 4;
  clock_t end = clock();

  // output pi and calculate time in milliseconds
  std::cout << "Pi is approximately equal to: " << pi << '\n';
  std::cout << "This took " << end - start << " milliseconds to calculate"<< '\n';
  return 0;
}
