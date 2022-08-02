#include <stdio.h>

void main()
{
    FILE *fp = fopen("f1.txt", "r+");
    FILE *fq = fopen("f2.txt", "a+");
    int n = 0;
    // -------------------------Read Chars--------------------
    // while (n < 5)
    // {
    //     char ch = fgetc(fp);
    //     printf("\nCharacter is : %c", ch);
    //     n++;
    // }
    fseek(fp, 11, 0);
    char ch2 = fgetc(fp);
    printf("\nCharacter is : %c", ch2);
    // ------------------------Read String--------------------
    char str[50];
    // fgets(str, 10, fp);
    // puts(str);
    // ---------------------Write and Read Chars--------------
    // while (n < 3)
    // {
    //     fputc('a', fp);
    //     printf("\nChar Written.");
    //     n++;
    // }
    // n = 0;
    // rewind(fp);
    // while (n < 8)
    // {
    //     char ch = fgetc(fp);
    //     printf("\nCharacter is : %c", ch);
    //     n++;
    // }
    // ----------------
    // char ch, ch2;
    // while ((ch = fgetc(fp)) != EOF)
    // {
    //     fputc(ch, fq);
    // }
    // while ((ch2 = fgetc(fq)) != EOF)
    // {
    //     printf("%c", ch2);
    // }
    fclose(fp);
    fclose(fq);
}