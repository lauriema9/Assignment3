
/**
* Author: Likun Ma
* Date : 3/24/2015
* Email : ml20130@email.vccs.edu
* Test Username and password
*
*/




import javax.swing.JOptionPane;

public class TestUserNameAndPassword
{
   public static void main(String[] args)
   {

         String username, typedUserNm, password,typedPassword; 
         boolean loginPass = false;
         boolean loginUser = false;
         username = "Likun";
        password = "GoodLuck"; 
       for(int i = 0; i<3;i++)

{ 
      typedUserNm = JOptionPane.showInputDialog("Enter Username:");
      JOptionPane.showMessageDialog(null,"The typed username is " + typedUserNm);
      if(typedUserNm == username)
{
      loginUser = true; 
      for(int j = 0; j < 3; j++)
{
      typedPassword = JOptionPane.showInputDialog("Enter Password:");
      JOptionPane.showMessageDialog(null,"The typed password is " + typedPassword);
      if(typedPassword == password)
{
      JOptionPane.showMessageDialog(null,"Welcome " + username); 
      loginPass = true;
      break;
}
 }
  if(!loginPass)
{ 
      JOptionPane.showMessageDialog(null,"Contact Administrator"); 
}
   else
   {
   break;
   }
  }
}
if(!loginUser || !loginPass) 
{      
 JOptionPane.showMessageDialog(null,"Contact Administrator");
}
}
}








































