public class TestaFuncionarioV1 {
    public static void main(String[] args){
        //////////////////////////
        FuncionarioV1 f1 = new FuncionarioV1 ();
        f1.nome = "Fernando Augusto Rabelo de Vasconcelos";
        f1.rg = "17.659.222";
        f1.departamento = "Vendas";
        f1.salario = 1505.00;
        f1.dataDeEntrada = "02/02/2018";
        f1.ativo = true;
        /////////////////////////
        f1.bonifica(0.1); //aumenta salário em 10%
        f1.demite();      //demite o funcionário
        /////////////////////////
        System.out.println("Sistema Gerenciador de Funcionários do Banco\n ****************************************************");
        System.out.println( "\nNome: "+f1.nome+
                            "\nRG: "+f1.rg+
                            "\nDepartamento: "+f1.departamento+
                            "\nSalário: "+f1.salario+
                            "\nData de entrada: "+f1.dataDeEntrada+
                            "\nEstatus: "+f1.ativo+"\n****************************************************");
    }
                       
 }

