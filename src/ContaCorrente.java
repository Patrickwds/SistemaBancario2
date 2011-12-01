
public class ContaCorrente {
	
	Cliente cliente = new Cliente();
	String numeroDaConta;
	String numeroDaAgencia;
	private Double saldo;
	double limite = 100.0;
	boolean premiada = true;
	
	public boolean sacar(double valor){
		if(saldo + limite>= valor){
			saldo = saldo - valor;
			return true;
		}else{
			return false;
		}
	}
	public void depositar(double valor){
		saldo = saldo + valor;
	}
	public void transferir(ContaCorrente outraConta,double valor){
		sacar(valor);
		outraConta.depositar(valor);
	}
	public double getSaldo(){
		return saldo;
	}
	public void setSaldo(double saldoInformado){
		saldo = saldoInformado;
	}
}