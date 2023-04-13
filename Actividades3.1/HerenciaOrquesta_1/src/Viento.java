 class Viento extends Instrumento{
    //No tiene atributos
    public Viento(String nombre){
        super();
        Ajustar(nombre);
    }
    
    @Override
    public void tocar(){
        System.out.println("\tToca\t"+"RE"+"\n");
    }
    
    @Override
    public void sonido(String ruta) throws Exception{
        super.sonido(ruta);
    }
}