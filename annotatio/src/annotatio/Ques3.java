package annotatio;
import java.lang.annotation.*;
import java.lang.reflect.*;
public class Ques3 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		MyClass myclass = new MyClass();
		myclass.myMethod1();
		myclass.myMethod3();
		myclass.myMethod2();
		Class cl = myclass.getClass();
		Method m0 = cl.getDeclaredMethod("myMethod1");
		Method m1 = cl.getDeclaredMethod("myMethod2");
		Method m2 = cl.getDeclaredMethod("myMethod3");
		Annotation ann = m0.getAnnotation(Execute.class);
		Annotation ann1 = m1.getAnnotation(Execute.class);
		Annotation ann2= m2.getAnnotation(Execute.class);
		Execute e = (Execute)ann;
		Execute e1 = (Execute)ann1;
		Execute e2 = (Execute)ann2;
		System.out.println(e.sequence());
		System.out.println(e1.sequence());
		System.out.println(e2.sequence());
	}

}
