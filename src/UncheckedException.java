import javax.swing.*;  // necessário para JOptionPane

// Fazer a divisão de 2 valores inteiros
public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLoop = true;

        do {
            String a = JOptionPane.showInputDialog("Numerador: ");  // janela gráfica para input
            String b = JOptionPane.showInputDialog("Denominador: ");

            try{  // parte que pode ocorrer a exception fica dentro do try
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLoop = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro! " + e.getMessage());
                // e.printStackTrace();  // a leitura do StackTrace é feita de baixo para cima
            } catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null, "Impossível dividir um número por 0. " + e.getMessage());
            }

            finally {
                System.out.println("Chegou no finally!");
            }
        } while(continueLoop);

        System.out.println("O código continua...");
    }

    public static int dividir (int a, int b) { return a/b; }
}
