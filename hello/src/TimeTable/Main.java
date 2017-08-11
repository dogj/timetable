package TimeTable;

import java.sql.SQLException;
import java.util.Vector;

public class Main {

	public static void main(String[] args) throws SQLException {
		Vector<String> v1 = new Vector<String> ();
		{
			v1.addElement("IT5134");
			v1.addElement("D1");
		}
		
		Vector<String> v2 = new Vector<String> ();
		{
			v2.addElement("IT5678");
			v2.addElement("SP3");
		}
		
		Vector<Vector<String>> selectedCourse=new Vector<Vector<String>>();
		{
			selectedCourse.addElement(v1);
			selectedCourse.addElement(v2);
		}
		ToTextFeild ttt = new ToTextFeild();
		ttt.toTextFeild(selectedCourse);
//		System.out.println(selectedCourse);
//		String[] array = new String [2];
//		v1.toArray(array);
//		 for (int i = 0; i < array.length; i++) {
//			   System.out.println(array[i]);
//			   }

	}

}
