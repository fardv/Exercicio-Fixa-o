public class TestaFuncionarioV3 {
    public static void main(String[] args){
        //////////////////////////
        FuncionarioV3 f3 = new FuncionarioV3 ();
        f3.nome = "Laurita Rabelo";
        f3.rg = "27.855.547";
        f3.departamento = "Gerenciamento de Vendas";
        f3.salario = 5800.00;
        f3.ativo = true;
        
        Data d = new Data();
        d.dia = 15;
        d.mes = 02;
        d.ano = 2018;  
        
        f3.mostra();
        System.out.println("Data de entrada: "+d.dia+"/"+d.mes+"/"+d.ano);
        
     }
}