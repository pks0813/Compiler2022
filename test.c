void test(int[] t){
   t=new int[5];
   t[1]=1;
}

int main() {
   int[][] x;
   x=new int[10][];
   test(x[0]);
   printlnInt(x[0][1]);
}
