package classes;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BuildObject {

	public Object buildObject(Class<?> classT) {
		try {
			Constructor<?> constT = classT.getDeclaredConstructor();

			constT.setAccessible(true);
			
			Object obj = constT.newInstance();
			
			return obj;
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}
}
