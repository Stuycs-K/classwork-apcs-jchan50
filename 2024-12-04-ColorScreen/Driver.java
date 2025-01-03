public class Driver{
    public static void main(String[] args){
        System.out.println(Text.CLEAR_SCREEN);
        System.out.println(Text.HIDE_CURSOR);
        System.out.println(Text.TOPLEFT_CURSOR);

        //top row
        Text.go(1,1);
        for (int i = 0; i < 80; i++){
            int randomR = (int)(Math.random() * 256);
            int randomG = (int)(Math.random() * 256);
            int randomB = (int)(Math.random() * 256);
            System.out.print("\u001b[38;2;"+randomR+";"+randomG+";"+randomB+";7m ");
            // Text.color(30+i,,Text.DARK,Text.ITALICS);
            // System.out.print(" ");
        }

        //sides
        for (int i = 0; i < 30; i++){
            Text.go(i,0);
            int randomR = (int)(Math.random() * 256);
            int randomG = (int)(Math.random() * 256);
            int randomB = (int)(Math.random() * 256);
            System.out.print("\u001b[38;2;"+randomR+";"+randomG+";"+randomB+";7m ");
            Text.go(i,80);
            System.out.print("\u001b[38;2;"+randomR+";"+randomG+";"+randomB+";7m ");
            System.out.println("");
        }
        
        //bottom row
        Text.go(31,1);
        for (int i = 0; i < 80; i++){
            int randomR = (int)(Math.random() * 256);
            int randomG = (int)(Math.random() * 256);
            int randomB = (int)(Math.random() * 256);
            System.out.print("\u001b[38;2;"+randomR+";"+randomG+";"+randomB+";7m ");
            // Text.color(30+i,,Text.DARK,Text.ITALICS);
            // System.out.print(" ");
        }

        //three random integers
        int[] arr = {(int)(Math.random() * 100) ,(int)(Math.random() * 100),(int)(Math.random() * 100)};
        for (int i = 0; i < arr.length; i ++){
            Text.go(2,(i+1) * 10);
            if (arr[i] < 25){
                Text.color(Text.RED + 60);
                System.out.println(arr[i]);
                Text.color(Text.WHITE);
                continue;
            }
            if (arr[i] > 75){
                Text.color(92);
                System.out.println(arr[i]);
                Text.color(Text.WHITE);
                continue;
            }
            System.out.println(arr[i]);
            
        }

        Text.go(8,15);
        Text.color(Text.YELLOW, 103,Text.ITALICS, 1);
        System.out.print(" ");
        Text.go(9,16);
        Text.color(Text.YELLOW, 103,Text.ITALICS, 1);
        System.out.print(" ");
        Text.go(9,17);
        Text.color(Text.YELLOW, 103,Text.ITALICS, 1);
        System.out.print(" ");
        Text.go(9,18);
        Text.color(Text.YELLOW, 103,Text.ITALICS, 1);
        System.out.print(" ");
        Text.go(8,19);
        System.out.print(" ");
        Text.go(10,17);
        System.out.print(" ");
        Text.color(Text.RED, 101,Text.ITALICS, 1);
        Text.go(10,18);
        System.out.print(" ");
        Text.go(10,16);
        System.out.print(" ");
        Text.color(Text.RED, 103,Text.ITALICS, 1);
        

        //separator
        Text.go(3,1);
        for (int i = 0; i < 80; i++){
            int randomR = (int)(Math.random() * 256);
            int randomG = (int)(Math.random() * 256);
            int randomB = (int)(Math.random() * 256);
            System.out.print("\u001b[38;2;"+randomR+";"+randomG+";"+randomB+";7m*");
            // Text.color(30+i,,Text.DARK,Text.ITALICS);
            // System.out.print(" ");
        }

       
        
        Text.go(31,1);
    }
}