package junitproject;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Demo{
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(Firstexample.class,Assert.class);
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      System.out.println("Result=="+result.wasSuccessful());
      
   }
} 
