package com.interswitch.maven;

/**
 * Hello world!
 *
 */
public class Arithmetic {
    private double firstNum;
    private double secondNum;

    public double getFirstNum() {
        return firstNum;
    }

    public double getSecondNum() {
        return secondNum;
    }

    public Arithmetic(double firstNum, double secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    public void setSecondNum(double secondNum) {
        this.secondNum = secondNum;
    }
    public double add(){
        return this.firstNum + this.secondNum;
    }
    public double subtract(){
        return this.firstNum - this.secondNum;
    }
    public double divide(){
        return this.firstNum / this.secondNum;
    }
    public double multiply(){
        return this.firstNum * this.secondNum;
    }

    public static void main(String[] args) {

    }

}
