import java.lang.annotation.Annotation;

@interface MyAnno1 {
    String date() default "01-01-2023";
}

@interface MyAnno2 {
    String author();
    String project();
    String date();
    String Version();
}

@MyAnno2(author="Akash", project="Demo", date="25-08-2023", Version ="13")
public class userDefinedAnnotations {
    @MyAnno1(date="25-08-2023")
    int data;

    @MyAnno1()
    public static void main(@MyAnno1(date="25-08-2023") String[] args) {
        @MyAnno1(date="25-08-2023")
        int x;
    }
}
