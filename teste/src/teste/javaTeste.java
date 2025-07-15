package teste;

public class javaTeste {

	public static void main(String[] args) {
			
		class Conta {
			private String numero;
			private String titular;
			private Double saldo;
			private Double limite;
			
			
			Conta(String numero, String titular, Double saldo, Double limite){
				this.numero = numero;
				this.titular = titular;
				this.saldo = saldo;
				this.limite = limite;
			}
			
			void depositar(Double valor) {
				if (valor > 0) {
					this.saldo += valor;
					System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
				}
			}
			
			void sacar(Double valor) {
				if (this.saldo >= valor) {
					this.saldo -= valor;
					System.out.println("Saque de R$" + valor + " realizado com sucesso.");
				} else if (valor <= this.saldo + limite){
					double restante = valor - this.saldo;
					this.saldo = 0.0;
					limite -= restante;
					System.out.println("Saque no valor de R$" + valor + " realizado com succeso, utilizando o limite.");
					System.out.println("Limite restante: R$" + limite);	
				} else {
					System.out.println("Saque negado! Saldo e limite insuficientes.");
				}
			}
			
			void transferir(Conta destino, Double valor) {
				if (this.saldo >= valor) {
					this.saldo -= valor;
					destino.saldo += valor * 5.88;
					System.out.println("Transferência de R$" + valor + " para " + destino.titular + " realizado com sucesso.");
			} else if (valor <= this.saldo + limite) {
				double restante = valor - this.saldo;
				this.saldo = 0.0;
				limite -= restante;
				System.out.println("Tranferência no valor de R$" + valor + " realizado com succeso, utilizando o limite.");
				System.out.println("Limite restante: R$" + limite);	
			} else {
				System.out.println("Não foi possível realizar a transferência. Saldo e limite insuficientes.");
			}
		}
}
		
		Conta joao = new Conta("12345", "João Santos", 1000.00, 100.0);
		Conta maria = new Conta("54321", "Maria Souza", 0.00, 0.0);
		
		joao.transferir(maria, 100.0);
		
		
		System.out.println("Saldo final de João: R$" + joao.saldo + " | limite: " + joao.limite);
		System.out.println("Saldo final de Maria: R$" + maria.saldo + " | limite: " + maria.limite);
		
		
	}

}

