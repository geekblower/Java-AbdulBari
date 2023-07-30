public class sumThroughCLA {
    static public void main(String[] args) {
        double sum = 0;

        for(String s : args) {
            // To handle exceptions
            if(s.matches("[0-9\\.]+")) {
                sum += Double.parseDouble(s);
            } 
        }

        System.out.println("Sum of all Command Line Arguments : " + sum);
    }
}
