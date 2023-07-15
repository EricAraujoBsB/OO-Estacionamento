import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		String strA = JOptionPane.showInputDialog("Informe a operação desejada: "
												+ "1- Cadastro de Estacionamento;"
												+ "2- Editar Estacionamento"
												+ "3- Deletar Estacionamento"
												+ "4- Cadastrar Acesso"
												+ "5- Cadastrar Evento");
		int a = Integer.parseInt(strA);
		
		Estacionamento[] estacionamentoGeral = new Estacionamento[10];
		switch(a) {
			case 1:
				String strC = JOptionPane.showInputDialog("Informe a Capacidade máxima do Estacionamento");
				int capacidade = Integer.parseInt(strC);
				String strLocal = JOptionPane.showInputDialog("Informe o local do Evento");
				
				//Construtor de Estacionamento agora precisa de horario entrada/horario saida @EricAraujoBsB
				//requisitar horarios do usuario @EricAraujoBsB
				// instanciar os horarios como objetos de HORARIO @EricAraujoBsB
				Estacionamento e1 = new Estacionamento(capacidade, strLocal);
				
				String strV1 = JOptionPane.showInputDialog("Informe o valor da hora do estacionamento");
				float v1 = Float.parseFloat(strV1);
				float v2 = v1/4;
				String strV3 = JOptionPane.showInputDialog("Informe o valor da diaria");
				float v3 = Float.parseFloat(strV3);
				String strV4 = JOptionPane.showInputDialog("Informe o valor da diaria noturna");
				float v4 = Float.parseFloat(strV4);
				String strV5 = JOptionPane.showInputDialog("Informe o valor da mensalidade para usuarios mensalistas");
				float v5 = Float.parseFloat(strV5);
				String strV6 = JOptionPane.showInputDialog("Informe o valor da entrada para eventos");
				float v6 = Float.parseFloat(strV6);
				
				e1.cadastrarValoresEstacionamento(v1, v2, v3, v4, v5, v6);
				
				for(int i; i>=10; i++) {
					if(estacionamentoGeral[i] != null) {
						estacionamentoGeral[i] = e1;				
					}
					else {
						i++;
					}
				}
			break;
			case 2:
				String strAuxiliar = "";
				for(int i; i>=10; i++) {
						 strAuxiliar += i + estacionamentoGeral[i].getLocal() + "\n";
				}
				String strAux = JOptionPane.showInputDialog("Informe a numeracao do estacionamento que deseja editar de acordo com a lista exibida"
														+ strAuxiliar);
				int auxiliar = Integer.parseInt(strAux);
				
				String str1 = JOptionPane.showInputDialog("Informe qual alteração deseja fazer:"
														+ "1- Alterar Capacidade"
														+ "2- Alterar Local");
				int a1 = Integer.parseInt(str1);
				
				switch(a1){
					case 1:
						String str2 = JOptionPane.showInputDialog("Informe o novo valor da capacidade");
						int a2 = Integer.parseInt(str2);
						estacionamentoGeral[auxiliar].setCapacidade(a2);
					break;
					case 2:
						String str3 = JOptionPane.showInputDialog("Informe o novo Local");
						estacionamentoGeral[auxiliar].setLocal(str3);
					break;
				}
			break;
			case 3:
				for(int i; i>=10; i++) {
					 strAuxiliar = i + estacionamentoGeral[i].getLocal() + "\n";
				}
				String StrAux = JOptionPane.showInputDialog("Informe a numeracao do estacionamento que deseja deletar de acordo com a lista exibida"
														+ strAuxiliar);
				auxiliar = Integer.parseInt(strAux);
				
				estacionamentoGeral[auxiliar] = null;
				
				JOptionPane.showMessageDialog(null, "O Estacionamento foi deletado com sucesso");
			break;
			case 4:
				String strAux1 = JOptionPane.showInputDialog("Informe a placa do automovel");
				String strAux2 = JOptionPane.showInputDialog("Informe a hora da entrada (somente a hora inteira)");
				int aux2 = Integer.parseInt(strAux2);
				String strAux3 = JOptionPane.showInputDialog("Informe os minutos da entrada");
				int aux3 = Integer.parseInt(strAux3);
				String strAux4 = JOptionPane.showInputDialog("Informe a hora da saida (somente a hora inteira)");
				int aux4 = Integer.parseInt(strAux4);
				String strAux5= JOptionPane.showInputDialog("Informe os minutos da saida");
				int aux5 = Integer.parseInt(strAux5);
				String strAux6 = JOptionPane.showInputDialog("Informe o ano da data da entrada (somente a numeracao relativa ao ano inteira)");
				int aux6 = Integer.parseInt(strAux6);
				String strAux7 = JOptionPane.showInputDialog("Informe o mes que ocorreu a entrada (somente numeros)");
				int aux7 = Integer.parseInt(strAux7);
				String strAux8 = JOptionPane.showInputDialog("Informe o dia que ocorreu a entrada");
				int aux8 = Integer.parseInt(strAux8);
				String strAux9 = JOptionPane.showInputDialog("Informe o ano da data da saida (somente a numeracao relativa ao ano inteira)");
				int aux9 = Integer.parseInt(strAux9);
				String strAux10 = JOptionPane.showInputDialog("Informe o mes que ocorreu a saida (somente numeros)");
				int aux10 = Integer.parseInt(strAux10);
				String strAux11 = JOptionPane.showInputDialog("Informe o dia que ocorreu a saida");
				int aux11 = Integer.parseInt(strAux11);
				
				Horario horaEntrada = new Horario(aux2, aux3);
				Horario horaSaida = new Horario(aux4, aux5);
				Data dataEntrada = new Data(aux6, aux7, aux8);
				Data dataSaida = new Data(aux9, aux10, aux11);
				
				strAuxiliar = "";
				for(int i; i>=10; i++) {
					if(estacionamentoGeral[i] != null) {
						strAuxiliar += i + estacionamentoGeral[i].getLocal() + "\n";
					}
				}
				StrAux = JOptionPane.showInputDialog("Informe a numeracao do estacionamento que deseja cadastrar o acesso de acordo com a lista exibida"
														+ strAuxiliar);
				auxiliar = Integer.parseInt(strAux);
				
				estacionamentoGeral[auxiliar].cadastrarAcesso(strAux1, horaEntrada, horaSaida, dataEntrada, dataSaida);
				
				JOptionPane.showMessageDialog(null, "Acesso cadastrado com sucesso");
			break;
			case 5:
				String StrAux1 = JOptionPane.showInputDialog("Informe o nome do Evento");
				String StrAux2 = JOptionPane.showInputDialog("Informe o ano da data de inicio do evento (somente a numeracao relativa ao ano inteira)");
				aux2 = Integer.parseInt(strAux2);
				String StrAux3 = JOptionPane.showInputDialog("Informe o mes que ocorreu o incio do evento(somente numeros)");
				aux3 = Integer.parseInt(strAux3);
				String StrAux4 = JOptionPane.showInputDialog("Informe o dia que ocorreu o inicio do evento");
				aux4 = Integer.parseInt(strAux4);
				String StrAux5 = JOptionPane.showInputDialog("Informe o ano da data de termino do evento (somente a numeracao relativa ao ano inteira)");
				aux5 = Integer.parseInt(strAux5);
				String StrAux6 = JOptionPane.showInputDialog("Informe o mes que ocorreu o termino do evento(somente numeros)");
				aux6 = Integer.parseInt(strAux6);
				String StrAux7 = JOptionPane.showInputDialog("Informe o dia que ocorreu o termino do evento");
				aux7 = Integer.parseInt(strAux7);
				String StrAux8 = JOptionPane.showInputDialog("Informe a hora de inicio do evento (somente a hora inteira)");
				aux8 = Integer.parseInt(strAux8);
				String StrAux9 = JOptionPane.showInputDialog("Informe os minutos de inicio do evento");
				aux9 = Integer.parseInt(strAux9);
				String StrAux10 = JOptionPane.showInputDialog("Informe a hora da saida do evento (somente a hora inteira)");
				aux10 = Integer.parseInt(strAux10);
				String StrAux11 = JOptionPane.showInputDialog("Informe os minutos de termino do evento");
				aux11 = Integer.parseInt(strAux11);
				
				Data dataInicio = new Data(aux2, aux3, aux4);
				Data dataFim = new Data(aux5, aux6, aux7);
				Horario horaInicio = new Horario(aux8, aux9);
				Horario horaFim = new Horario(aux10, aux11);
				
				strAuxiliar = "";
				for(int i; i>=10; i++) {
					if(estacionamentoGeral[i] != null) {
						strAuxiliar += i + estacionamentoGeral[i].getLocal() + "\n";
					}
				}
				strAux = JOptionPane.showInputDialog("Informe a numeracao do estacionamento que deseja cadastrar o evento de acordo com a lista exibida"
														+ strAuxiliar);
					auxiliar = Integer.parseInt(strAux);
					
					//verificar ordem das entradas do metodo cadastrarEvento em Estacionamento @EricAraujoBsB
				estacionamentoGeral[auxiliar].cadastrarEvento(strAux1, dataInicio, dataFim, horaInicio, horaFim);
				
				JOptionPane.showMessageDialog(null, "evento cadastrado com sucesso");
			break;
		}
	}

}
