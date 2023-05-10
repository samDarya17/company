package classwork;
public class WorkWithUser {

    private int age;
    private String gender;
    private String secondName;
    private String name;


    public WorkWithUser(String _name,
                        String _secondName, String _gender, int _age){

        System.out.println("User Created");
        setInfoAboutUser(_name, _secondName, _gender, _age);
        System.out.println(getInfoAboutUser());


    }

    public WorkWithUser(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println(this.getInfoAboutUser());

    }

    public void setInfoAboutUser(String name,
                                 String secondName, String gender, int age){
        this.name = name;
        this.secondName = secondName;
        this.gender = gender;
        this.age = age;

    }
    public String getInfoAboutUser(){
        String Info = "User Name: " + name + "\n" + " SecondName: " + secondName + "\n" +
                "Gender: " + gender + "\n" + "Age: " + age;
        return Info;
    }

}
//    public WorkWithUser(int age, String gender, String secondName, String name) {
//        this.age = age;
//        this.gender = gender;
//        this.secondName = secondName;
//        this.name = name;
//    } Конструктор из Инсерта, ниже - написанный руками будет