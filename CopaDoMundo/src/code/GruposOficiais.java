package code;

import java.util.ArrayList;
import modelo.dao.SelecoesDAO;
import modelo.dto.SelecoesDTO;

public class GruposOficiais {
    
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
    
}