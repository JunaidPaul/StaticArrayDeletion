import java.util.Arrays;
/**
 * Array Data-structure
 * @author JunaidePaul
 * Static array deletion
 */
public class StaticArrayDeletion {
    public static int[] delete(int[] data, int pos){
        int[] tmp = new int[data.length-1];
        if (pos>0 && pos<data.length){
            for (int i=0; i<pos;i++){
                tmp[i] = data[i];
            }
            for (int i=pos+1;i<data.length;i++){
                tmp[i-1] = data[i];
            }

        }
        return tmp;

    }

    public static void main(String[] args){
        int[] data = {7,5,4,1,6};

        System.out.println(Arrays.toString(delete(data,3)));
    }
}
