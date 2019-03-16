package cliente;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import comum.IServicoRemoto;
import comum.Professor;

public class AppPrincipal {

	public static void main(String[] args) {
		
		try {
		IServicoRemoto objPessoa = (IServicoRemoto) Naming.lookup("rmi://localhost:8282/pessoa");
		
		Professor p1 = new Professor();
		
		p1.setId(1);
		p1.setNome("Pedro");
		p1.setTelefone("(11) 1236-4456");
		p1.setCidade("Araraquara");
		
		Professor p2 = new Professor();
		
		p2.setId(2);
		p2.setNome("Pedro2");
		p2.setTelefone("(22) 1236-4456");
		p2.setCidade("Araraquara2");
		
		objPessoa.inserir(p1);
		objPessoa.inserir(p2);
		}catch (MalformedURLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (RemoteException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (NotBoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
	}
}
