package TimeTable;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
//1.convert vector's each line into a string array
//2.get course name and stream from each array line
//3.use SQL keywords above to query TextFeild and Room
//4.combine them and course name into one line
//5.combine all the one lines into a new two-dimensional array, then return
public class ToTextFeild {
	public String[][] toTextFeild (Vector<Vector<String>> selectedCourse) throws SQLException{
		//v={"course name", "stream"}
		
		DBConnection DBC = new DBConnection();
		
//		String[][] strArray = new String[selectedCourse.size()][2]; //to copy vector into string array
		
		
		String[][] output = new String[selectedCourse.size()][3] ;   //return this array. structure: course name, TextFeild, Room
				
		for (int i = 0; i<selectedCourse.size();i++){
		//1.convert vector's each line into a string array
		String[] oneLine = new String[3];
		selectedCourse.get(i).copyInto(oneLine);

		//2.get course name and stream from each array line
		String courseName = oneLine[0];
		String streamName = oneLine[1];

		//3.use SQL keywords above to query TextFeild and Room
		String keywords = courseName + " and name = " + streamName;
		ResultSet rs = DBC.queryExecute("select TEXTFEILD, ROOM from stream where coursename like ? and name like ? ",courseName,streamName);
		
		
		//4.combine them and course name into one line
		if (rs.next()){
//			System.out.println(rs.getString(2));
		oneLine[1] = rs.getString(1); //oneLine[1] is TEXTFEILD now
		oneLine[2] = rs.getString(2);//oneLine[2] is ROOM now
		}
		
		//5.combine all the one lines into a new two-dimensional array, then return
		output[i] = oneLine;
//		System.out.println(output[i][0]+" "+output[i][1]+" "+output[i][2]);
		}
		
		
		return output;
		
		
	} 
	
}
