import java.lang.annotation.*;

// @Retention(RetentionPolicy.class)

// @Documented

// @Target(value = ElementType.FIELD)
// @Target(value = {ElementType.FIELD, ElementType.METHOD})

// @Inherited

// @Repeatable

@interface MyAnno {
    String author();
    String project();
    String date() default "25-08-2023";
    String Version() default "13";
}

@MyAnno(author="Akash", project="Demo")
public class builtinAnnos {
    int data;

    public static void main(String[] args) {
        int x;
    }
}
