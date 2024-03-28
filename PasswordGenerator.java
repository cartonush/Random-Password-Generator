//Made By Cartonush.
import java.util.Scanner;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
public class PasswordGenerator 
{
    public static Scanner reader=new Scanner(System.in);
    public static void main(String[] args)
    {
        String list="",pass="";
        System.out.println("Enter the password length: ");
        int length=reader.nextInt(),rnd=-1;
        System.out.println("include letters? (type true or false!)");
        boolean iletters=reader.nextBoolean();
        System.out.println("include capital letters? (type true or false!)");
        boolean icapital=reader.nextBoolean();
        System.out.println("include numbers? (type true or false!)");
        boolean inumbers=reader.nextBoolean();
        System.out.println("include special signs? (type true or false!)");
        boolean ispical=reader.nextBoolean();
        String letters="abcdfghijklmnopqrstuvwxyz";
        String cletters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String nums="0123456789";
        String signs="!@#$%^&*()_+=?`~{}[];:<>.,/|";
        if(iletters)list+=letters;
        if(icapital)list+=cletters;
        if(inumbers)list+=nums;
        if(ispical)list+=signs;
        if(list.length()==0)System.out.println("Error!");
        else
        {
            for(int i=0;i<length;i++)
            {
                rnd=(int)(Math.random()*list.length()-1);
                pass+=list.charAt(rnd);
            }
        }
        StringSelection selection = new StringSelection(pass);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, null);
        System.out.println("Password copied to clipboard: " + pass);
    }
}
