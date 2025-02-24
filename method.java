class Computer
{
   public void playMusic()
   {
    System.out.println("Musicplaying.....");
   }

   public String getMePen(int cost)
   {
    if(cost >=10)
       return "Pen";
    
       return "nothing";   

   }
}

public class method {
    public static void main(String a[])
    {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMePen(2);
        System.out.println(str);
    }
    
}
