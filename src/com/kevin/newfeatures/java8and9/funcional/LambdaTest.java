package com.kevin.newfeatures.java8and9.funcional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaTest {

  public void testar() {
    forEach(Arrays.asList("Kevin", "Dev", "linkedin.com"), (String s) -> System.out.println(s));
    List<Integer> map = map(Arrays.asList("Kevin", "Hybris", "SAP"), (String s) -> s.length());
    System.out.println(map);
  }

  public static <T> void forEach(final List<T> list, final Consumer<T> c) {
    for (T e : list) {
      c.accept(e);
    }
  }

  public static <T, R> List<R> map(final List<T> list, Function<T, R> f) {
    final List<R> result = new ArrayList<>();
    for (T e : list) {
      result.add(f.apply(e));
    }
    return result;
  }

}
