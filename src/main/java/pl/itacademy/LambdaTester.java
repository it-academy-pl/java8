package pl.itacademy;

import pl.itacademy.api.ClassCreator;
import pl.itacademy.api.Testable;

public class LambdaTester {

    public static void main(String[] args) {

       testText(new Testable<String>() {
           @Override
           public boolean test(String item) {
               return item.isEmpty();
           }
       }, "text");


       testText(text -> text.isEmpty(),"text");

       testText(String::isEmpty, "");
       
       
       testCreator(new ClassCreator<Object>() {
           @Override
           public Object create() {
               return new Object();
           }
       });

       testCreator(() -> new Integer(5));

       testCreator(() -> "asdf");

       testCreator(Object::new);

       testCreator(() -> new Object() {
           @Override
           public String toString() {
               return "toString from LAMBDA!!";
           }
       });

    }



    private static <T> void testText(Testable<T> testable, T text) {
        System.out.println(testable.test(text));
    }
    
    private static void testCreator(ClassCreator<Object> creator) {
        System.out.println(creator.create());
    }

}
