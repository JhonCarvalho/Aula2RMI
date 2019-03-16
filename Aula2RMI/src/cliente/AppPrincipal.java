package cliente;

import java.rmi.Naming;

public class AppPrincipal {

	public static void main(String[] args) {
		IServicoRemoto objPessoa = (IServicoRemoto) Naming.lookup("rmi://localhost:8282/pessoa");
		
		Professo
	}
}
