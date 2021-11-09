public class Culculatorr {
    public static float calculator(float first,float second,String operator){
        switch (operator){
            case "+":
                return first +second;
            case "-":
                return  first- second;
            case "*":
                return first*second;
            case "/":
                try {
                    return first/second;
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                }
            default: return -1;
        }

    }
}
