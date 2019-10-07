public class Asd {public void Uloha 8() {
    int x = 1;
    for (int rows = 1; rows <= 8; rows++)
    {
        for (int spaces = 1; spaces <= 4; spaces++)
        {
            if (rows==1||rows==8||spaces==1||spaces==4)
            {
                System.out.print("  *");
            }
            else
            {
                System.out.print("   ");
            }
        }
        System.out.println();
    }
}
