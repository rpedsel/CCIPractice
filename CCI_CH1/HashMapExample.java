import java.util.*;



class HashMapExample{
    public static void main(String[] args){
        Student[] students = new Student[3];
        students[0] = new Student("Lily",14,1);
        students[1] = new Student("Marc", 16,2);
        students[2] = new Student("Lia",13,3);
        HashMap<Integer, Student> HM = buildMap(students);

        for(Map.Entry<Integer, Student> entry : HM.entrySet()) {
            int key = entry.getKey();
            Student value = entry.getValue();
            System.out.println(value.name);
        }

    }

    // static -> make it class method instead of instance method!
    static HashMap<Integer, Student> buildMap(Student[] students){
        HashMap<Integer, Student> map = new HashMap<Integer, Student>();
        for (Student s:students) map.put(s.getId(),s);
        return map;
    }
}
    
