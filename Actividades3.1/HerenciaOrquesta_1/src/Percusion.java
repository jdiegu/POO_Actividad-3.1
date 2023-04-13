 class Percusion extends Instrumento{
    //No tiene atributos
    public Percusion(String nombre){
        super();
        Ajustar(nombre);
    }
    
    @Override
    public void tocar(){ 
        System.out.println("\tToca\t"+"DO"+"\n");
    }
    
    @Override
    public void sonido(String ruta) throws Exception{
        super.sonido(ruta);
    }
}
