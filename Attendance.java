import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class Attendance {
	private static ArrayList<Student> studentList = new ArrayList<Student>(10);
	
    private static void selectionSort(ArrayList<Student> students, Comparator<Student> comparator) {

            for (int i = 0; i < students.size() -1; i++) {
                
                int minIndex = i;
                for(int j = i + 1; j < students.size(); j++){
                    
                    //if current student at idx j is less than the minimum student
                    if(comparator.compare(students.get(j), students.get(minIndex)) < 0){
                        minIndex = j;   //update the min 
                    }
                }

                //this index hasnt remained the same that we assigned on line 13, so something happened inside
                //loop, maybe we found another minimum ahead of this index
                if(minIndex != i){
                    
                    //so, replace the values
                    Student temp = students.get(i);
                    students.set(i, students.get(minIndex));
                    students.set(minIndex, temp);

                }                
            }

    }

	public static void main(String[] args) {
		// int rollno, String name, String address
    Scanner scanner = new Scanner(System.in);
    int i;
    
	for (i = 0; i < 10; i++) {

        int id = scanner.nextInt();
        String name = scanner.next();
        String address = scanner.next();
        
        Student newStudent = new Student(id, name, address);

		studentList.add(newStudent);

    }

    
	System.out.println("List before sorting: \n" +  studentList);
		
    selectionSort(studentList, new CompareRollNo());

    System.out.println("List after sorting by roll no: \n" +  studentList);

    selectionSort(studentList, new CompareName());

    System.out.println("List after sorting by name: \n" +  studentList);
	
	
		//two comparator classes to sort objects by name and by rollno
		
		//implement my own selection sort method CANNOT use Java Library method

	}
}