public class TestaPorta {
    public static void main(String[] args){
        Porta p1 = new Porta();
        p1.dimensaoX = 0.70;
        p1.dimensaoY = 2.10;
        p1.dimensaoZ = 0.10;
        p1.cor = "preta";
////////////////////////////////////////////////////////////////////////////////////////////////////
        p1.abre();
        
        System.out.println("\nDomensões da porta: "+p1.dimensaoX+" "+p1.dimensaoY+" "+p1.dimensaoZ);
        System.out.println("Cor da porta: "+p1.cor);
        p1.estaAberta();
////////////////////////////////////////////////////////////////////////////////////////////////////        
        p1.fecha();
        
        System.out.println("\nDomensões da porta: "+p1.dimensaoX+" "+p1.dimensaoY+" "+p1.dimensaoZ);
        System.out.println("Cor da porta: "+p1.cor);
        p1.estaAberta();        
//////////////////////////////////////////////////////////////////////////////////////////////////// 
        p1.abre();
        
        p1.pinta("Azul");
        
        System.out.println("\nDomensões da porta: "+p1.dimensaoX+" "+p1.dimensaoY+" "+p1.dimensaoZ);
        System.out.println("Cor da porta: "+p1.cor);
        p1.estaAberta();  
////////////////////////////////////////////////////////////////////////////////////////////////////         
    }
}
