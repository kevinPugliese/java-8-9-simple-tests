package com.kevin.newfeatures.java8and9.lambda;

public class Lambda {

  public void funcaoSemLambda() {

    Thread t1 = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("Thread 1 em execução");
      }
    });

    t1.start();
  }

  public void funcaoComLambdaExpression() {
    Thread t1 = new Thread(() -> System.out.println("Thread 2 em execução"));
    t1.start();
  }
}
