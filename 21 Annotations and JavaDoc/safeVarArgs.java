class My<T> {
    @SafeVarargs
    private void show(T...arg) {

        for(T x : arg) {
            System.out.println(x);
        }

    }
}

public class safeVarArgs {
    public void main(String[] args) {

    }    
}
