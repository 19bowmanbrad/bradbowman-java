public class clientCode {
    public static void main(String [] args){
        projectManager myProjectManager = new projectManager();
        Engineer myEngineer = new Engineer();
        seniorEngineer mySeniorEngineer = new seniorEngineer();
        Janitor myJanitor = new Janitor();

        System.out.println(myProjectManager.getHours());
        System.out.println(myProjectManager.getSalary());
        System.out.println(myProjectManager.getVacationDays());
        System.out.println(myProjectManager.getVacationForm());
        myProjectManager.trackStatus();

        System.out.println(myEngineer.getHours());
        System.out.println(myEngineer.getSalary());
        System.out.println(myEngineer.getVacationDays());
        System.out.println(myEngineer.getVacationForm());
        myEngineer.testCode();

        System.out.println(mySeniorEngineer.getHours());
        System.out.println(mySeniorEngineer.getSalary());
        System.out.println(mySeniorEngineer.getVacationDays());
        System.out.println(mySeniorEngineer.getVacationForm());
        mySeniorEngineer.herdCats();

        System.out.println(myJanitor.getHours());
        System.out.println(myJanitor.getSalary());
        System.out.println(myJanitor.getVacationDays());
        System.out.println(myJanitor.getVacationForm());
        myJanitor.hardWork();
    }
}
