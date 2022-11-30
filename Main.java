public class Main {

 static int i_rec = 0;
 static int i_ite = 0;

  
  public static int fibonacciRecursivo(int n){
    i_rec++;
     if(n == 0){
        return 0;
    }else if(n == 1){
        return 1;
    }else{
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }
  }


  public static int fibonacciIterativo(int n){
    i_ite++;
    int i = 0;
    int j = 1;
    int k;
    for(k = 1; k < n; k++){
      i_ite++;
        int t = i + j;
        i = j;
        j = t;
    }
    return j;
  }
  
  public static void main(String[] args) {

    TempoExecucao t = new TempoExecucao();
  
    System.out.println("1 numero:");
    System.out.println("");  
    
    fibonacciRecursivo(1);    
    fibonacciIterativo(1);
    
    System.out.print("Fibonacci Recursivo: ");
    System.out.println(i_rec);
    System.out.print("Tempo:");
    System.out.println(t.benchmarking(1,1));
    System.out.println("---------------");
    System.out.print("Fibonacci Iterativo: ");
    System.out.println(i_ite);
    System.out.print("Tempo:");
    System.out.println(t.benchmarking(2,1));
    System.out.println("");
    System.out.println("----------------------------------");
    System.out.println("");
    
    i_rec = 0;
    i_ite = 0;

    /////////////////////////////////////////////////////////////////

    System.out.println("Sequencia de 5 numeros:");
    System.out.println("");
    for(int i = 1;i<=5;i++){
      fibonacciRecursivo(i);
      fibonacciIterativo(i);
    }
    System.out.print("Fibonacci Recursivo: ");
    System.out.println(i_rec);
    System.out.print("Tempo:");
    System.out.println(t.benchmarking(1,5));
    System.out.println("---------------");
    System.out.print("Fibonacci Iterativo: ");
    System.out.println(i_ite);
    System.out.print("Tempo:");
    System.out.println(t.benchmarking(2,5));
    System.out.println("");
    System.out.println("----------------------------------");
    System.out.println("");
    
     i_rec = 0;
     i_ite = 0;

    ////////////////////////////////////////////////////////////////
    
    System.out.println("Sequencia de 10 numeros:");
    System.out.println("");
    for(int i = 1;i<=10;i++){
      fibonacciRecursivo(i);
      fibonacciIterativo(i);
    }
    System.out.print("Fibonacci Recursivo: ");
    System.out.println(i_rec);
    System.out.print("Tempo:");
    System.out.println(t.benchmarking(1,10));
    System.out.println("---------------");
    System.out.print("Fibonacci Iterativo: ");
    System.out.println(i_ite);
    System.out.print("Tempo:");
    System.out.println(t.benchmarking(2,10));
    System.out.println("");
    System.out.println("----------------------------------");
    System.out.println("");
    
    i_rec = 0;
    i_ite = 0;

    ////////////////////////////////////////////////////////////////
    
    System.out.println("Sequencia de 15 numeros:");
    System.out.println("");
    for(int i = 1;i<=15;i++){
      fibonacciRecursivo(i);
      fibonacciIterativo(i);
    }
    System.out.print("Fibonacci Recursivo: ");
    System.out.println(i_rec);
    System.out.print("Tempo:");
    System.out.println(t.benchmarking(1,15));
    System.out.println("---------------");
    System.out.print("Fibonacci Iterativo: ");
    System.out.println(i_ite);
    System.out.print("Tempo:");
    System.out.println(t.benchmarking(2,15));
    System.out.println("");
    System.out.println("----------------------------------");
    System.out.println("");

    i_rec = 0;
    i_ite = 0;
    
    ////////////////////////////////////////////////////////////////
    
    System.out.println("Sequencia de 20 numeros:");
    System.out.println("");
    for(int i = 1;i<=20;i++){
      fibonacciRecursivo(i);
      fibonacciIterativo(i);
    }
    System.out.print("Fibonacci Recursivo: ");
    System.out.println(i_rec);
    System.out.print("Tempo:");
    System.out.println(t.benchmarking(1,20));
    System.out.println("---------------");
    System.out.print("Fibonacci Iterativo: ");
    System.out.println(i_ite);
    System.out.print("Tempo:");
    System.out.println(t.benchmarking(2,20));
    System.out.println("");
    System.out.println("----------------------------------");
    System.out.println("");
    
    i_rec = 0;
    i_ite = 0;
    

    
  }
}
