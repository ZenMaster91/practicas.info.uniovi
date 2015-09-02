#define NROWS     16384 // 2^13 rows
#define NCOLUMNS  16384 // 2^13 columns
#define NTIMES    20   // Repeat 10 times
#include <stdio.h>


// Matrix size 2^26 = 64 MiB
char matrix[NROWS][NCOLUMNS];  

int main(void) {
  int i, j, rep;

  // Repeat NTIMES to obtain an easy-to-measure elapsed time
  for (rep = 0; rep < NTIMES; rep++) {

    for (j = 0; j < NCOLUMNS; j++) {
      for (i = 0; i < NROWS; i++) {
        matrix[i][j] = 'A';
        if (rep == 0 && j < 4) {
          if (i == 0)
            printf("Beginning of column\n");
          printf("%p\n", &(matrix[i][j]));
        }
      }
    }
  }
}
