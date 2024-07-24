import java.util.ArrayList;

/**
 * Write a description of class Permutacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Permutacion
{
    public ArrayList<int[]> buscarPermutaciones(int arr[]){
        ArrayList<int[]> res = new ArrayList<>();
        buscarPermutaciones(arr, 0 ,res);
        imprimirPermutaciones(res);
        return res;
    }
    
    private void buscarPermutaciones(int arr[], int pos ,ArrayList<int[]> res){
        if(pos ==  arr.length ){
            res.add(arr.clone());
        }else{
            for(int posAct = pos; posAct < arr.length; posAct++){
                cambiar(arr, pos, posAct);
                buscarPermutaciones(arr, pos+1, res);
                cambiar(arr, posAct, pos);
            }
        }
    }
    
    private void cambiar(int arr[], int posA, int posB){
        int aux = arr[posA];
        arr[posA] = arr[posB];
        arr[posB] = aux;
    }
    
    private void imprimirPermutaciones(ArrayList<int[]> res){
        for(int [] lista : res){
            for(int x : lista){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
