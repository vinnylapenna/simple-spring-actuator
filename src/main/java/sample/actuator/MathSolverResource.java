package sample.actuator;

import java.util.Arrays;
import java.util.stream.IntStream;

import org.apache.commons.math3.fitting.PolynomialCurveFitter;
import org.apache.commons.math3.fitting.WeightedObservedPoints;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math-engine")
public class MathSolverResource {

  @PostMapping("/add")
  public String addNumbers(@RequestBody double numbers[]) {
    return String.valueOf(Arrays.stream(numbers).sum());
  }

  @PostMapping("/curve-fit")
  public double[] fitCurve(@RequestBody double numbers[]) {
    final WeightedObservedPoints obs = new WeightedObservedPoints();
    IntStream.range(0, numbers.length).forEach(idx -> obs.add(idx, numbers[idx]));

    // Instantiate a nth-degree polynomial fitter.
    final PolynomialCurveFitter fitter = PolynomialCurveFitter.create(10);

    // Retrieve fitted parameters (coefficients of the polynomial function).
    return fitter.fit(obs.toList());
  }

}
