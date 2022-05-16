package pages;

public class Main {
    public static void main(String[] args) {
        //write your code here
        UserStory user=new UserStory();
        user.userId="123";
        user.userPassword="@78945";
        user.userMsg="Hi";

        // adding Employee to our story
        EmployeeStory eStory=new EmployeeStory();
        eStory.name="Khan";
        eStory.id="12345";
        eStory.age="25";
    }
}