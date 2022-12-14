package code;

import java.util.ArrayList;
import modelo.dao.SelecoesDAO;
import modelo.dto.SelecoesDTO;
import java.util.Random;


public class SimulacaoCode {

    SelecoesDAO selecao = new SelecoesDAO();
    ArrayList<SelecoesDTO> lista = selecao.selecoesLista();

    public String grupoA[] = {
        lista.get(8).toString(), //Catar
        lista.get(13).toString(), //Equador 
        lista.get(27).toString(), //Senegal
        lista.get(18).toString()}; //Holanda
        
    
    public String grupoB[] = {
        lista.get(19).toString(), //Inglaterra
        lista.get(20).toString(), //Irã
        lista.get(15).toString(), //Estados Unidos
        lista.get(24).toString()}; //Pais de Gales

    public String grupoC[] = {
        lista.get(2).toString(), //Argentina
        lista.get(1).toString(), //Arabia Saudita
        lista.get(23).toString(), //Mexico
        lista.get(25).toString()}; //Polonia

    public String grupoD[] = {
        lista.get(16).toString(), //Franca
        lista.get(3).toString(), //Australia
        lista.get(12).toString(), //Dinamarca
        lista.get(30).toString()}; //Tunisia

    public String grupoE[] = {
        lista.get(14).toString(), //Espanha
        lista.get(10).toString(), //Costa Rica
        lista.get(0).toString(), //Alemanha
        lista.get(21).toString()}; //Japao

    public String grupoF[] = {
        lista.get(4).toString(), //Belgica
        lista.get(7).toString(), //Canada
        lista.get(22).toString(), //Marrocos
        lista.get(11).toString()}; //Croacia

    public String grupoG[] = {
        lista.get(5).toString(), //Brasil
        lista.get(28).toString(), //Servia
        lista.get(29).toString(), //Suica
        lista.get(6).toString()}; //Camaroes

    public String grupoH[] = {
        lista.get(26).toString(), //Portugal
        lista.get(17).toString(), //Gana
        lista.get(31).toString(), //Uruguai
        lista.get(9).toString()}; //Coreia do Sul

    public ArrayList<String> faseDeGrupos(String grupo[]) {
        String timeUm = grupo[0];
        String timeDois = grupo[1];
        String timeTres = grupo[2];
        String timeQuatro = grupo[3];
        int primeiroDoGrupo = 0;
        int segundoDoGrupo = 0;
        ArrayList<String> vencedores = new ArrayList<>();

        int saldos[] = new int[4];

        ArrayList<String> faseDeGruposJogosUm = this.partidas(timeUm, timeDois);

        if (faseDeGruposJogosUm.get(0).equals(timeUm)) {
            saldos[0] += 3;
        } else if (faseDeGruposJogosUm.get(0).equals(timeDois)) {
            saldos[1] += 3;
        }

        ArrayList<String> faseDeGruposJogosDois = this.partidas(timeUm, timeTres);
        if (faseDeGruposJogosDois.get(0).equals(timeUm)) {
            saldos[0] += 3;
        } else if (faseDeGruposJogosDois.get(0).equals(timeTres)) {
            saldos[2] += 3;
        }

        ArrayList<String> faseDeGruposJogosTres = this.partidas(timeUm, timeQuatro);
        if (faseDeGruposJogosTres.get(0).equals(timeUm)) {
            saldos[0] += 3;
        } else if (faseDeGruposJogosTres.get(0).equals(timeQuatro)) {
            saldos[3] += 3;
        }

        ArrayList<String> faseDeGruposJogosQuatro = this.partidas(timeDois, timeTres);
        if (faseDeGruposJogosQuatro.get(0).equals(timeDois)) {
            saldos[1] += 3;
        } else if (faseDeGruposJogosQuatro.get(0).equals(timeTres)) {
            saldos[2] += 3;
        }

        ArrayList<String> faseDeGruposJogosCinco = this.partidas(timeDois, timeQuatro);
        if (faseDeGruposJogosCinco.get(0).equals(timeDois)) {
            saldos[1] += 3;
        } else if (faseDeGruposJogosCinco.get(0).equals(timeQuatro)) {
            saldos[3] += 3;
        }

        ArrayList<String> faseDeGruposJogosSeis = this.partidas(timeTres, timeQuatro);
        if (faseDeGruposJogosSeis.get(0).equals(timeTres)) {
            saldos[2] += 3;
        } else if (faseDeGruposJogosSeis.get(0).equals(timeQuatro)) {
            saldos[3] += 3;
        }

        for (int i = 0; i < saldos.length; i++) {
            if (saldos[i] > saldos[primeiroDoGrupo]) {
                primeiroDoGrupo = i;

            }
        }

        saldos[primeiroDoGrupo] = -1;

        for (int i = 0; i < saldos.length; i++) {
            if (saldos[i] > saldos[segundoDoGrupo]) {
                segundoDoGrupo = i;

            }
        }

        vencedores.add(0, grupo[primeiroDoGrupo]);
        vencedores.add(1, grupo[segundoDoGrupo]);

        return vencedores;

    }

    public ArrayList<String> partidas(String timeUm, String timeDois) {
        Random gerador = new Random();

        int qntGolsTimeUm;
        int qntGolsTimeDois;

        ArrayList<String> resultado = new ArrayList<>();

        do {
            qntGolsTimeUm = gerador.nextInt(4);
            qntGolsTimeDois = gerador.nextInt(4);

        } while (qntGolsTimeUm == qntGolsTimeDois);

        if (qntGolsTimeUm > qntGolsTimeDois) {
            resultado.add(0, timeUm);
            resultado.add(1, String.valueOf(qntGolsTimeUm));
            resultado.add(2, String.valueOf(qntGolsTimeDois));

        } else if (qntGolsTimeDois > qntGolsTimeUm) {
            resultado.add(0, timeDois);
            resultado.add(1, String.valueOf(qntGolsTimeUm));
            resultado.add(2, String.valueOf(qntGolsTimeDois));
        }

        return resultado;

    }

}
