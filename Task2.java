package Project2_2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    int x;
    int y;
    int z;
    public Main(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public static void main(String[] args){
        Main vector = new Main(4, -3, 1);
        Main vector2 = new Main(-1, 0, 1);
        System.out.println(v_len(vector));
        System.out.println();
        System.out.println(v_sk(vector, vector2));
        System.out.println();
        System.out.println(v_vp(vector, vector2));
        System.out.println();
        System.out.println(angle(vector, vector2));
        System.out.println();
        System.out.println(sum(vector, vector2));
        System.out.println();
        System.out.println(sub(vector, vector2));
        System.out.println();
        Main vectors [] = rand(5);
        for(int i=0; i<vectors.length; i++){
            System.out.println(vectors[i].x + " " + vectors[i].y + " " + vectors[i].z);
        }
    }
    public static double v_len(Main vector){
        return Math.sqrt(Math.pow(vector.x, 2)+Math.pow(vector.y, 2)+Math.pow(vector.z, 2));
    }
    public static double v_sk(Main vector1, Main vector2) {
        return vector1.x*vector2.x+vector1.y*vector2.y+vector1.z*vector2.z;
    }
    public static String v_vp(Main vector1, Main vector2) {
        Main vector_vp = new Main(vector1.y*vector2.z-vector1.z*vector2.y, vector1.z*vector2.x-vector1.x*vector2.z, vector1.x*vector2.y - vector1.y*vector2.x);
        return vector_vp.x + " " + vector_vp.y + " " + vector_vp.z;
    }
    public static double angle(Main vector1, Main vector2){
        double ang = v_sk(vector1, vector2)/(v_len(vector1)*v_len(vector2));
        return ang;
    }
    public static String sum(Main vector1, Main vector2){
        Main v_sum = new Main(vector1.x+vector2.x, vector1.y+vector2.y, vector1.z+vector2.z);
        return v_sum.x + " " + v_sum.y + " " + v_sum.z;
    }
    public static String sub(Main vector1, Main vector2){
        Main v_sub = new Main(vector1.x-vector2.x, vector1.y-vector2.y, vector1.z-vector2.z);
        return v_sub.x + " " + v_sub.y + " " + v_sub.z;
    }
    public static Main[] rand(int n){
        Main vectors [] = new Main [n];
        for (int i = 0; i < n; i++){
            int x = (int) (10*Math.random());
            int y = (int) (10*Math.random());
            int z = (int) (10*Math.random());
            Main v = new Main(x, y, z);
            vectors[i] = v;
        }
        return vectors;
    }
}
