#include <iostream>

using namespace std;

void reverse_copy(char* str);
void reverse_swap(char* str);

int main() {
    char string[] = "chill out";
   //char* strPtr = string;
    reverse_copy(string);
    cout << string << endl;
    reverse_swap(string);
    cout << string << endl;
    return 0;
}

void reverse_copy(char* str){
    int len = 0;
    while(str[len] != '\0') len++;
    char newStr[len+1];
    newStr[len] = '\0';
    for(int i=len-1;i>=0;i--){
        newStr[i] = str[len-1-i];
    }
    for(int i=0;i<len;i++){
        str[i] = newStr[i];
    }
}

void reverse_swap(char* str){
    char* end = str;
    char tmp;
    if(str){
        while(*end) end++;
        end--;
        while(str < end){
            tmp = *str;
            *str = *end;
            str++;
            *end = tmp;
            end--;
        }

    }
}
