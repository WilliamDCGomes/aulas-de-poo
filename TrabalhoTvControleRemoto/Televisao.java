public class Televisao{
    public int volume;
    public int canal;
    
    public Televisao(int volume, int canal){
        this.volume = volume;
        this.canal = canal;
    }
    
    public String AumentarVolume(){
        if(volume==30){
            System.out.println("Volume máximo!");
        }
        else{
            volume++;
        }
        return "Volume Atual: " + volume;
    }
    public String DiminuirVolume(){
        if(volume==0){
            System.out.println("Volume mínimo!");
        }
        else{
            volume--;
        }
        return "Volume Atual: " + volume;
    }
    public String AumentarCanal(){
        if(canal==380){
            canal=1;
        }
        else{
            canal++;
        }
        return "Canal Atual: " + canal;
    }
    public String DiminuirCanal(){
        if(canal==1){
            canal=380;
        }
        else{
            canal--;
        }
        return "Canal Atual: " + canal;
    }
    public String TrocaCanal(int canalEscolhido){
        canal = canalEscolhido;
        return "Canal Atual: " + canal;
    }
    public String ConsultarInfo(){
        return "Canal Selecionado: " + canal + "\nVolume: " + volume;
    }
}
