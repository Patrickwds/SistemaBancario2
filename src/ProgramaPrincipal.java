import java.util.Scanner;
import java.util.Vector;

public class ProgramaPrincipal {

	private static final String CONTINUAR = "S";
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			
		System.out.println("----------------------");
		
		String nomeDoCliente;
		String numeroAgencia;
		String numeroConta;
		double SaldoDigitado;
		ContaCorrente contaDoCliente;
		String continuar = "S";
		
		Vector<ContaCorrente> NovaConta = new Vector<ContaCorrente>();
		
		while(CONTINUAR.equalsIgnoreCase(continuar)){
			
				System.out.println("Digite o nome:");
				nomeDoCliente = entrada.nextLine();
				System.out.println("Digite numero de agencia:");
				numeroAgencia = entrada.nextLine();
				System.out.println("Digite numero de conta:");
				numeroConta = entrada.nextLine();
				System.out.println("Digite o saldo atual:");
				SaldoDigitado = Double.parseDouble(entrada.nextLine());
			
			
				contaDoCliente = new ContaCorrente();
				
				contaDoCliente.cliente.setNome(new String(nomeDoCliente));
				contaDoCliente.numeroDaAgencia = (numeroAgencia);
				contaDoCliente.numeroDaConta = (numeroConta);
				contaDoCliente.setSaldo((SaldoDigitado));
	
				NovaConta.add(contaDoCliente);

				for(int i= 0; i< NovaConta.size(); i++){
					ContaCorrente conta = NovaConta.get(i);
					System.out.println("Nome do Usuario: " +conta.cliente.getNome());
					System.out.println("Numero da agencia: " +conta.numeroDaAgencia);
					System.out.println("Numero da conta: " +conta.numeroDaConta);
					System.out.println("Saldo: " +contaDoCliente.getSaldo());
				}				
				
				System.out.println("Cliente "+contaDoCliente.cliente.getNome() + " saldo: " +contaDoCliente.getSaldo());
				
				boolean sucesso = contaDoCliente.sacar(200.0);
				
				if(sucesso){
					System.out.println("Saque realizado com sucesso!");
				}else{
					System.out.println("Não foi possivel efetuar o saque");
				}
				
				System.out.println("Cliente "+contaDoCliente.cliente.getNome() +" saldo: " +contaDoCliente.getSaldo());
				
				
				
				System.out.println("continuar");
				continuar = entrada.nextLine();		
				

			}	


			//ContaCorrente contaDaMaria;
			//contaDaMaria = new ContaCorrente();

			//contaDaMaria.nome = new String("Maria da Silva");
			//contaDaMaria.numeroDaAgencia = "4858-X";
			//contaDaMaria.numeroDaConta = "26976-5";
			//contaDaMaria.saldo = 200;

			//System.out.println("Nome do cliente: "+ contaDaMaria.nome);
			//System.out.println("Saldo do cliente: "+ contaDaMaria.saldo);

	}

}
