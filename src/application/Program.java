/*Uma empresa deseja automatizar o processamento de seus contratos. O processamento de
um contrato consiste em gerar as parcelas a serem pagas para aquele contrato, com base no
número de meses desejado.
A empresa utiliza um serviço de pagamento online para realizar o pagamento das parcelas.
Os serviços de pagamento online tipicamente cobram um juro mensal, bem como uma taxa
por pagamento. Por enquanto, o serviço contratado pela empresa é o do Paypal, que aplica
juros simples de 1% a cada parcela, mais uma taxa de pagamento de 2%.
Fazer um programa para ler os dados de um contrato (número do contrato, data do contrato,
e valor total do contrato). Em seguida, o programa deve ler o número de meses para
parcelamento do contrato, e daí gerar os registros de parcelas a serem pagas (data e valor),
sendo a primeira parcela a ser paga um mês após a data do contrato, a segunda parcela dois
meses após o contrato e assim por diante. Mostrar os dados das parcelas na tela.*/



package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.TaxPaypal;

public class Program {

	public static void main(String[] args)  throws ParseException
	{
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com os Dados do Contrato#");
		
		System.out.print("Data (dd/mm/yyyy): ");
		Date date = sdf.parse(sc.nextLine());
		
		System.out.print("Valor do Contrato: ");
		double amountContract = sc.nextDouble();
		
		System.out.print("Entre com o numero de parcelas: ");
		int numberInstallments = sc.nextInt();
		
		Contract contract = new Contract(date, amountContract, numberInstallments);
		
		ContractService contractService = new ContractService(new TaxPaypal());
		//contract.processContract(new TaxPaypal());
		
		contractService.processContract(contract, numberInstallments);
		
		
		System.out.println("Installmesnts: ");
		for(Installment x : contract.getListInstallment()) {
			
			System.out.println(x);
		}
		
			
		sc.close();
	}

}
