package com.Interface;

class Eclipse implements Shape{
    private double r1, r2;
    /*
     * Add another shape eclipse:
     * 		Perimeter = 2*pi*Sqrt((r1^2 + r2^2)/2 )
     * 		Area = pi * r1 * r2
     * r1 - minor axis
     * r2 - major axis
     */
    public Eclipse() {
        this(0, 0);
    }
    public Eclipse(double r1, double r2) {
        this.r1 = r1;
        this.r2 = r2;
    }
    public double area(){
        return Math.PI * r1 * r2;
    }
    public double perimeter(){
        double squares = (Math.pow(r1, 2) + Math.pow(r2, 2)) / 2.;
        double sqrt = Math.sqrt(squares);
        return 2 * Math.PI * sqrt;
    }
}