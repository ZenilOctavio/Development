
class Lista{
    public int size;
    public String values = "[]";

    String arrtoString(String[] arr){
        String prod = "";
        for(int i = 0; i<arr.length; i++){
            prod += arr[i];
        }
        return prod;
    }
    void push(int valor){
        String [] help = values.split("");
        help[((help.length)-1)] = String.valueOf(valor);
        values = arrtoString(help);
        values += "]";
    }
    void push(double valor){
        String [] help = values.split("");
 
        help[((help.length)-1)] = String.valueOf(valor);
        values = arrtoString(help);
        values += "]";
    }
    void push(String valor){
        String [] help = values.split("");
 
        help[((help.length)-1)] = "\""+valor+"\"";
        values = arrtoString(help);
        values += "]";
    }
    void push(char valor){
        String [] help = values.split("");
 
        help[((help.length)-1)] = String.valueOf(valor);
        values = arrtoString(help);
        values += "]";
    }
}

class poro{
    public static void main(String[] args) {
        Lista arreglo = new Lista();

        System.out.println(arreglo.values);
        arreglo.push(500);
        arreglo.push('g');
        arreglo.push("eoeoe");
        arreglo.push(3.1416);

        System.out.println(arreglo.values);
    }
}