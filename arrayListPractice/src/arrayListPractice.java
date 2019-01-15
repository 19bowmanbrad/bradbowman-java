import java.util.*;
public class arrayListPractice {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Billy");
        names.add("Johns");
        names.add("Tims");
        names.add("Sally");
        System.out.println(names);
        ArrayList<String> newNames = removePlurals(names);
        System.out.println(newNames);
    }
    public static ArrayList<String> removePlurals(ArrayList<String> nameList){
        String nameTest = "";
        for (int i = 0; i < nameList.size(); i++){
            nameTest = nameList.get(i);
            if (nameTest.endsWith("s")){
                nameList.remove(nameTest);
                i --;
            }
        }
        return nameList;
    }
}
