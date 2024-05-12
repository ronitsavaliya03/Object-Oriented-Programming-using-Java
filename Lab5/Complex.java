// Define class for Complex number with real and imaginary as data members. Create its contructor, overload the constructors. 
// Also define addition method to add two complex objects.
public class Complex {
    private double real;
    private double imag;

    public Complex(double real,double imag){
        this.real=real;
        this.imag=imag;
    }
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }
    public String toString() {
        if (imag >= 0) {
            return real + " + " + imag + "i";
        } else {
            return real + " - " + (-imag) + "i";
        }
    }
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(4, -5); 

        Complex sum = c1.add(c2);

        System.out.println("First complex number: " + c1);
        System.out.println("Second complex number: " + c2);
        System.out.println("Sum of the two complex numbers: " + sum);
    }
}

