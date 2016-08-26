package com.credera.vinnylapenna;

import java.util.List;

// adapted from https://github.com/leisyj/simple-microservice-example
public class MathProblem
{
   public enum ProblemType
   {
      ADDITION,
      CURVE_FIT
   }

   private ProblemType problemType;
   private List<Double> numbers;

   public ProblemType getProblemType()
   {
      return problemType;
   }

   public List<Double> getNumbers()
   {
      return numbers;
   }
}
