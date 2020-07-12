package sample.model;

public class DyV {

    public String sortMergeIterativo(int[] vector){//separar el vector en 2 partes para que quede bien
        String pasoAnterior="";
        int tamano=vector.length;
        int mitadTamano=tamano/2;
        int[] left=new int[mitadTamano];
        int[] right=new int[tamano-mitadTamano];
        for (int i=0;i<left.length;i++){

        }
        int izq;
        for (int size=1;size<=tamano-1;size=size*2){
            for (izq=0;izq<=tamano-1;izq+=size*2){
                int mitad=Math.min(izq+size-1,tamano-1);
                int der=Math.min(izq+(2*size)-1,tamano-1);
                pasoAnterior=print(vector);
                merge(vector,izq,mitad,der);
            }
        }
        String end="El tamaño del vertor es de: "+tamano+"\n"+"El paso anterior es:\n"+pasoAnterior+"\nEl resultado es:\n"+print(vector);
        return end;
    }

    public void merge(int[] vector,int l,int m,int r){
        int i,j,k;
        int n1=m-l+1;
        int n2=r-m;

        int[] L= new int[n1];
        int[] R= new int[n2];

        for (i=0;i<n1;i++){
            L[i]=vector[l+i];
        }
        for (j=0;j < n2; j++){
            R[j] = vector[m + 1+ j];
        }

        i=0;
        j=0;
        k=l;

        while (i<n1 && j<n2){
            if (L[i] <= R[j])
            {
                vector[k] = L[i];
                i++;
            }
            else
            {
                vector[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1)
        {
            vector[k] = L[i];
            i++;
            k++;
        }

        while (j < n2)
        {
            vector[k] = R[j];
            j++;
            k++;
        }
    }

    public String print(int [] vector){
        String p="";
        for (int i=0; i<vector.length;i++){
            p+=vector[i]+" ";
        }
        return p;
    }

}
