package sample.model;

public class Dinamica {

    public String numeroPrimos(){
        int[] primos=new int[1000];
        primos[0]=0;
        primos[1]=0;
        primos[2]=2;
        primos[3]=3;
        for (int i=2;i<primos.length;i++){
            for (int j=2;j<=i/2;j++){
                if ((i%j)==0){
                    primos[i]=0;
                    break;
                }
                else {
                    primos[i]=i;
                }
            }
        }
        //desde aca es par imprimir la respuesta con las condiciones dadas
        String resultado="";
        int k=0;
        for (int i=0;i<primos.length;i++){
            if (primos[i]!=0){
                resultado+=primos[i]+" ";
                k++;
                if (k%20==0){
                    resultado+="\n\n";
                }
            }
        }
        resultado+="\n\n";
        int p=1;
        k=0;
        for (int i=0;i<primos.length;i++){
            if (primos[i]!=0){
                k++;
            }
            if (i==(100*p)){
                resultado+="La cantidad de numeros primos entre "+(p-1)*100+" y "+p*100+" es: "+k+"\n";
                p++;
                k=0;
            }
            if (i==primos.length-1){
                resultado+="La cantidad de numeros primos entre "+(p-1)*100+" y "+p*100+" es: "+k+"\n";
            }
        }
        return resultado;
    }
}
