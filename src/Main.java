public static double integrate(DoubleUnaryOperator f, double a, double b) {
    double n = 1e-6;
    double sum = 0;
    long i = 0;
    for (double x = a; x < b; x = a + n * i++) {
        sum += n * f.applyAsDouble(x);
    }
    return sum;
}
