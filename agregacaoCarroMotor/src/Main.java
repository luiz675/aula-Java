//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Motor motor1 = new Motor("FORD", "FlEX", 1.6f);
        Carro fordKa = new Carro("Ford Ka", "FORD", "ABC4F66");

        fordKa.adicionarMotor(motor1);//aqui ocorre a agregação

        System.out.println(fordKa.getModelo() + " " +
                "" + fordKa.getMotor().getCilindradas());

        System.out.print("\n**************************************************\n");
        System.out.println(fordKa.detalharCarro());

        Roda rodaN = new Roda("Pirelli", "17", "normal");
        Roda rodaN1 = new Roda("Goodyear", "17", "normal");
        Roda rodaS = new Roda("Pirelli", "17", "Step");

        fordKa.adicionarRoda(rodaN);//0
        fordKa.adicionarRoda(rodaN);//1
        fordKa.adicionarRoda(rodaN);//2
        fordKa.adicionarRoda(rodaN);//3
        fordKa.adicionarRoda(rodaS);//4
        fordKa.adicionarRoda(rodaS);//5

        fordKa.listarRodas();
        fordKa.alterarRoda(rodaN1, 3);
        fordKa.removerRoda(5);
        fordKa.listarRodas();
    }
}



