public class ColorDemo{
    public static final String CLEAR_SCREEN =  "\u001b[2J";
    public static final String HIDE_CURSOR =  "\u001b[?25l";
    public static final String SHOW_CURSOR =  "\u001b[?25h";

    public static int BLACK = 30;
    public static int RED = 31;

    public static void color(int foreground,int background){
        System.out.print( "\u001b[" + foreground + ";" + (10+background) + "m");
    }

    public static void color(int foreground, int background, int modifier){
        System.out.print( "\u001b[" + foreground + ";" + (10+background) + ";" + modifier + "m");
    }

    public static void go(int r,int c){
        System.out.print("\u001b[" + r + ";" + c + "f");
      }

    public static void main(String[] args){
        // for(int r = 0; r < 256; r+=32){
        //     for(int g = 0; g <= 256; g+=32){
        //       for(int b = 0; b <= 256; b+=32){
        //         System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
        //       }
        //     }
        //       System.out.print();
        //   }
        for (int j = 0; j < 20; j++){
            for (int i = 0; i < 20; i++){
                int randomR = (int)(Math.random() * 256);
                int randomG = (int)(Math.random() * 256);
                int randomB = (int)(Math.random() * 256);
                System.out.print("\u001b[38;2;"+randomR+";"+randomG+";"+randomB+";7m brat ");
            }
            System.out.println();
        }
        
    }
}