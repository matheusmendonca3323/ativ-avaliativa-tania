public class TempoExecucao extends Main{

  TempoExecucao(){}
  
  public long benchmarking(int escolha,int valor){
    long tempoInicial,tempoFinal,tempo = 0;
    
    if(escolha == 1){
      tempoInicial = System.nanoTime();
      for(int i = 1;i<valor;i++){
        fibonacciRecursivo(i);
      }
      tempoFinal = System.nanoTime();
      tempo = tempoFinal - tempoInicial;
      return tempo;
    }
      
    else if(escolha == 2){
      tempoInicial = System.nanoTime();
       for(int i = 1;i<valor;i++){
        fibonacciIterativo(i);
      }
      tempoFinal = System.nanoTime();
      tempo = tempoFinal - tempoInicial;
      return tempo;
    }
      
    else{
      System.out.println("ERRO");
      return 0;
    }
  }
}
