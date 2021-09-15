import java.sql.Array;
import java.util.ArrayList;

public class TorreDeControle {

    private Voador[] voadores = new Voador[15];


    public void adicionarVoador(Voador umVoador){
        for(int i = 0; i < voadores.length;i++){
            if(voadores[i]== null){
                voadores[i] = umVoador;
                break;
            }
        }
    }
    public void voemTodos(){
        for(int i = 0; i < voadores.length;i++){
            if(voadores[i]== null){
                break;
            }else{
                voadores[i].voar();
            }
        }
    }
}
