package sample.actuator;

import java.util.List;

/**
 * Created by jleisy on 11/6/15.
 */
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
