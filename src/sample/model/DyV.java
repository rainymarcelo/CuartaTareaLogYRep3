package sample.model;

public class DyV {

    public DyV(){

    }


    public String sortMergeIterativo(int[] vector){//separar el vector en 2 partes para que quede bien
        String pasoAnterior=print(vector);
        int tamano=vector.length;
        int mitadTamano=tamano/2;
        int[] left=new int[mitadTamano];
        int[] right=new int[tamano-mitadTamano];
        for (int i=0;i<left.length;i++){
            left[i]=vector[i];
        }
        for (int i=0;i<right.length;i++){
            right[i]=vector[i+mitadTamano];
        }

        int izq;
        for (int size=1;size<=tamano-1;size=size*2){//union
            for (izq=0;izq<=tamano-1;izq+=size*2){
                int mitad=Math.min(izq+size-1,tamano-1);
                int der=Math.min(izq+(2*size)-1,tamano-1);
                merge(vector,izq,mitad,der);
            }
        }

        int l;
        for (int sizel=1;sizel<=left.length-1;sizel=sizel*2){//merge izquierdo
            for (l=0;l<=left.length-1;l+=sizel*2){
                int mitad=Math.min(l+sizel-1,left.length-1);
                int der=Math.min(l+(2*sizel)-1,left.length-1);
                merge(left,l,mitad,der);
            }
        }

        int d;
        for (int size=1;size<=right.length-1;size=size*2){//merge derecho
            for (d=0;d<=right.length-1;d+=size*2){
                int mitad=Math.min(d+size-1,right.length-1);
                int der=Math.min(d+(2*size)-1,right.length-1);
                merge(right,d,mitad,der);
            }
        }

        String end="El vector es:\n\n"+pasoAnterior+"\n\n"+"El tamaño del vertor es de: "+tamano+"\n\n"+"El paso anterior al final es:\n\n"+print(left)+print(right)+"\n\nEl resultado es:\n\n"+print(vector);
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

    public String sortMergeDescendente(int[] vector,int posicion){
        int tamano=vector.length;
        int izq;
        for (int size=1;size<=tamano-1;size=size*2){//union
            for (izq=0;izq<=tamano-1;izq+=size*2){
                int mitad=Math.min(izq+size-1,tamano-1);
                int der=Math.min(izq+(2*size)-1,tamano-1);
                mergeDescendente(vector,izq,mitad,der);
            }
        }
        String resultado="El dato que deberia estar en la posicion "+(posicion+1)+" es:  "+vector[posicion]+"\n\nEl vector organizado descendentemente" +
                "queda:\n\n"+print(vector);
        return resultado;
    }

    public void mergeDescendente(int[] vector,int l,int m,int r){
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
            if (L[i] >= R[j])
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


}
