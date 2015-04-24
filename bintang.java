public class bintang{
    public static void main (String [] argx){
        int [][]data={
            {0,0,0,0,0,1},
            {0,0,0,0,1,0},
            {0,0,0,1,0,0},
            {0,0,1,0,0,0},
            {1,1,0,0,0,0},
            {1,1,0,0,0,0}};
        for (int d=0;d<data.length;d++){
            for (int y=0;y<data[d].length;y++){
                System.out.print((data [y][d]==1)?" # ":" .");
            }
            System.out.println();
        }
    }
} 
