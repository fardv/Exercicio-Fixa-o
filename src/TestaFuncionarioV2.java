public class TestaFuncionarioV2 {
    public static void main(String[] args){
        //////////////////////////
        FuncionarioV2 f2 = new FuncionarioV2 ();
        f2.nome = "Lara do Santos";
        f2.rg = "10.582.554";
        f2.departamento = "Gerente";
        f2.salario = 5000.00;
        f2.dataDeEntrada = "27/04/2018";
        f2.ativo = true;

        f2.mostrar();/*imprime os atributos*/
    }
}
    