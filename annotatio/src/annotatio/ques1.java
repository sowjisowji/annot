package annotatio;
import java.lang.annotation.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Inherited
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
	String testcase();
}








public class ques1 {
	@Test(testcase="")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("first problem");
	}

}
