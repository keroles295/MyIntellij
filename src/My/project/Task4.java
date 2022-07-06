package My.project;

public class Task4 {
    //Create Registration Class in which you would have variables as email, userName and password
    // that have an access scope only within its own class.
    // After creating an object of the class user should be able to call methods
    // and in each method separately pass values to set users email, username and password.
    //Requirements:
    //Valid email consider to be only yahoo
    //Valid userName and password cannot be empty and should be of length larger than 6 characters.
    // Also valid password cannot contain userName
}
class Registration{
private String email;
private String userName;
private String password;
public void setEmail(String email){
    if(email.contains("@yahoo")){
        System.out.println("Accepeted email");
        this.email=email;
    }else{
        System.out.println("Please you have to make as yahoo");
    }
}

    public void setUserName(String userName) {
        this.userName = userName;
        if(!userName.isEmpty() && userName.length()>6){
            System.out.println("UserName has been accepeted please forword to next step");
        }else{
            System.out.println("UserName cannot be empty and it should to be longer than 6 charcters");
        }
    }
    public void setPassword(String password){
    this.password=password;
    if(!password.isEmpty() && password.length()>6 && !password.contains(userName) ){
        System.out.println("Your password has been approved");
    }else {
        System.out.println("Please password can not be empty or less than 6 charcters and it should have your username inside it");
    }
    }
}
