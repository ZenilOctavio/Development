class Prueba{
    public static void main(String[] args) {
        cuentaRegresiva(-30);
    }
    public static int cuentaRegresiva(int arg){
        System.out.println(arg);
        if(arg == 0){
            return 0;
        }
        else{
            if(arg<0){
                return cuentaRegresiva(arg+1);
            }
            else{
                return cuentaRegresiva(arg-1);
            }
        }
    }
}