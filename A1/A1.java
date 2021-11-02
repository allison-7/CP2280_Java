//Allison Power 20179041
public class A1 {
    public static void main(String[] args) {
        int[] x = new int[11];
        int[] y = new int[11];
        int[][] o = new int[11][11];
        String[] tmp = new String[11];
        String[] out = new String[11];
        for(int i = 0; i< x.length; i++){
            x[i] = i;
            y[i] = i;
        }
        for(int i = 0; i< x.length;i++){
            for(int j = 0; j< y.length; j++){
                 o[i][j] = x[i] * (y[j] + 1);
                 if(i==0){
                     o[0][j] = x[j];
                 }
            }
        }
        for(int i = 0; i< x.length; i++){
            for (int j = 0; j<y.length ; j++){
                tmp[i] += String.format("%10d",o[i][j] );
                out[i] = tmp[i].replace("null        ", "");
            }
        }
        out[0] = tmp[0].replace("null         0","  ");
        
        for(int i = 0; i<out.length; i++){
            System.out.println(out[i]);
        }
    }
}
