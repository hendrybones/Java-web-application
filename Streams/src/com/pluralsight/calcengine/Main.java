package com.pluralsight.calcengine;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void simpleFileCopy() throws IOException {
        long starTime = System.nanoTime();
        FileInputStream fileInputStream = new FileInputStream("file1.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("fileReceive.txt");

        int c;
        while ((c = fileInputStream.read()) != -1)//looping input reading
        {
            fileOutputStream.write(c);//write the output for every read

        }
        fileInputStream.close();
        fileOutputStream.close();
        long endTime = System.nanoTime();
        long totalTime = endTime - starTime;
        System.out.println("simpleFileCopy" + " " + totalTime);


    }

    private static void LargeFIle() throws IOException {
        long startTime = System.nanoTime();
        FileInputStream fileInputStream = new FileInputStream("LargeData.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("LargeDatDest.txt");

        int c;
        while ((c = fileInputStream.read()) != -1)//looping input reading large data
        {
            fileOutputStream.write(c);//write the output for every read

        }
        fileInputStream.close();
        fileOutputStream.close();
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("LargeFile" + " " + totalTime);

    }


    private static void advancedFileCopy() throws IOException {
        long staTim = System.nanoTime();
        FileReader fileReader = new FileReader("LargeData.txt");
        FileWriter fileWriter = new FileWriter("LargeDatDest.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String s;
        while ((s = bufferedReader.readLine()) != null)
            bufferedWriter.write(s + "\n");
        fileReader.close();
        fileWriter.close();
        long enTim = System.nanoTime();
        long totalTime = enTim - staTim;
        System.out.print("advancedFileCopy:" + " " + totalTime);

    }

    private static void performanceFileCopy() throws IOException {
        simpleFileCopy();
        LargeFIle();
        advancedFileCopy();

    }

    private static void studentDetails() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter registration no");
        String regNo = scanner.nextLine();
        System.out.println("enter your course");
        String course = scanner.nextLine();
        System.out.println("enter your gender (male or female)");
        String gender = scanner.nextLine();
        Gender g = Gender.valueOf(gender);
        System.out.println("enter date of birth (dd-MM-yyyy)");
        String date = scanner.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date dateOfBirth = simpleDateFormat.parse(date);
        System.out.println("enter date of Admission  (dd-MM-yyyy)");
        String da = scanner.nextLine();
        SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date dateOfAdmission = DateFormat.parse(da);
        Student s = new Student(regNo, g, dateOfBirth, dateOfAdmission);
        System.out.println(s);


    }

    public static void main(String[] args) throws IOException, ParseException, ClassNotFoundException {
        int choice = -1;
        Scanner scanner;
        File file = new File("student.txt");
        Collection<Student> list = new ArrayList<>();
        ObjectOutputStream op = null;
        ObjectInputStream ip = null;
        ListIterator li = null;
/* i still have challenge reading the data in file through this
        object

        if (file.isFile()) {
            ip = new ObjectInputStream(new FileInputStream(file));
            list = (Collection<Student>)ip.readObject();
            ip.close();
        }
*/

        System.out.println("Welcome to student registration \n");
        do {
            System.out.println("\n1. Add Student\n" +
                    "2. Delete Student\n" +
                    "3. search Student\n" +
                    "4. View Students\n" +
                    "0. Exit\n");

            scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    Student s = getStudentInfo(scanner, list);
                    writeToFile(s);
                    break;
                case 2:
                    System.out.println("-----------------------------------------");
                    Boolean found = false;
                    System.out.println("enter regNo to delete");
                    String regNO = scanner.next();
                    System.out.println("------------------------------");
                    Iterator itr = list.iterator();
//
                    int c;
                    for ( c = 0; c < list.size(); c++)
                    {
                        Student a = (Student) itr.next();
                        if (a.regNo.equals(regNO)) {
                            list.remove(a);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("student details not found!");
                    }
                    System.out.println("--------------------------------");



/*
                    System.out.println("enter record to delete");
                    String search=scanner.nextLine();
                    ArrayList<Student> student=new ArrayList<Student>();

                    writeFile(student);

                    for (int i=0;i<student.size();i++){
                        if (student.get(i).equals(search)){
                            student.remove(search);
                            writeFile(student);
                        }
                    }
*/

                    break;
                case 3:
                    System.out.println("-----------------------------------------");
                    found = false;
                    System.out.println("enter the regNo to search");
                    String No = scanner.nextLine();
                    itr = list.iterator();
                    int i;
                    for ( i = 0; i < list.size(); i++) {
                        Student stud = (Student) itr.next();
                        if (stud.getRegNo().equals(No))
                            System.out.println(stud);
                        found =true;
                    }
                    System.out.println("-----------------------------------------");


/*
                    System.out.println("enter regNo to search");
                    String regNo =scanner.next();
                    String line=" ";
                    try {
                        FileInputStream fin=new FileInputStream("student.txt");
                        Scanner sc=new Scanner(fin);
                        while (sc.hasNextLine()){
                            line=sc.nextLine();
                            if (line.startsWith(regNo))
                                System.out.println(line);
                        }
                        sc.close();

                    }catch (IOException ioe){
                        ioe.printStackTrace();
                    }
*/

                    break;
                case 4:
                    System.out.println("-----------------------------------------");
                    itr = list.iterator();
                    while (itr.hasNext()) {
                        Student a = (Student) itr.next();
                        System.out.println(a);
                    }
                    System.out.println("-----------------------------------------");
//                 readStudent();
                    break;
                case 5:
                    break;
            }
            }
            while (choice != 0) ;

    }


    private static Student getStudentInfo(Scanner scanner, Collection<Student> list) throws ParseException {
        System.out.println("provide student details below \n");
        System.out.println("enter registration number");
        String regNo = scanner.next();
        System.out.println("enter your gender");
        String gender = scanner.next();
        Gender g = Gender.valueOf(gender);
        System.out.println("enter date of birth (dd-MM-yyyy)");
        String date = scanner.next();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date dateOfBirth = simpleDateFormat.parse(date);
        System.out.println("enter date of Admission (dd-MM-yyyy) ");
        String da = scanner.next();
        SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date dateOfAdmission = DateFormat.parse(da);
        Student s = new Student(regNo, g, dateOfBirth, dateOfAdmission);
        //i have used list add() method to manipulate the data as i work on it
        list.add(new Student(regNo, g, dateOfBirth, dateOfAdmission));
/*
                    op = new ObjectOutputStream(new FileOutputStream(file));
                    op.writeObject(list.toString());
                    op.close();
                    Student s = getStudentDetails(scanner);
*/
        return s;
    }

    private static void writeFile(Collection<Student> student) {
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter("student.txt"));
            for (Student x: student){
                writer.write(String.valueOf(x));
                writer.newLine();
            }
            writer.close();
        }catch (IOException ioe){
            ioe.getStackTrace();
        }
    }


    private static void readStudent () throws IOException, ParseException {
                StringBuilder stringBuilder = new StringBuilder();

                FileInputStream fileInputStream = new FileInputStream("student.txt");
                int c;
                while ((c = fileInputStream.read()) != -1) {

                    char ch = (char) c;
                    if (ch != '\n')
                        stringBuilder.append(ch);
                    else {
                        parseStudent(stringBuilder);
                        stringBuilder = new StringBuilder();
                    }

                }
                if (stringBuilder.length() > 0) {
                    parseStudent(stringBuilder);
                    System.out.println(stringBuilder);

                }
                fileInputStream.close();
            }

            private static void parseStudent (StringBuilder stringBuilder) throws ParseException {
                String[] studentData = stringBuilder.toString().split(",");
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
                Student s = new Student(studentData[0].trim(),Gender.valueOf(studentData[1].trim()), simpleDateFormat.parse(studentData[2].trim()),
                        simpleDateFormat.parse(studentData[3].trim()));
                System.out.println(s);
            }

            private static Student getStudentDetails (Scanner scanner) throws ParseException {
                System.out.println("provide student details below \n");
                System.out.println("enter registration number");
                String regNo = scanner.next();
                System.out.println("enter your gender");
                String gender = scanner.next();
                Gender g = Gender.valueOf(gender);
                System.out.println("enter date of birth (dd-MM-yyyy)");
                String date = scanner.next();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
                Date dateOfBirth = simpleDateFormat.parse(date);
                System.out.println("enter date of Admission (dd-MM-yyyy) ");
                String da = scanner.next();
                SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MM-yyyy");
                Date dateOfAdmission = DateFormat.parse(da);
                Student s = new Student(regNo, g, dateOfBirth, dateOfAdmission);



                return s;
            }

            private static void writeToFile (Student s) throws IOException {
                FileOutputStream fileOutputStream = new FileOutputStream("student.txt", true);
                /* String toWrite="\n" + s.toString(); */
                    for (int i = 0; i < s.toString().length(); i++) {
                        fileOutputStream.write(s.toString().charAt(i));

                }
                char newline = '\n';
                fileOutputStream.write(newline);
                fileOutputStream.close();
            }
        }
