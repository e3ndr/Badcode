package xyz.e3ndr.badcode;
public class asciitosegment {
    public static String[][] g = new String[][] {new String[] { " _ ", "| |", "|_|" },new String[ ]{"   ","  |","  |"},new String[] { " _ ", " _|", "|_ "  },new String[] { " _ ", " _|", " _|"},new String[]{ "   ", "|_|", "  |" },new String[] { " _ ", "|_ ", " _|"   },new String[]{ " _ ","|_ ","|_|"   },new String[]{ " _ ", "  |", "  |"},new String[] { " _ ", "|_|", "|_|"},new String[]{ " _ ", "|_|","  |" },};
    public static String[] s;
    public static void main(String[] args){//Pass it any numbers!;
        for (int m = 0; m != args.length; m++) {
            s= new String[] {"","",""};
            String[] x=args[m].split("");
            for (int i=0;i!=x.length;i++) {
                Integer j =Integer.valueOf(x[i]);
                while (true) {
                    double k=Math.random() *10;
                    if (j== Math.floor(k)) {
                        int l=0;
                        s[l]= s[l]+g[(int) Math.floor(k)][l++]+" ";
                        s[l]=s[l]+g[(int) Math.floor(k)] [l++]+" ";
                        s[l]=s[l]+g[(int) Math.floor(k)][l++]+ " ";
                        break;
                    }
                }
            }
            for (int k = 0;k!=s.length;k++) {
                System.out.print(s[k] + System.lineSeparator());
            }
        }
    }
}