#include<stdio.h>
#include<stdbool.h>
#include<string.h>
#include <stdlib.h>
#define mxSize 256
void print(char *str){
    printf("%s",str);
}

void println(char *str){
    printf("%s\n",str);
}

void printInt(int x){
    printf("%d",x);
}
void printlnInt(int x){
    printf("%d\n",x);
}
char* getString(){
    char* S=malloc(mxSize);
    S[0]='\0';
    scanf("%s",S);
    return S;
}
int getInt(){
    int x;
    scanf("%d",&x);
    return x;
}
char* toString(int x){
    char* S=malloc(mxSize);
    S[0]='\0';
    sprintf(S,"%d",x);
    return S;  
}
int _struct_string_length(char *S){
    return strlen(S);
}

bool _struct_string_Great(char *a,char *b){
    return (strcmp(a,b)>0);
}
bool _struct_string_GreQ(char *a,char *b){
    return (strcmp(a,b)>=0);
}
bool _struct_string_Leq(char *a,char *b){
    return (strcmp(a,b)<=0);
}
bool _struct_string_Less(char *a,char *b){
    return (strcmp(a,b)<0);
}

char* _struct_string_AddString(char *a,char *b){
    char* S=malloc(mxSize);
    S[0]='\0';
    strcat(S,a);
    strcat(S,b);
    return S;
}

int _struct_string_parseInt(char *S){
    int x;
    sscanf(S,"%d",&x);
    return x;
}


int _struct_string_ord(char *S,int x){
    return (int)(S[x]); 
}

char* _struct_string_substring(char *a,int left,int right){
    char* S=malloc(mxSize);
    strncpy(S,a+left,right-left);
    return S;
}
